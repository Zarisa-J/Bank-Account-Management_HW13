package com.zarisa.bankaccountmanagement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }
}

//// Get input text
//val inputText = outlinedTextField.editText?.text.toString()
//
//outlinedTextField.editText?.doOnTextChanged { inputText, _, _, _ ->
//    // Respond to input text change
//}