package com.anggastudio.kotlinandroiddasarprep

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener { validateCredential() }
    }

    private fun validateCredential() {
        val username = et_username.text.toString()
        val password = et_password.text.toString()

        when {
            username.isEmpty() -> showAlert("Username Field Error", "Username is empty!")
            username != "angga" -> showAlert("Username Field Error", "Username is wrong!")
            password.isEmpty() -> showAlert("Password Field Error", "Password is empty!")
            password != "123" -> showAlert("Password Field Error", "Password is wrong!")
            else -> login()
        }

    }

    private fun login() {
        gotoProfileActivity()
    }

}