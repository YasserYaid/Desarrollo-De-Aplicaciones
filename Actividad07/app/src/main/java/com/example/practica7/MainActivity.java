package com.example.practica7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.practica7.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.eqRecycler.setLayoutManager(new Linear LayoutManager(this));


    }
}