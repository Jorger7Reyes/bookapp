package com.example.booksapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.examen2.R
import com.example.examen2.databinding.FragmentMyRecommendationsBinding

class MyRecommendations : Fragment(R.layout.fragment_my_recommendations) {

    private lateinit var binding: FragmentMyRecommendationsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentMyRecommendationsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.tvTexto.text = "Fragment My Recommendations"

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_recommendations, container, false)
    }
}