package com.example.fragmentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        val fragment1 = FirstFragment()
        val fragment2 = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameForFragments, fragment1)
            addToBackStack(null)
            commit()
        }

        activityMainBinding.apply {
            btnFragment1.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.frameForFragments, fragment1)
                    addToBackStack(null)
                    commit()
                }
            }
            btnFragment2.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.frameForFragments, fragment2)
                    addToBackStack(null)
                    commit()
                }
            }
        }

    }
}