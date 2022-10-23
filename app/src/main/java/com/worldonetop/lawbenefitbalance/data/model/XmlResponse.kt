package com.worldonetop.lawbenefitbalance.data.model

data class XmlResponse<T>(
    val header: XmlHeader,
    val body:XmlBody<T>
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