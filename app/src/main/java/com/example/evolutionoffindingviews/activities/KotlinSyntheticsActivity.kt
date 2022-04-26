package com.example.evolutionoffindingviews.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.evolutionoffindingviews.R
import kotlinx.android.synthetic.main.activity_kotlin_synthetics.*

class KotlinSyntheticsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_synthetics)
        initViews()
    }

    private fun initViews() {
        btn_synthetics.setOnClickListener {
            tv_synthetics.text = getString(R.string.app_name)
        }
    }
}
