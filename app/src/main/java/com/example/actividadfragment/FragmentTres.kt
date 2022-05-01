package com.example.actividadfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.fragment_tres.*
import kotlinx.android.synthetic.main.fragment_tres.view.*
import kotlinx.android.synthetic.main.fragment_uno.*
import kotlinx.android.synthetic.main.fragment_uno.view.*

class FragmentTres : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tres, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        requireView().webview.webChromeClient = object : WebChromeClient(){

        }
        requireView().webview.webViewClient = object : WebViewClient(){

        }
        val settings : WebSettings = webview.settings
        settings.javaScriptEnabled = true

        webview.loadUrl("https://estudiantes.ugb.edu.sv/Notas")

    }
}