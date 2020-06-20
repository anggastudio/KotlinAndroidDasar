package com.anggastudio.kotlinandroiddasarprep

import android.content.Intent
import android.os.Bundle
import android.os.Handler

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hideToolbar()
        setWhiteStatusBar()
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            gotoLoginActivity()
        }, 3000)
    }

    private fun gotoLoginActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

}