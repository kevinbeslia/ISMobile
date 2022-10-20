package com.example.ismobile.activity;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.ismobile.R;
import com.google.android.material.tabs.TabLayout;

import com.example.ismobile.fragment.ProfileFragment;

public class UbahProfilActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubah_profil);

        getSupportFragmentManager().beginTransaction().add(R.id.profileFragment, new ProfileFragment());
    }


}