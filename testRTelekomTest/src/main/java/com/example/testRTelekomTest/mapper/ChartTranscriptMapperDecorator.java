package com.example.testRTelekomTest.mapper;

import com.example.testRTelekomTest.dto.charttranscriptdto.ChartTranscriptDTO;
import com.example.testRTelekomTest.exception.ChartTranscriptMapperException;
import com.example.testRTelekomTest.model.ChartTranscript;
import com.example.testRTelekomTest.util.XmlMarshallerUtils;
import lombok.extern.slf4j.Slf4j;

import javax.xml.bind.JAXBException;

@Slf4j
public abstract class ChartTranscriptMapperDecorator implements ChartTranscriptMapper {


    @Override
    public ChartTranscriptDTO convertToDTO(ChartTranscript chartTranscript) {
        try {
            return XmlMarshallerUtils.deserialize(chartTranscript.getStructuredText(), ChartTranscriptDTO.class);
        } catch (JAXBException e) {
            throw new ChartTranscriptMapperException(
                    String.format("Ошибка преобразования xml в объект с id: %s\n%s", chartTranscript.getId(), e));
        }
    }
}
