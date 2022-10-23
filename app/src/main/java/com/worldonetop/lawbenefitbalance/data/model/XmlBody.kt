package com.worldonetop.lawbenefitbalance.data.model

data class XmlBody<T> (
    val items:List<T>,
    val numOfRows:Int,
    val pageNo:Int,
    val totalCount:Int
)