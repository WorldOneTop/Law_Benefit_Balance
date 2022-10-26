package com.worldonetop.lawbenefitbalance.data.model

import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.Xml

@Xml(name = "response")
data class CongressResponse(
    @Element(name = "header")
    val header: CongressHeader,
    @Element(name = "body")
    val body: CongressBody
)

//getSummaryInfoList는 페이징 없음

/*
* <response>
<header>
<resultCode>00</resultCode>
<resultMsg>NORMAL SERVICE.</resultMsg>
</header>
<body>
<items>
...
</items>
<numOfRows>100</numOfRows>
<pageNo>1</pageNo>
<totalCount>31</totalCount>
</body>
</response>
* */
/*

* <response>
<header>
<resultCode>00</resultCode>
<resultMsg>NORMAL SERVICE.</resultMsg>
</header>
<body>
<items>
...
</items>
<numOfRows>100</numOfRows>
<pageNo>1</pageNo>
<totalCount>31</totalCount>
</body>
</response>

 */