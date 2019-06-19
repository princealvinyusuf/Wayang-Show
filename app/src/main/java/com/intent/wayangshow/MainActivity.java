package com.intent.wayangshow;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener{
    private Button detail1, detail2, detail3, detail4;
    private Button share1, share2, share3, share4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        detail1 = (Button)findViewById(R.id.btn_set_detail);
        detail1.setOnClickListener(this);
        detail2 = (Button)findViewById(R.id.btn_set_details);
        detail2.setOnClickListener(this);
        detail3 = (Button)findViewById(R.id.btn_set_detailss);
        detail3.setOnClickListener(this);
        detail4 = (Button)findViewById(R.id.btn_set_detailsss);
        detail4.setOnClickListener(this);

        share1 = (Button)findViewById(R.id.btn_set_share);
        share1.setOnClickListener(this);
        share2 = (Button)findViewById(R.id.btn_set_shares);
        share2.setOnClickListener(this);
        share3 = (Button)findViewById(R.id.btn_set_sharess);
        share3.setOnClickListener(this);
        share4 = (Button)findViewById(R.id.btn_set_sharesss);
        share4.setOnClickListener(this);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
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
        if (id == R.id.jadwal) {
            Intent intent = new Intent(this, ListrikActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_daftar) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_jadwal) {
            Intent intent = new Intent(this, JadwalActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_terfavorite) {
            Intent intent = new Intent(this, FavoriteActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_share) {
            Toast.makeText(this, "Berhasil Dibagikan", Toast.LENGTH_SHORT).show();

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v){
        if (v.getId() == R.id.btn_set_detail){
            Intent intent = new Intent(this, ListrikActivity.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.btn_set_details){
            Intent intent = new Intent(this, NusantaraActivity.class);
            startActivity(intent);

        }
        else if (v.getId() == R.id.btn_set_detailsss){
            Intent intent = new Intent(this, JawaActivity.class);
            startActivity(intent);

        }
        else if (v.getId() == R.id.btn_set_detailss){
            Intent intent = new Intent(this, WaliSangaActivity.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.btn_set_share){
            Toast.makeText(this, "Daftar Wayang dibagikan", Toast.LENGTH_SHORT).show();

        }
        else if (v.getId() == R.id.btn_set_shares){
            Toast.makeText(this, "Daftar Wayang dibagikan", Toast.LENGTH_SHORT).show();

        }
        else if (v.getId() == R.id.btn_set_sharess){
            Toast.makeText(this, "Daftar Wayang dibagikan", Toast.LENGTH_SHORT).show();

        }
        else if (v.getId() == R.id.btn_set_sharesss){
            Toast.makeText(this, "Daftar Wayang dibagikan", Toast.LENGTH_SHORT).show();

        }
    }
}
