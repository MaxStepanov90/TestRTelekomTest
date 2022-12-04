package com.example.testRTelekomTest.dto.charttranscriptdto;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "partyLeft")
public class PartyLeft {

    @XmlAttribute(name = "userId")
    private String userId;

    @XmlAttribute(name = "timeShift")
    private String timeShift;

    @XmlAttribute(name = "visibility")
    private String visibility;

    @XmlAttribute(name = "eventId")
    private String eventId;

    @XmlAttribute(name = "askerId")
    private String askerId;

    @XmlElement(name = "reason")
    private Reason reason;
}
