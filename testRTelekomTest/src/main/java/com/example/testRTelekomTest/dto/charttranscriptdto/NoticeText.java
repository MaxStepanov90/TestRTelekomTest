package com.example.testRTelekomTest.dto.charttranscriptdto;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class NoticeText {

    @XmlAttribute(name = "noticeType")
    private String noticeType;

    @XmlValue
    private String value;
}
