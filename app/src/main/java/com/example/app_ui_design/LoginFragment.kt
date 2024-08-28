package com.example.app_ui_design

import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment() {
    private lateinit var btnLogin: Button
    private lateinit var btnBiometric: Button
    private lateinit var txtInputPasswordLogin: EditText

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.login_fragment, container, false)

        btnLogin = view.findViewById(R.id.btnLogin)
        btnBiometric = view.findViewById(R.id.btnBiometric)
        txtInputPasswordLogin = view.findViewById(R.id.txtInputPasswordLogin)

        btnLogin.setOnClickListener {
            Log.d("button clicked", "true")
            if (!isPasswordValid(txtInputPasswordLogin.text)) {
                txtInputPasswordLogin.error = "Error"
            } else {
                txtInputPasswordLogin.error = null
                Log.d("login success", "success")
                findNavController().navigate(R.id.ProductGridFragment)
            }
        }
        btnBiometric.setOnClickListener {

        }

        txtInputPasswordLogin.setOnKeyListener { _, _, _ ->
            if (isPasswordValid(txtInputPasswordLogin.text)) {
                txtInputPasswordLogin.error = null
            }
            false
        }

        return view
    }

    private fun isPasswordValid(text: Editable?): Boolean {
        return text != null && text.length >= 8
    }
}
