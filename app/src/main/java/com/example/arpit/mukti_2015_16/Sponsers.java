package com.example.arpit.mukti_2015_16;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by arpit on 24/1/16.
 */
public class Sponsers extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sponsers);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //setSupportActionBar(toolbar);
        toolbar.setLogo(R.drawable.home3);
        toolbar.setTitle("MUKTI 2016");


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);





    }

    @Override
    public void onBackPressed() {
        Intent myintent = new Intent(Sponsers.this, MainActivity.class);
        startActivity(myintent);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_home) {
            Intent myintent = new Intent(Sponsers.this, MainActivity.class);
            startActivity(myintent);
            finish();
            // Handle the camera action
        } else if (id == R.id.nav_Sponsers) {


        } else if (id == R.id.nav_onevents) {
            Intent myintent = new Intent(Sponsers.this, Online.class);
            startActivity(myintent);
            finish();

        } else if (id == R.id.nav_offevents) {
            Intent myintent = new Intent(Sponsers.this, Offline.class);
            startActivity(myintent);
            finish();

        } else if (id == R.id.nav_workshops) {
            Intent myintent = new Intent(Sponsers.this, Workshop.class);
            startActivity(myintent);
            finish();

        } else if (id == R.id.nav_lectures) {
            Intent myintent = new Intent(Sponsers.this, GuestSpeaker.class);
            startActivity(myintent);
            finish();


        }
        else if (id == R.id.Contacts) {
            Intent myintent = new Intent(Sponsers.this, Contact.class);
            startActivity(myintent);
            finish();


        }
        else if (id == R.id.nav_updates) {
            Intent myintent = new Intent(Sponsers.this, Updates.class);
            startActivity(myintent);
            finish();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
