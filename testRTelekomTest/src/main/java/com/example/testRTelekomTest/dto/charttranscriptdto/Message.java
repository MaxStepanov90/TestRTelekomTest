package com.example.testRTelekomTest.dto.charttranscriptdto;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "message")
public class Message {

    @XmlAttribute(name = "userId")
    private String userId;

    @XmlAttribute(name = "timeShift")
    private String timeShift;

    @XmlAttribute(name = "visibility")
    private String visibility;

    @XmlAttribute(name = "eventId")
    private String eventId;

    @XmlElement(name = "msgText")
    private MessageText msgText;
}
