package com.example.testRTelekomTest.dto.charttranscriptdto;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "userInfo")
public class UserInfo {

    @XmlAttribute(name = "personId")
    private String personId;

    @XmlAttribute(name = "userNick")
    private String userNick;

    @XmlAttribute(name = "userType")
    private String userType;

    @XmlAttribute(name = "protocolType")
    private String protocolType;

    @XmlAttribute(name = "timeZoneOffset")
    private String timeZoneOffset;

    @XmlAttribute(name = "clientVersion")
    private String clientVersion;
}