package com.example.actividadfragment

import android.content.Context
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.fragment_dos.view.*
import kotlinx.android.synthetic.main.fragment_uno.view.*
import java.lang.RuntimeException


class FragmentDos : Fragment() {
    var mediaPlayer: MediaPlayer? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dos, container, false)


    }

    override fun onDetach() {
        super.onDetach()
        mediaPlayer!!.pause()
        mediaPlayer = null
        requireView().play.isVisible=true
        requireView().txtLetra.text="Himno UGB"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mediaPlayer!!.pause()
        mediaPlayer = null
        requireView().play.isVisible=true
        requireView().txtLetra.text="Himno UGB"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        requireView().play.setOnClickListener {
            requireView().play.isVisible=false
            mediaPlayer = MediaPlayer.create(this.context, R.raw.himno_ugb)
            mediaPlayer!!.start()

            var c1= Runnable {
                requireView().txtLetra.text = "Somos fuerza de una gran nación, forjadores de unidad, nuestras mentes, nuestro corazón van en busca de verdad."
            }
            var c2= Runnable {
                requireView().txtLetra.text = "Con espíritu trabajador, sin descanso hasta triunfar lucharemos siempre con valor por la paz reconquistar. Nuestro hogar, nuestro orgullo es Oriente, nuestra estrella es inmortal y en Barrios aún sigue latente el progreso cual noble ideal."
            }
            var c3= Runnable {
                requireView().txtLetra.text = "Universidad Gerardo Barrios formación profesional que transforma y educa con fe en Dios el futuro nacional. Nuestro hogar, nuestro orgullo es Oriente, nuestra estrella es inmortal y en Barrios aún sigue latente el progreso cual noble ideal. Universidad Gerardo Barrios"
            }
            var c4= Runnable {
                mediaPlayer!!.pause()
                mediaPlayer = null
                requireView().play.isVisible=true
                requireView().txtLetra.text="Himno UGB"
            }

            var hand1 = Handler()
            hand1.postDelayed(c1,5000)
            var hand2 = Handler()
            hand2.postDelayed(c2,24000)
            var hand3 = Handler()
            hand3.postDelayed(c3,62000)
            var hand4 = Handler()
            hand4.postDelayed(c4,110000)
        }





    }
}