package com.example.mobisoko;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationMenu;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    public BottomNavigationView BottomNavigationMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationMenu = findViewById(R.id.bottomNav);

        BottomNavigationView.OnNavigationItemReselectedListener navigationItemReselectedListener = new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch(item.getItemId()) {
                    case R.id.home:
                        Toast.makeText(MainActivity.this, "Home Page Selected", Toast.LENGTH_LONG).show();
                    case R.id.orders:
                        Toast.makeText(MainActivity.this, "Order Page Selected", Toast.LENGTH_LONG).show();
                    case R.id.profile:
                        Toast.makeText(MainActivity.this, "Profile Page Selected", Toast.LENGTH_LONG).show();
                }
            }
        };
    }
}