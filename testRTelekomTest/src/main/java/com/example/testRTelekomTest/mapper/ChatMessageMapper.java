package com.example.testRTelekomTest.mapper;

import com.example.testRTelekomTest.dto.ChatMessageDTO;
import com.example.testRTelekomTest.dto.charttranscriptdto.Message;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ChatMessageMapper {

    @Mapping(source = "msgText.value", target = "messageText")
    ChatMessageDTO convertToDTO(Message message);
}
