package com.core.drawer.left

import android.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.core.drawer.R
import com.core.drawer.model.Data
import com.core.drawer.right.RightAdapter


/*
*  ****************************************************************************
*  * Created by : Md. Azizul Islam on 2/13/2018 at 11:17 AM.
*  * Email : azizul@w3engineers.com
*  * 
*  * Last edited by : Md. Azizul Islam on 2/13/2018.
*  * 
*  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>  
*  ****************************************************************************
*/

class LeftDrawer : Fragment() {
    lateinit var leftRv: RecyclerView
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater?.inflate(R.layout.fragment_left, container, false)
        leftRv = view!!.findViewById(R.id.left_rv)
        loadView()
        return view!!
    }

    private fun loadView(){
        var rithtAdapter =  LeftAdapter(activity)
        leftRv.adapter =rithtAdapter
        leftRv.layoutManager = LinearLayoutManager(activity)
        rithtAdapter.addItems(Data.getData())
    }
}