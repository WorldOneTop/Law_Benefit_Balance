package com.worldonetop.lawbenefitbalance.data.model

import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml

@Xml(name = "row")
data class News (
    @PropertyElement(name = "COMP_MAIN_TITLE")
    val title:String, // 제목
    @PropertyElement(name = "REG_DATE")
    val date:String, // 등록일자
    @PropertyElement(name = "COMP_CONTENT")
    val content:String, // 내용
    @PropertyElement(name = "LINK_URL")
    val link:String // 상세보기
)