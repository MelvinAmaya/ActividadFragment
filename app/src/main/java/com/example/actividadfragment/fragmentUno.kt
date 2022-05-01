package com.example.actividadfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.fragment_uno.*
import kotlinx.android.synthetic.main.fragment_uno.view.*


class fragmentUno : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_uno, container, false)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        requireView().WebView.webChromeClient = object : WebChromeClient(){

        }
        requireView().WebView.webViewClient = object : WebViewClient(){

        }
        val settings :WebSettings = WebView.settings
        settings.javaScriptEnabled = true

        WebView.loadUrl("https://estudiantes.ugb.edu.sv/Calendarizacion")
       // FragmentDos().onDetach()


    }

}