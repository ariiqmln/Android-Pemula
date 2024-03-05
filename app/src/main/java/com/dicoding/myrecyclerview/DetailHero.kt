package com.dicoding.myrecyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailHero : AppCompatActivity() {
    companion object {
        const val extraname = "EXTRA_NAME"
        const val extradesc = "EXTRA_DESC"
        const val extrarole = "EXTRA_ROLE"
        const val extraorigin = "EXTRA_ORIGIN"
        const val extrapic = "EXTRA_PIC"
        const val extrabg = "EXTRA_BG"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_hero)

        val actionbar = supportActionBar
        actionbar!!.title = "Detail"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val name = intent.getStringExtra(extraname)
        val desc = intent.getStringExtra(extradesc)
        val role = intent.getStringExtra(extrarole)
        val origin = intent.getStringExtra(extraorigin)
        val pic = intent.getIntExtra(extrapic, 0)
        val picbg = intent.getIntExtra(extrabg, 0)

        val nametext: TextView = findViewById(R.id.hero_name)
        val desctext: TextView = findViewById(R.id.hero_desc)
        val roletext: TextView = findViewById(R.id.hero_role)
        val origintext: TextView = findViewById(R.id.hero_origin)
        val heropic: ImageView = findViewById(R.id.hero_pic)
        val herobg: ImageView = findViewById(R.id.hero_bg)

        heropic.setImageResource(pic)
        herobg.setImageResource(picbg)

        roletext.text = role
        origintext.text = origin
        nametext.text = name
        desctext.text = desc

    }
}
