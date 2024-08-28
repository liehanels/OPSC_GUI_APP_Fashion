package com.example.app_ui_design

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class ProductGridFragment : Fragment() {
    private lateinit var btnMaps: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_product_grid, container, false)
        btnMaps = view.findViewById(R.id.btnMaps)
        btnMaps.setOnClickListener{
            val intent = Intent(activity, MapsFragment::class.java)
            startActivity(intent)
        }
        return view;
    }
}