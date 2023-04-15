package com.example.discover

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.discover.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //We employ the layout binding.
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //we want the home fragment to be the default fragment that is
        // launched whenever the application starts
        currentFragment(Home())

        binding.bottomNavigationView.setOnItemSelectedListener {
            //At this point we call our function currentFragment and use a when statement
            //to change the current fragment based on what the user clicks
            when(it.itemId){
                R.id.home_id->currentFragment(Home())
                R.id.add_id -> currentFragment(Addproduct())
                R.id.profile_id->currentFragment(Profile())
                else->{

                }
            }
            true
        }
    }
    //this is a function that helps us change the fragments using the fragment manager.
    private fun currentFragment(fragment:Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction= fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }
}