package com.example.testRTelekomTest.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;


@Entity
@Table(name = "CHARTTRANSCRIPT")
@EqualsAndHashCode(callSuper = true)
@Data
public class ChartTranscript extends SuperEntity {

    @Column(name = "MEDIATYPE")
    private String mediaType;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "STRUCTUREDTEXT")
    private String structuredText;
}
