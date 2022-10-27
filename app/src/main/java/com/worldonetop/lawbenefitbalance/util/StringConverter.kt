package com.worldonetop.lawbenefitbalance.util

object StringConverter{
    fun html(str:String?):String{
        return str.toString()
            .replace("#8220;","\"")
            .replace("#8221;","\"")
            .replace("#8230;","...")
            .replace("&amp;"," ")
            .replace("#60;","<")
            .replace("#62;",">")
            .replace("#62;",">")
            .replace("#38;","&")
            .replace("#183;","·")
    }
}