package com.anggastudio.kotlinandroiddasarprep

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_edit_text.*

private const val TITLE = "title"
private const val TEXT_TO_EDIT = "param1"

class EditTextFragment : DialogFragment() {

    private var mTitle: String? = null
    private var mTextToEdit: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            mTitle = it.getString(TITLE)
            mTextToEdit = it.getString(TEXT_TO_EDIT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit_text, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvTitle.text = mTitle
        etNewText.setText(mTextToEdit)
    }

    companion object {

        @JvmStatic
        fun newInstance(title: String, textToEdit: String) =
            EditTextFragment().apply {
                arguments = Bundle().apply {
                    putString(TITLE, title)
                    putString(TEXT_TO_EDIT, textToEdit)
                }
            }
    }
}