package com.worldonetop.lawbenefitbalance.data.model

import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml



@Xml(name="head")
data class NewsHeader(
    @PropertyElement(name = "list_total_count")
    val count:Int, // total count
    @Element(name = "RESULT")
    val result:NewsResult,
)
@Xml(name="RESULT")
data class NewsResult(
    @PropertyElement(name = "CODE")
    val code:String, // INFO-000
    @PropertyElement(name = "MESSAGE")
    val message:String, // 정상 처리되었습니다.
)

@Xml(name = "nzdppcljavkxnylqs")
data class NewsWrapper0(
    @Element(name = "head")
    val header: NewsHeader,
    @Element(name = "row")
    val row:List<News>
)
@Xml(name = "nshnpsvaalefpwslj")
data class NewsWrapper1(
    @Element(name = "head")
    val header: NewsHeader,
    @Element(name = "row")
    val row:List<News>
)
@Xml(name = "nufjqmgtawuzxhila")
data class NewsWrapper2(
    @Element(name = "head")
    val header: NewsHeader,
    @Element(name = "row")
    val row:List<News>
)
@Xml(name = "nauvppbxargkmyovh")
data class NewsWrapper3(
    @Element(name = "head")
    val header: NewsHeader,
    @Element(name = "row")
    val row:List<News>
)
@Xml(name = "nuizrfvoaepvwrjtz")
data class NewsWrapper4(
    @Element(name = "head")
    val header: NewsHeader,
    @Element(name = "row")
    val row:List<News>
)
@Xml(name = "nbzyjjyoamdqqjorw")
data class NewsWrapper5(
    @Element(name = "head")
    val header: NewsHeader,
    @Element(name = "row")
    val row:List<News>
)
@Xml(name = "ndkuweviadcqkbjdl")
data class NewsWrapper6(
    @Element(name = "head")
    val header: NewsHeader,
    @Element(name = "row")
    val row:List<News>
)