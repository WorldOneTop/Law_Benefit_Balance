package com.worldonetop.lawbenefitbalance.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml

// 회의록
@Entity(tableName = "conference")
data class Conference (
    val commName: String?, // 회의구분, 농림축산식품해양수산위원회
    val confDate: String?, // 회의일, 20221019
    val conferNum: String?, // 회의 번호, 052235
    val daeDisp: String?, // 대수, 제21대국회
    val degreeNum: String?, // 차수, 제6차
    val hwpLink: String?, // 회의록 내용 링크
    val pdfLink: String?, // 회의록 내용 링크
    val sesNum: String?, // 회기, 제400회
    val summary: String?, // 요약 정보 링크
    val vodLink: String?, // vod link
    var save:Boolean = false,
    @PrimaryKey(autoGenerate = true)
    val id:Int=0
)

