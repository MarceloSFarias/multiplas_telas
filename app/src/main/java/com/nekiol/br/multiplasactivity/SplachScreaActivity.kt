package com.nekiol.br.multiplasactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplachScreaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splach_screa)

        Handler(Looper.getMainLooper()).postDelayed({
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        },3000)
    }
}