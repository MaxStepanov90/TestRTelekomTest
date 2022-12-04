package com.example.testRTelekomTest.dto.charttranscriptdto;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "item")
public class Item {

    @XmlAttribute(name = "key")
    private String key;

    @XmlAttribute(name = "type")
    private String type;

    @XmlValue
    private String value;
}
