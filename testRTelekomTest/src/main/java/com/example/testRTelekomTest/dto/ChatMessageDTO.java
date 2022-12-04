package com.example.testRTelekomTest.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "сообщение чата")
public class ChatMessageDTO {

    @Schema(description = "автор")
    private String userId;
    @Schema(description = "время")
    private String timeShift;
    @Schema(description = "текст")
    private String messageText;
}
