package com.example.ismobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onClick_Button_Login(View view){
        Toast.makeText(this, "Yey berhasil login", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LoginActivity.this,HomeFragment.class));
        finish();
    }
}