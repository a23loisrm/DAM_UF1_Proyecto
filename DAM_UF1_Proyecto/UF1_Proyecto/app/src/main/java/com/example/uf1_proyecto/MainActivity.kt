package com.example.uf1_proyecto

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)




        //Controlador de navegacion
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.container_fragment) as NavHostFragment
        val navController =  navHostFragment.navController
        val appBarConfiguration = AppBarConfiguration.Builder(navController.graph)

        val appBarBuild = appBarConfiguration.build()
        // Toolbar con controller
        toolbar.setupWithNavController(navController, appBarBuild)
        //bottonBar con controller
        val bottomBar = findViewById<BottomNavigationView>(R.id.botton_navigation)
        bottomBar.setupWithNavController(navController)


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val navController = findNavController(R.id.container_fragment)
        NavigationUI.onNavDestinationSelected(item, navController)
        return super.onOptionsItemSelected(item)
    }

}