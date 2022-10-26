package com.worldonetop.lawbenefitbalance.data.model

import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.Path
import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml

@Xml(name = "body")
data class CongressBody (
    @Path("items")
    @Element
    val items:List<CongressWrapper>,
    @PropertyElement(name = "numOfRows")
    val numOfRows:Int,
    @PropertyElement(name = "pageNo")
    val pageNo:Int,
    @PropertyElement(name = "totalCount")
    val totalCount:Int
)