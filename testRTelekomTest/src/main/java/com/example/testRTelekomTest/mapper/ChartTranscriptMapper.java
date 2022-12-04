package com.example.testRTelekomTest.mapper;

import com.example.testRTelekomTest.dto.charttranscriptdto.ChartTranscriptDTO;
import com.example.testRTelekomTest.model.ChartTranscript;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
@DecoratedWith(ChartTranscriptMapperDecorator.class)
public interface ChartTranscriptMapper {

    ChartTranscriptDTO convertToDTO(ChartTranscript chartTranscript);
}
