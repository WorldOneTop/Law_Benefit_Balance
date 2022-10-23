package com.worldonetop.lawbenefitbalance.data.model

import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml

// 회의록
@Xml(name = "item")
data class Conference (
    @PropertyElement(name = "commName")
    val commName: String,// 회의구분, 농림축산식품해양수산위원회
    @PropertyElement(name = "confDate")
    val confDate: String, // 회의일, 20221019
    @PropertyElement(name = "conferNum")
    val conferNum: String, // 회의 번호, 052235
    @PropertyElement(name = "daeDisp")
    val daeDisp: String, // 대수, 제21대국회
    @PropertyElement(name = "degreeNum")
    val degreeNum: String, // 차수, 제6차
    @PropertyElement(name = "hwpLink")
    val hwpLink: String, // 회의록 내용 링크
    @PropertyElement(name = "pdfLink")
    val pdfLink: String, // 회의록 내용 링크
    @PropertyElement(name = "sesNum")
    val sesNum: String, // 회기, 제400회
    @PropertyElement(name = "summary")
    val summary: String, // 요약 정보 링크
    @PropertyElement(name = "vodLink")
    val vodLink: String, // vod link
)

