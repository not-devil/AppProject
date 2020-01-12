package com.example.himibhayaproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    /* start drawable navigation bar java code*/
     DrawerLayout drawerLayout;
    Toolbar toolbar;
     NavigationView navigationView;
     ActionBarDrawerToggle toggle;

    /* end drawable navigation bar java code*/




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* start drawable navigation bar java code*/
        drawerLayout =findViewById(R.id.drawer);
        toolbar =findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigation);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toggle =new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawerOpen,R.string.drawerClose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        /* end drawable navigation bar java code*/

    }
    public void testActive (View view)
    {
        Intent intent = new Intent(this,test_main.class);
       startActivity(intent);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.home:
                Toast.makeText(MainActivity.this, "home", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Find:
                Toast.makeText(MainActivity.this, "Find", Toast.LENGTH_SHORT).show();
                break;
            case R.id.feedback:
                Toast.makeText(MainActivity.this, "feedback", Toast.LENGTH_SHORT).show();
                break;
            case R.id.share:
                Toast.makeText(MainActivity.this,  "share", Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting:
                Toast.makeText(MainActivity.this, "setting", Toast.LENGTH_SHORT).show();
                break;

        }
        return false;
    }
}
