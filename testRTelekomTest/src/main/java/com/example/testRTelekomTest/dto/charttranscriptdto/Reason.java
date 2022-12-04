package com.example.testRTelekomTest.dto.charttranscriptdto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "reason")
public class Reason {

    @XmlValue
    private String value;

    @XmlAttribute(name = "code")
    private String code;
}
