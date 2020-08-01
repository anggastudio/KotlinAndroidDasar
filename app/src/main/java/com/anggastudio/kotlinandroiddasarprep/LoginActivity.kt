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
            password.isEmpty() -> showAlert("Password Field Error", "Password is empty!")
            else -> checkCredential(username, password)
        }

    }

    private fun checkCredential(username: String, password: String) {
        val userList = UserDummy.getUserList()
        var isUserExist = false
        var isPasswordMatch = false
        userList.map {
            if (it.username == username) {
                isUserExist = true
                if (it.password == password) {
                    isPasswordMatch = true
                    login(it)
                }
            }
        }
        if (!isUserExist) showAlert("Error", "Username '$username' is not Exist")
        if (isUserExist && !isPasswordMatch) showAlert(
            "Error",
            "Password for '$username' is not match"
        )
    }

    private fun login(user: User) {
        gotoProfileActivity(user)
    }

}