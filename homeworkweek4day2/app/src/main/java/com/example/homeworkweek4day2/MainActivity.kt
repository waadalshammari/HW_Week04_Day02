package com.example.homeworkweek4day2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val app = mutableListOf(
    DataClassModel("i'm strong",R.drawable.strong),
            DataClassModel("i'm hopeful",R.drawable.hopful),
        DataClassModel("i'm thankful",R.drawable.thankful)
    )
    private lateinit var appRecyclerView: RecyclerView
    private lateinit var appAdaptor: DataClassAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        app.get(0)
        appRecyclerView = findViewById(R.id.pic_recycler)
        appAdaptor = DataClassAdapter(app)
        appRecyclerView.adapter=appAdaptor
    }

}