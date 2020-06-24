package com.anggastudio.kotlinandroiddasarprep

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        btnSignOut.setOnClickListener { signOut() }
    }

    private fun signOut() {
        gotoLoginActivity();
    }

}