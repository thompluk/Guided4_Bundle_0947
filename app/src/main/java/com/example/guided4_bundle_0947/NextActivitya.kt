package com.example.guided4_bundle_0947

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class NextActivitya : AppCompatActivity() {
    private lateinit var nama : TextInputEditText
    private lateinit var nim : TextInputEditText
    private lateinit var fakultas : TextInputEditText
    private lateinit var prodi : TextInputEditText
    lateinit var  mBundle : Bundle

    lateinit var yNama: String
    lateinit var yNim: String
    lateinit var yFakultas: String
    lateinit var yProdi: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_activitya)

        mBundle()
        setText()
    }

    fun getBundle(){
        mBundle = intent.getBundleExtra("register")!!
        vNama = mBundle.getString("nama")!!
        vNim = mBundle.getString("nim")!!
        vFakultas = mBundle.getString("fakultas")!!
        vProdi = mBundle.getString("prodi")!!
    }

    fun setText(){
        nama = findViewById(R.id.tvNama)
        nama.setText(vNama)
        nim = findViewById(R.id.tvNIM)
        nim.setText(vNim)
        fakultas = findViewById(R.id.tvFakultas)
        fakultas.setText(vFakultas)
        prodi = findViewById(R.id.tvProdi)
        prodi.setText(vProdi)
    }
}