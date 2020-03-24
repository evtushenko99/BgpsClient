package com.example.bgpsclient.presentation;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.bgpsclient.R;
import com.example.bgpsclient.presentation.Lab4.FragmentLab4;
import com.example.bgpsclient.presentation.Lab5.FragmentLab5;
import com.example.bgpsclient.presentation.Lab6.FragmentLab6;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, FragmentLab4.newInstance())
                .commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment selectedFragment = null;
        switch (item.getItemId()) {
            case R.id.navigation_lab_4:
                selectedFragment = new FragmentLab4();
                break;
            case R.id.navigation_lab_5:
                selectedFragment = new FragmentLab5();
                break;
            case R.id.navigation_lab_6:
                selectedFragment = new FragmentLab6();
                break;
        }
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, selectedFragment);
        transaction.commit();
        return true;
    }
}
