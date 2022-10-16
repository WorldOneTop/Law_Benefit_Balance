package com.worldonetop.lawbenefitbalance.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.worldonetop.lawbenefitbalance.databinding.FragmentOfferBinding


class OfferFragment : Fragment() {
    lateinit var binding: FragmentOfferBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOfferBinding.inflate(inflater, container, false)
        return binding.root
    }
}