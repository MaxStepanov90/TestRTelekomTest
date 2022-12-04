package com.example.testRTelekomTest.dto.charttranscriptdto;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "newParty")
public class NewParty {

    @XmlAttribute(name = "userId")
    private String userId;

    @XmlAttribute(name = "timeShift")
    private String timeShift;

    @XmlAttribute(name = "visibility")
    private String visibility;

    @XmlAttribute(name = "eventId")
    private String eventId;

    @XmlElement(name = "userInfo")
    private UserInfo userInfo;

    @XmlElementWrapper(name = "userData")
    @XmlElement(name = "item")
    private List<Item> userData;

    @XmlElementWrapper(name = "eventAttributes")
    @XmlElement(name = "item")
    private List<Item> eventAttributes;
}
