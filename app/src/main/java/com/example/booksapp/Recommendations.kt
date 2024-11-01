package com.example.booksapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.examen2.R
import com.example.examen2.databinding.FragmentRecommendationsBinding

class Recommendations : Fragment(R.layout.fragment_recommendations) {

    private lateinit var binding: FragmentRecommendationsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentRecommendationsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.tvTexto.text = "Fragment Recommendations"

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recommendations, container, false)
    }
}