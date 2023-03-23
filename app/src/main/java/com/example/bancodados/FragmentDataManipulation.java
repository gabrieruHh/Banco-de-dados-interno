package com.example.bancodados;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bancodados.databinding.FragmentDataManipulationBinding;

public class FragmentDataManipulation extends Fragment {

    FragmentDataManipulationBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDataManipulationBinding.inflate(inflater, container, false);



        return binding.getRoot();
    }
}