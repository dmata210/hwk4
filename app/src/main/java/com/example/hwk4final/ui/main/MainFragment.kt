package com.example.hwk4final.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.hwk4final.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment(){

    companion object{
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                          savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment,container, false)
    }

    override fun OnActivityCreated(savedInstanceState: Bundle){
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        class observer: Observer<Int>{
            override fun onChanged(t: Int?){
                displaypproduct.text = t.toString()
            }
        }

        val temp = observer()

        viewModel.getResult().observe(viewLifecycleOwner, temp)

        button.setOnClickListener {
            if(firstnumber.text.isNotEmpty() && secondnumber.text.isNotEmpty()) {
                viewModel.multiply(firstnumber.text.toString(), secondnumber.text.toString())
            }
            else {
                displaypproduct.text = "No Product"
            }
        }
    }
}