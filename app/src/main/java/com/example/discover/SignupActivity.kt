package com.example.discover

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.discover.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth

class SignupActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySignupBinding

    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        firebaseAuth= FirebaseAuth.getInstance()
//
//        binding.SigupBtn.setOnClickListener {
//            val email= binding.etSignupEmail.editText?.text.toString().trim()
//            val password = binding.etSignupPassword.editText?.text.toString().trim()
//            val confirmPassword= binding.etSignupConfirmPassword.editText?.text.toString().trim()
//
//            if (email.isEmpty()){
//                //toast("Please enter Email address")
//                Toast.makeText(this,"Please enter Email address",Toast.LENGTH_SHORT).show()
//
//            }else if (password.isEmpty()){
//                //toast("Please enter Password")
//                Toast.makeText(this,"Please enter Password",Toast.LENGTH_SHORT).show()
//
//            }else if (confirmPassword.isEmpty()){
//                //toast("Please Confirm Password")
//                Toast.makeText(this,"Please Confirm Password",Toast.LENGTH_SHORT).show()
//
//            }else{
//                if (password == confirmPassword){
//                    firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener {
//                        if (it.isSuccessful){
//                            val intent= Intent(this,SignInActivity::class.java)
//                            startActivity(intent)
//                        }else{
//                            Toast.makeText(this,it.exception.toString(),Toast.LENGTH_SHORT).show()
//                        }
//                    }
//                }else {
//                    //toast("Password does not match")
//                    Toast.makeText(this,"Password does not match",Toast.LENGTH_SHORT).show()
//                }
//            }
//        }
//
//        binding.toSignIn.setOnClickListener {
//            val intent=Intent(this,SignInActivity::class.java)
//            startActivity(intent)
//        }
//    }
}