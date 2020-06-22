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
            username.isEmpty() -> showToast("username is empty")
            username != "angga" -> showToast("username is wrong")
            password.isEmpty() -> showToast("password is empty")
            password != "123" -> showToast("password is wrong")
            else -> login()
        }

    }

    private fun login() {
        gotoProfileActivity()
    }

}