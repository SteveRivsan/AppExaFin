package com.example.appexafin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class MainActivity : AppCompatActivity() {

    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var authStateListener: FirebaseAuth.AuthStateListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btningresar : Button = findViewById(R.id.btnLogin)
        val txtemail : TextView = findViewById(R.id.edtEmail)
        val txtpass : TextView = findViewById(R.id.edtPassword)
        firebaseAuth = Firebase.auth
        btningresar.setOnClickListener()
        {
            signIn(txtemail.text.toString(),txtpass.text.toString())
        }
    }
    private fun signIn(email: String, password: String)
    {
        firebaseAuth.signInWithEmailAndPassword(email,password)
            .addOnCompleteListener(this){ task ->
                if (task.isSuccessful){
                    val user = firebaseAuth.currentUser
                    Toast.makeText(baseContext,"Autenticacion exitosa", Toast.LENGTH_SHORT). show()
                    val i = Intent(this,RegistroActivity::class.java)
                    startActivity(i)
                }
                else
                {
                    Toast.makeText(baseContext,"Credenciales inválidas", Toast.LENGTH_SHORT). show()
                }
            }
    }
}

