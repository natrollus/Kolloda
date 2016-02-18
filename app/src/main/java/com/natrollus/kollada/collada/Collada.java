package com.natrollus.kollada.collada;

import android.content.Context;
import android.content.res.XmlResourceParser;

import com.natrollus.kollada.R;


import org.xml.sax.helpers.DefaultHandler;

import java.io.IOException;


public class Collada extends DefaultHandler {

    Context context;
    String dosyaIsimi;

    public Collada(Context context,String dosyaIsmi){
        this.context = context;
        this.dosyaIsimi = dosyaIsmi;
        init();
    }

    private void init(){

    }
}
