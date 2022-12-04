package com.example.testRTelekomTest.dto.charttranscriptdto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "chatTranscript")
public class ChartTranscriptDTO {

    @XmlElement(name = "newParty")
    private List<NewParty> newPartyList;

    @XmlElement(name = "message")
    private List<Message> messageList;

    @XmlElement(name = "partyLeft")
    private List<PartyLeft> partyLeftList;

    @XmlElement(name = "notice")
    private List<Notice> noticeList;
}
