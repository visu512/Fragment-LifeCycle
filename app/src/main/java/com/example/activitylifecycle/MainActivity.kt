package com.example.activitylifecycle

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var openFragment : Button  = findViewById<Button>(R.id.btn)

        openFragment.setOnClickListener {

            val fragment = BlankFragment()

            val tr:FragmentTransaction = supportFragmentManager.beginTransaction()
            tr.replace(R.id.frameLayout,fragment)
            tr.addToBackStack(null)
            tr.commit()

        }


    }
}