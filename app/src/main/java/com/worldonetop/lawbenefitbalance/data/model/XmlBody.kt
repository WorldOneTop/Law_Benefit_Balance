package com.worldonetop.lawbenefitbalance.data.model

import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml

@Xml(name = "body")
data class XmlBody<T> (
    @Element(name = "items")
    val items:List<T>,
    @PropertyElement(name = "numOfRows")
    val numOfRows:Int,
    @PropertyElement(name = "pageNo")
    val pageNo:Int,
    @PropertyElement(name = "totalCount")
    val totalCount:Int
)