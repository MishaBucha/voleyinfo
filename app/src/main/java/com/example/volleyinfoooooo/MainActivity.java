package com.example.volleyinfoooooo;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


import com.example.volleyinfoooooo.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener   {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    private ListView list;
    private String[] array;
    private ArrayAdapter<String> adapter;
    private int category_index;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        list = findViewById(R.id.ListView);
        array = getResources().getStringArray(R.array.Pra_array);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,new ArrayList<String>(Arrays.asList(array)));
        list.setAdapter(adapter);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.Pra);





        setSupportActionBar(binding.appBarMain.toolbar);





        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setOpenableLayout(drawer)
                .build();
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment_content_main);
        NavController navCo = navHostFragment.getNavController();
        NavigationUI.setupActionBarWithNavController(this, navCo, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navCo);
        navigationView.setNavigationItemSelectedListener(this);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(@Nullable AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,Text_Content_Activity.class);
                intent.putExtra("category",category_index);
                intent.putExtra("position",position);
                startActivity(intent);

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }


    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.id_Pravila) {
            toolbar.setTitle(R.string.Pra);
            array = getResources().getStringArray(R.array.Pra_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
            category_index = 0;

        }
        else if
        (id == R.id.id_Sett) {
            toolbar.setTitle(R.string.Setter);
            array = getResources().getStringArray(R.array.Sett_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
            category_index = 1;

        }
        else if
        (id == R.id.id_Doi) {
            toolbar.setTitle(R.string.Doigr);
            array = getResources().getStringArray(R.array.Doi_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
            category_index = 2;

        }
        else if
        (id == R.id.id_Centr) {
            toolbar.setTitle(R.string.Centr);
            array = getResources().getStringArray(R.array.Centr_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
            category_index = 3;

        }
        else if
        (id == R.id.id_Dia) {
            toolbar.setTitle(R.string.Dia);
            array = getResources().getStringArray(R.array.Dia_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
            category_index = 4;

        }
        else if
        (id == R.id.id_Lib) {
            toolbar.setTitle(R.string.Lib);
            array = getResources().getStringArray(R.array.Lib_array);
            adapter.clear();
            adapter.addAll(array);
            adapter.notifyDataSetChanged();
            category_index = 5;

        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}