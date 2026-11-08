package com.kevintimus.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.kevintimus.fragments.databinding.FragmentPrimeraBinding

class PrimeraFragment : Fragment(R.layout.fragment_primera) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentPrimeraBinding.bind(view)

        binding.boton1.setOnClickListener { ir(Estoy1Fragment()) }
        binding.boton2.setOnClickListener { ir(Estoy2Fragment()) }
    }

    private fun ir(fragment: Fragment) {
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}