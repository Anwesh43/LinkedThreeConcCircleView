package com.anwesh.uiprojects.linkedthreeconccirclerotview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.threeconccirclerotview.ThreeConcCircleRotView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ThreeConcCircleRotView.create(this)
    }
}
