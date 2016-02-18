package com.natrollus.kollada;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

import com.natrollus.kollada.render.Renderci;

public class Baslangic extends Activity {

    GLSurfaceView yuzey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_baslangic);
        yuzey = (GLSurfaceView) findViewById(R.id.yuzey);
        yuzey.setEGLContextClientVersion(2);
        yuzey.setRenderer(new Renderci(this));
        yuzey.setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
    }
}
