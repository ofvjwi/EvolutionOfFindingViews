package com.example.evolutionoffindingviews.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.evolutionoffindingviews.R

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val buttonButterKnife = findViewById<Button>(R.id.btn_butter_knife)
        val buttonKotlinSynthetics = findViewById<Button>(R.id.btn_kotlin_synthetics)
        val buttonViewBinding = findViewById<Button>(R.id.btn_view_binding)

        buttonButterKnife.setOnClickListener(this)
        buttonKotlinSynthetics.setOnClickListener(this)
        buttonViewBinding.setOnClickListener(this)
    }

    private fun <T : AppCompatActivity> callAnyActivity(activity: Class<T>) {
        startActivity(Intent(this, activity::class.java))
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btn_butter_knife -> {
                callAnyActivity(ButterKnifeActivity::class.java)
            }
            R.id.btn_kotlin_synthetics -> {
                callAnyActivity(KotlinSyntheticsActivity::class.java)
            }
            R.id.btn_view_binding -> {
                callAnyActivity(ViewBindingActivity::class.java)
            }
        }
    }
}

