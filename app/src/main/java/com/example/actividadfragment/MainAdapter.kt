package com.example.actividadfragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MainAdapter ( fragment: FragmentActivity,private val itesm:List<String> ):FragmentStateAdapter(fragment){
    override fun getItemCount(): Int {
        return itesm.size
    }

    override fun createFragment(position: Int): Fragment {
       val FragmentUno = fragmentUno()
        val fragmentDos = FragmentDos()
        val fragmenttres = FragmentTres()
        val fragmentcuatro= FragmentAbout()

        return when(position){
            0->{
                FragmentUno
            }
            1->{
                fragmentDos
            }
            2->{
                fragmenttres
            }
            3->{
                fragmentcuatro
            }
            else-> FragmentUno
        }
    }
}