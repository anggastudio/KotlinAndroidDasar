package com.anggastudio.kotlinandroiddasarprep

import android.content.Intent
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.esafirm.imagepicker.features.ImagePicker
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        tvFullName.setOnClickListener { editText("Edit Full Name", tvFullName.text.toString()) }
        tvEmail.setOnClickListener { editText("Edit Email", tvEmail.text.toString()) }
        ivAvatar.setOnClickListener { openImagePicker() }
        btnSignOut.setOnClickListener { signOut() }
    }

    private fun editText(title: String, textToEdit: String) {
        val editTextFragment = EditTextFragment.newInstance(title, textToEdit)
        editTextFragment.show(supportFragmentManager, "editTextFragment")
    }

    private fun openImagePicker() {
        ImagePicker.create(this) // Activity or Fragment
            .start();
    }

    private fun signOut() {
        gotoLoginActivity();
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (ImagePicker.shouldHandle(requestCode, resultCode, data)) {
            val image = ImagePicker.getFirstImageOrNull(data)
            Glide.with(this)
                .load(image.path)
                .transform(CircleCrop())
                .into(ivAvatar)
        }
        super.onActivityResult(requestCode, resultCode, data)
    }

}