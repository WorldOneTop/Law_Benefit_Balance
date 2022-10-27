package com.worldonetop.lawbenefitbalance.data.remote

import com.worldonetop.lawbenefitbalance.BuildConfig
import com.worldonetop.lawbenefitbalance.data.model.CongressResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface CongressService {
    @GET("AgendaScheduleInfoService/getDetailScheduleList")
    suspend fun getDetailAgenda(
        @Query("pageNo") pageNo: Int = 1,
        @Query("numOfRows") numOfRows: Int = 10,
        @Query("gubun") gubun: String,
        @Query("committee_id") committeeId: Long,
        @Query("board_id") boardId: Long,
        @Query("record_id") recordId: Long,
        @Query("serviceKey") serviceKey: String = BuildConfig.Xml_KEY
    ): CongressResponse
    //https://apis.data.go.kr/9710000/AgendaScheduleInfoService/getScheduleList?serviceKey=y1N%2B09sHvVnS%2BKs91iDwY2N8pvGfqO95lGSbo2EGtGBS5YMn7nSg7FcZm9MDDZjEa%2FDA%2BqrQp%2B1MRe1CmUM3%2BQ%3D%3D&numOfRows=10&pageNo=1&me_date=2016-12-02
    //gubun=02&committee_id=2005110000006&board_id=2006011000250&record_id=2022090062437

    @GET("BillInfoService2/getRecentRceptList")
    suspend fun searchBill(
        @Query("pageNo") pageNo: Int = 1,
        @Query("numOfRows") numOfRows: Int = 10,
        @Query("bill_name") name: String,
        @Query("serviceKey") serviceKey: String = BuildConfig.Xml_KEY
    ): CongressResponse
    //https://apis.data.go.kr/9710000/BillInfoService2/getRecentRceptList?serviceKey=y1N%2B09sHvVnS%2BKs91iDwY2N8pvGfqO95lGSbo2EGtGBS5YMn7nSg7FcZm9MDDZjEa%2FDA%2BqrQp%2B1MRe1CmUM3%2BQ%3D%3D&pageNo=1&numOfRows=10&bill_name=%EA%B5%AD%ED%9A%8C%EB%B2%95
    //pageNo=1&numOfRows=10&bill_name=재활용

    @GET("ProceedingInfoService/getLatestConInfoList")
    suspend fun getLastConference(
        @Query("pageNo") pageNo: Int = 1,
        @Query("numOfRows") numOfRows: Int = 10,
        @Query("serviceKey") serviceKey: String = BuildConfig.Xml_KEY
    ): CongressResponse
    //https://apis.data.go.kr/9710000/ProceedingInfoService/getLatestConInfoList?serviceKey=y1N%2B09sHvVnS%2BKs91iDwY2N8pvGfqO95lGSbo2EGtGBS5YMn7nSg7FcZm9MDDZjEa%2FDA%2BqrQp%2B1MRe1CmUM3%2BQ%3D%3D&numOfRows=10&pageNo=1
    //&numOfRows=10&pageNo=1
}
