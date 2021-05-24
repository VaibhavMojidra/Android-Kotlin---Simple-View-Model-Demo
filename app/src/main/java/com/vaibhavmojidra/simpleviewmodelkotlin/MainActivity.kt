package com.vaibhavmojidra.simpleviewmodelkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.vaibhavmojidra.simpleviewmodelkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel=ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.apply {
            count.text=viewModel.getCurrentCount().toString()
            button.setOnClickListener { count.text=viewModel.getUpdatedCount().toString() }
        }
    }
}