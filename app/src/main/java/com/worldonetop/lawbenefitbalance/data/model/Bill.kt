package com.worldonetop.lawbenefitbalance.data.model

import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml

// 의안 검색
@Xml(name = "item")
data class Bill (
    @PropertyElement(name = "billId")
    val billId:String?, // 의안 구분 ID, PRC_R1D5Y1D2G2D9Z1J6S3E8F0R2S4V7L5
    @PropertyElement(name = "billName")
    val billName:String?, // 의안 명, 자원의 절약과 재활용촉진에 관한 법률 일부개정법률안(부좌현의원 등 13인)
    @PropertyElement(name = "billNo")
    val billNo:Int?, // 의안 번호, 1918303
    @PropertyElement(name = "generalResult")
    val generalResult:String?, // 의결결과, 임기만료폐기
    @PropertyElement(name = "passGubn")
    val passGubn:String?, // 처리구분, 처리의안 계류의안 구분
    @PropertyElement(name = "procDt")
    val procDt:String?, // 접수일자, 2016-05-29
    @PropertyElement(name = "procStageCd")
    val procStageCd:String?, // 심사 진행 상태, 소관위접수 공포
    @PropertyElement(name = "proposeDt")
    val proposeDt:String?, // 제안일, 2015-12-29
    @PropertyElement(name = "proposerKind")
    val proposerKind:String?, // 제안자 구분, 의원
    @PropertyElement(name = "summary")
    val summary:String?, // 의안 요약 내용
)