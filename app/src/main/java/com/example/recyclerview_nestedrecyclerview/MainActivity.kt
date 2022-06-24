package com.example.recyclerview_nestedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_nestedrecyclerview.adapter.MainRecyclerViewAdapter
import com.example.recyclerview_nestedrecyclerview.model.AllCategory

class MainActivity : AppCompatActivity() {
    private var mainCategoryRecyclerview: RecyclerView?=null
    private var mainRecyclerviewAdapter:MainRecyclerViewAdapter?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val allCategory:MutableList<AllCategory> = ArrayList()
        allCategory.add(AllCategory("hollywood"))
        allCategory.add(AllCategory("bolywood"))
        allCategory.add(AllCategory("tolywood"))
        allCategory.add(AllCategory("comedywood"))

        setMainRecycler(allCategory)


    }
    fun setMainRecycler(allCategory: List<AllCategory>)
    {
        mainCategoryRecyclerview=findViewById(R.id.main_recyclerview)
        val layoutManager:RecyclerView.LayoutManager= LinearLayoutManager(this)
        mainCategoryRecyclerview!!.layoutManager=layoutManager
        mainRecyclerviewAdapter=MainRecyclerViewAdapter(this,allCategory)
    }
}