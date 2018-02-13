package com.core.drawer.right

import android.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.core.drawer.R
import com.core.drawer.model.Data
import com.core.drawer.model.DrawerItem
import com.core.kbasekit.ui.base.BaseListener


/*
*  ****************************************************************************
*  * Created by : Md. Azizul Islam on 2/13/2018 at 11:19 AM.
*  * Email : azizul@w3engineers.com
*  * 
*  * Last edited by : Md. Azizul Islam on 2/13/2018.
*  * 
*  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>  
*  ****************************************************************************
*/

class RightFragment : Fragment(), BaseListener<DrawerItem>{

    override fun onItemClick(view: View, t: DrawerItem) {
        Toast.makeText(activity, t.name, Toast.LENGTH_SHORT).show()
    }

    override fun onItemClick(view: View, position: Int) {
    }

    lateinit var rightRv : RecyclerView
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater?.inflate(R.layout.fragment_right, container, false)
        rightRv = view!!.findViewById(R.id.right_rv)

        loadView()
        return view!!
    }

    private fun loadView(){
        var rithtAdapter =  RightAdapter(activity)
        rithtAdapter.itemClickListener = this
        rightRv.adapter =rithtAdapter
        rightRv.layoutManager = LinearLayoutManager(activity)
        rithtAdapter.addItems(Data.getData())
    }
}