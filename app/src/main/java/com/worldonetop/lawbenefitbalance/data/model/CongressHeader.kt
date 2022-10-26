package com.worldonetop.lawbenefitbalance.data.model

import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml

@Xml(name = "header")
data class CongressHeader (
    @PropertyElement(name = "resultCode")
    val resultCode:String, // 00 정상
    @PropertyElement(name = "resultMsg")
    val resultMsg:String, //NORMAL SERVICE. 정상
)