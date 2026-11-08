package com.kevintimus.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.kevintimus.fragments.databinding.FragmentEstoy1Binding


class Estoy1Fragment : Fragment(R.layout.fragment_estoy1) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentEstoy1Binding.bind(view)

        binding.boton3.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FinalFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}