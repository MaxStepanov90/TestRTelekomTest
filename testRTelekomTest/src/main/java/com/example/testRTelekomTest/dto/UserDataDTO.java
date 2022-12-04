package com.example.testRTelekomTest.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Данные пользователей")
public class UserDataDTO {

    @Schema(description = "название")
    private String key;
    @Schema(description = "тип")
    private String type;
    @Schema(description = "автор")
    private String value;
}
