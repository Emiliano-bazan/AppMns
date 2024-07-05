package com.curso.mnsapp

import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //manejar las propiedades del toolbar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "App mensajes"

        //cambiar color del status bar
        window.statusBarColor = Color.parseColor("#2b3d4f")

    }

    //mostrar el main_menu creado
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    //funcion de los botones del toolbar
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_add -> {
                val rootView = findViewById<View>(android.R.id.content)
                Snackbar.make(rootView, R.string.add, Snackbar.LENGTH_LONG)
                    .setAction("Deshacer") {
                        // Acción que se ejecuta al pulsar el botón de acción
                        Toast.makeText(this, "Se cancelo el agregar", Toast.LENGTH_SHORT).show()
                    }
                    .show()
                true
            }

            R.id.action_search -> {
                Toast.makeText(this, R.string.search, Toast.LENGTH_SHORT).show()
                true
            }

            R.id.action_option1 -> {
                Toast.makeText(this, R.string.select_option_1, Toast.LENGTH_SHORT).show()
                true
            }

            R.id.action_option2 -> {
                Toast.makeText(this, R.string.select_option_2, Toast.LENGTH_SHORT).show()
                true
            }

            R.id.action_option3 -> {
                Toast.makeText(this, R.string.select_option_3, Toast.LENGTH_SHORT).show()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}