package com.core.drawer.left

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.core.drawer.R
import com.core.drawer.model.DrawerItem
import com.core.kbasekit.ui.base.BaseAdapter
import com.core.kbasekit.ui.base.BaseViewHolder


/*
*  ****************************************************************************
*  * Created by : Md. Azizul Islam on 2/13/2018 at 2:44 PM.
*  * Email : azizul@w3engineers.com
*  * 
*  * Last edited by : Md. Azizul Islam on 2/13/2018.
*  * 
*  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>  
*  ****************************************************************************
*/

class LeftAdapter: BaseAdapter<DrawerItem> {
    private val context : Context
    constructor(context: Context){
        this.context = context
    }

    override fun isEqual(leftItem: DrawerItem, rightItem: DrawerItem): Boolean {
        return false
    }

    override fun newViewHolder(parent: ViewGroup?, viewType: Int): BaseViewHolder<DrawerItem> {
        val view = LayoutInflater.from(context).inflate(R.layout.item_drawer, parent, false)
        return ItemHolder(view)
    }

    private inner class ItemHolder(itemView:View) : BaseViewHolder<DrawerItem>(itemView), View.OnClickListener{
        private var nameTv : TextView
        init {
            nameTv = itemView.findViewById(R.id.name_tv)
            nameTv.setOnClickListener(this)
        }
        override fun bind(item: DrawerItem) {
            Log.e("DrawerItem", "Item ="+item.name)
            nameTv.text = item.name
        }
        override fun onClick(v: View?) {
            itemClickListener?.onItemClick(v!!, getItem(adapterPosition))
        }


    }
}