package com.example.testRTelekomTest.mapper;

import com.example.testRTelekomTest.dto.UserDataDTO;
import com.example.testRTelekomTest.dto.charttranscriptdto.Item;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDataMapper {

    UserDataDTO convertToDTO(Item item);
}
