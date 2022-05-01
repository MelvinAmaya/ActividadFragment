package com.example.actividadfragment

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.content.ContextCompat
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = listOf(
            "Calenderazación",
            "Himn UGB",
            "Notas",
            "About"
        )


        val icons = listOf(
            R.drawable.ic_baseline_login_24,
            R.drawable.ic_baseline_how_to_reg_24,
            R.drawable.ic_baseline_description_24,
            R.drawable.ic_baseline_help_24
        )

        pagina.adapter = MainAdapter(this, lista)
        TabLayoutMediator(tab_Layout1,pagina){tab,position ->
            tab.text=lista[position]
            tab.icon=ContextCompat.getDrawable(this,icons[position])

        }.attach()
    }
}