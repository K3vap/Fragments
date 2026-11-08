package com.kevintimus.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback


class FinalFragment : Fragment(R.layout.fragment_final) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            parentFragmentManager.popBackStack(
                null, FragmentManager.POP_BACK_STACK_INCLUSIVE
            )
        }
    }
}