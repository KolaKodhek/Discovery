package com.example.discover

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.discover.databinding.ActivitySigninBinding
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.auth.FirebaseAuth


class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySigninBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
//       // firebaseFirestore = FirebaseFirestore.getInstance()
//        firebaseAuth= FirebaseAuth.getInstance()
//       // firebase.
//
//        binding.SigInBtn.setOnClickListener {
//            val email= binding.etSignInEmail.editText?.text.toString().trim()
//            val password = binding.etSignInPassword.editText?.text.toString().trim()
//
//            if (email.isEmpty()){
//                //toast("Please enter Email address")
//                Toast.makeText(this,"Please enter Email address",Toast.LENGTH_SHORT).show()
//
//            }else if (password.isEmpty()){
//                //toast("Please enter Password")
//                Toast.makeText(this,"Please enter Password",Toast.LENGTH_SHORT).show()
//
//            }else{
//                firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener {
//                    if (it.isSuccessful){
//                        val intent=Intent(this, MainActivity::class.java)
//                        startActivity(intent)
//                    }else{
//                        Toast.makeText(this,it.exception.toString(),Toast.LENGTH_SHORT).show()
//                    }
//                }
//            }
//
//        }
//        binding.forgotPassword.setOnClickListener {
//            val intent=Intent(this,ResetPasswordActivity::class.java)
//            startActivity(intent)
//        }
//
//        binding.toSignup.setOnClickListener {
//            val intent=Intent(this,SignupActivity::class.java)
//            startActivity(intent)
//        }


    }
}