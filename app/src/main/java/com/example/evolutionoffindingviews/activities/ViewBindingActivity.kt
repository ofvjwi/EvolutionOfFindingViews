package com.example.evolutionoffindingviews.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.evolutionoffindingviews.R
import com.example.evolutionoffindingviews.databinding.ActivityViewBindingBinding

class ViewBindingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        binding.btnBinding.setOnClickListener {
            binding.tvBinding.text = getString(R.string.app_name)
        }
    }
}
