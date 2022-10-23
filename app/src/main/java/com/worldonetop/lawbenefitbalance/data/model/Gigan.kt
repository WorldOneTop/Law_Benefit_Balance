package com.worldonetop.lawbenefitbalance.data.model

import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml

// 의사일정 정보, 스케줄이 기본
@Xml(name = "item")
data class Gigan (
    @PropertyElement(name = "boardId")
    val boardId:Long,// 게시판ID, == board_id
    @PropertyElement(name = "cha")
    val cha:String, // 차수 제1차
    @PropertyElement(name = "committeeId")
    val committeeId:Long, // 위원회ID, == committee_id
    @PropertyElement(name = "committeeName")
    val committeeName:String, // 위원회
    @PropertyElement(name = "gubun")
    val gubun:String, // 본회의 01, 위원회 02
    @PropertyElement(name = "meetingTime")
    val meetingTime:String, // 회의시간 hh:mm
    @PropertyElement(name = "meetingday")
    val meetingday:String, // 회의일자 yyyy-mm-dd
    @PropertyElement(name = "recordId")
    val recordId:Long, // 게시물ID, == record_id
    @PropertyElement(name = "sessNm")
    val sessNm:String, //회기 제251회국회(임시회)
    @PropertyElement(name = "title")
    val title:String, // 제목 처리예상안건
)
// 상세정보 필요한 정보 : gubun, committee_id, board_id, record_id
// 날짜별 필요한 정보 : start_dt, end_dt (서로 값 차이가 있어야함)
/* 날짜별 반환값
 * <response>
<header>
<resultCode>00</resultCode>
<resultMsg>NORMAL SERVICE.</resultMsg>
</header>
<body>
<items>
<item>
<boardId>2006011000250</boardId>
<cha>제4차</cha>
<committeeId>2005110000006</committeeId>
<committeeName>국방위원회</committeeName>
<gubun>02</gubun>
<meetingTime>10:00</meetingTime>
<meetingday>2022-11-04</meetingday>
<recordId>2022090062437</recordId>
<sessNm>제400회국회(정기회)</sessNm>
<title>전체회의</title>
</item>
</items>
<numOfRows>10</numOfRows>
<pageNo>1</pageNo>
<totalCount>446</totalCount>
</body>
</response>
 */

/* 디테일 반환값
 *<response>
<header>
<resultCode>00</resultCode>
<resultMsg>NORMAL SERVICE.</resultMsg>
</header>
<body>
<items>
<item>
<agendaId>국방위원회</agendaId>
<cha>제4차</cha>
<content>1. [2117213] 2023년도 예산안(정부)<br>2. [2117214] 2023년도 기금운용계획안(정부)<br>3. [2117215] 2023년도 임대형 민자사업(BTL) 한도액안(정부)<br>4. 법률안 등<br></content>
<expectBillHwpLink>http://www.assembly.go.kr/common/download.do?fid=cmmttSchedule&fpath=CmmttSch&committee_id=2005110000006&board_id=2006011000250&record_id=2022090062437&file_id=01</expectBillHwpLink>
<gubun>02</gubun>
<meetingDay>2022-11-04</meetingDay>
<meetingTime>10:00</meetingTime>
<recordId>2022090062437</recordId>
<sessNm>제400회국회(정기회)</sessNm>
<title>전체회의</title>
</item>
</items>
<numOfRows>10</numOfRows>
<pageNo>1</pageNo>
<totalCount>1</totalCount>
</body>
</response>
 * */
