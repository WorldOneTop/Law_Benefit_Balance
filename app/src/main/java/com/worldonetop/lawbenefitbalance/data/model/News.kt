package com.worldonetop.lawbenefitbalance.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml

@Entity(tableName = "news")
data class News (
    val title:String, // 제목
    val date:String, // 등록일자
    val content:String, // 내용
    val link:String, // 상세보기
    var save:Boolean = false,
    @PrimaryKey(autoGenerate = true)
    val id:Int=0
)