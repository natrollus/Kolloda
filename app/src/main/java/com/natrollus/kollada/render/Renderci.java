package com.natrollus.kollada.render;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class Renderci implements Renderer {

    Context context;


    public Renderci(Context context) {
        this.context = context;
    }

    @Override
    public void onSurfaceCreated(GL10 yok, EGLConfig config) {
        GLES20.glClearColor(1,0,0,1);
    }

    @Override
    public void onSurfaceChanged(GL10 yok, int width, int height) {

    }

    @Override
    public void onDrawFrame(GL10 yok) {
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT | GLES20.GL_DEPTH_BUFFER_BIT);
        GLES20.glClearColor(1,0,0,1);

    }
}
