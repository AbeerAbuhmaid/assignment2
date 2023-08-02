package com.example.myapplication11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ratingTV: TextView = findViewById(R.id.phg)
        ratingTV.setOnClickListener {
            var dialog_var = TestDialgFragment()
            dialog_var.show(supportFragmentManager, "Test Dialog")
        }

    }

    fun receiveFeedback(feedback: String) {
        val ratingTV : TextView = findViewById(R.id.phg)
     ratingTV.text = feedback;
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
     // Inflate the menu to use in the action bar
     val inflater = menuInflater
     inflater.inflate(R.menu.menu, menu)
     return super.onCreateOptionsMenu(menu)
 }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
 when(item.itemId){
     R.id.item1 -> Toast.makeText(this, "Aqua course selected", Toast.LENGTH_SHORT).show()
     R.id.item2 -> Toast.makeText(this, "Cycling course selected", Toast.LENGTH_SHORT).show()
     R.id.item3 -> Toast.makeText(this, "Kickboxing course selected", Toast.LENGTH_SHORT).show()
     R.id.item4 -> Toast.makeText(this, "pilates course selected", Toast.LENGTH_SHORT).show()
 }
 return true;
    }


}