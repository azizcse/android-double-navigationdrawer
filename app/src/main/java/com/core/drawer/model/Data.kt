package com.core.drawer.model


/*
*  ****************************************************************************
*  * Created by : Md. Azizul Islam on 2/13/2018 at 2:59 PM.
*  * Email : azizul@w3engineers.com
*  * 
*  * Last edited by : Md. Azizul Islam on 2/13/2018.
*  * 
*  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>  
*  ****************************************************************************
*/

object Data {
    fun getData():List<DrawerItem>{
        val dataList = ArrayList<DrawerItem>()
        for(i in 1..20){
            val item = DrawerItem("Drawer Item =$i")
            dataList.add(item)
        }
        return dataList
    }
}