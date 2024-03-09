package com.example.fragmentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragmentexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        replaceFragment(Clock_Fragment())

        binding.clock.setOnClickListener(){
            replaceFragment(Clock_Fragment())
        }
        binding.exam.setOnClickListener(){
            replaceFragment(Exam_Fragment())
        }
        binding.admitCard.setOnClickListener(){
            replaceFragment(AdmitCard_Fragment())
        }

    }

    private fun replaceFragment(fragment: Fragment){

    val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()

    }


}