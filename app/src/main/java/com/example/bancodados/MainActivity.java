package com.example.bancodados;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.bancodados.databinding.ActivityMainBinding;
import com.example.bancodados.databinding.FragmentDataManipulationBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentDataManipulation fragmentDataManipulation = new FragmentDataManipulation();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container_main, fragmentDataManipulation).commit();
    }
}