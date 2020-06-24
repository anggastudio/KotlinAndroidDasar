package com.anggastudio.kotlinandroiddasarprep

import android.os.Bundle
import com.esafirm.imagepicker.features.ImagePicker
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        ivAvatar.setOnClickListener { openImagePicker() }
        btnSignOut.setOnClickListener { signOut() }
    }

    private fun openImagePicker() {
        ImagePicker.create(this) // Activity or Fragment
            .start();
    }

    private fun signOut() {
        gotoLoginActivity();
    }

}