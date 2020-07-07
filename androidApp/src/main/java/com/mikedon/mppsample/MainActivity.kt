package com.mikedon.mppsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.mikedon.mppsample.databinding.ActivityMainBinding
import com.mikedon.shared.Settings

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val settings = Settings()
        mBinding.tvGreeting.text = settings.greeting()
    }
}