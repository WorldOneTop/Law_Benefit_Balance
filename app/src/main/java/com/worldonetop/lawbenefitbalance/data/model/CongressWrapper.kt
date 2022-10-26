package com.worldonetop.lawbenefitbalance.data.model

import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml


@Xml(name = "item")
data class CongressWrapper(
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
    val summary:String?,// 의안 요약 내용


    @PropertyElement(name = "commName")
    val commName: String?,// 회의구분, 농림축산식품해양수산위원회
    @PropertyElement(name = "confDate")
    val confDate: String?, // 회의일, 20221019
    @PropertyElement(name = "conferNum")
    val conferNum: String?, // 회의 번호, 052235
    @PropertyElement(name = "daeDisp")
    val daeDisp: String?, // 대수, 제21대국회
    @PropertyElement(name = "degreeNum")
    val degreeNum: String?, // 차수, 제6차
    @PropertyElement(name = "hwpLink")
    val hwpLink: String?, // 회의록 내용 링크
    @PropertyElement(name = "pdfLink")
    val pdfLink: String?, // 회의록 내용 링크
    @PropertyElement(name = "sesNum")
    val sesNum: String?, // 회기, 제400회
//    @PropertyElement(name = "summary")
//    val summary: String?, // 요약 정보 링크
    @PropertyElement(name = "vodLink")
    val vodLink: String?, // vod link


    @PropertyElement(name = "boardId")
    val boardId:Long?,// 게시판ID, == board_id
    @PropertyElement(name = "cha")
    val cha:String?, // 차수 제1차
    @PropertyElement(name = "committeeId")
    val committeeId:Long?, // 위원회ID, == committee_id
    @PropertyElement(name = "committeeName")
    val committeeName:String?, // 위원회
    @PropertyElement(name = "gubun")
    val gubun:String?, // 본회의 01, 위원회 02
    @PropertyElement(name = "meetingTime")
    val meetingTime:String?, // 회의시간 hh:mm
    @PropertyElement(name = "meetingday")
    val meetingday:String?, // 회의일자 yyyy-mm-dd
    @PropertyElement(name = "recordId")
    val recordId:Long?, // 게시물ID, == record_id
    @PropertyElement(name = "sessNm")
    val sessNm:String?, //회기 제251회국회(임시회)
    @PropertyElement(name = "title")
    val title:String?, // 제목 처리예상안건
) {
    val bill: Bill? by lazy{
        if(billId == null)
            null
        else
            Bill(
            billId, billName, billNo, generalResult, passGubn, procDt, procStageCd, proposeDt, proposerKind, summary
        )
    }
    val conference:Conference? by lazy{
        if(commName == null)
            null
        else
            Conference(
                commName, confDate, conferNum, daeDisp, degreeNum, hwpLink, pdfLink, sesNum, summary, vodLink
            )
    }
    val agenda:Agenda? by lazy{
        if(boardId == null)
            null
        else
            Agenda(
                boardId, cha, committeeId, committeeName, gubun, meetingTime, meetingday, recordId, sessNm, title
            )
    }
}