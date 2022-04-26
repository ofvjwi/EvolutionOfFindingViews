package com.example.evolutionoffindingviews.activities

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import butterknife.BindView
import butterknife.ButterKnife
import com.example.evolutionoffindingviews.R

@SuppressLint("NonConstantResourceId")
class ButterKnifeActivity : AppCompatActivity() {


    @BindView(R.id.tv_butter)
    private lateinit var textViewButter: TextView

    @BindView(R.id.btn_butter)
    private lateinit var buttonButter: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_butter_knife)
        ButterKnife.bind(this)
        initViews()
    }

    private fun initViews() {
        buttonButter.setOnClickListener {
            textViewButter.text = getString(R.string.app_name)
        }
    }
}

