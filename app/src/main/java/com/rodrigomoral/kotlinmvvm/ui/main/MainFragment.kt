package com.rodrigomoral.kotlinmvvm.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.rodrigomoral.kotlinmvvm.R
import com.rodrigomoral.kotlinmvvm.databinding.MainFragmentBinding
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewDataBinding: MainFragmentBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        viewDataBinding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)
        return viewDataBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java).apply {
            count.observe(this@MainFragment, Observer { countTextView.text = it.toString() })
        }

        viewDataBinding.viewModel = viewModel
        button.setOnClickListener { viewModel.increaseCount() }
    }

}
