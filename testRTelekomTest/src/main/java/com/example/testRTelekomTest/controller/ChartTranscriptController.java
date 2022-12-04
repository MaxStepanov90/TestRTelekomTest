package com.example.testRTelekomTest.controller;

import com.example.testRTelekomTest.dto.ChatMessageDTO;
import com.example.testRTelekomTest.dto.UserDataDTO;
import com.example.testRTelekomTest.service.ChartTranscriptService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import java.util.List;


@Slf4j
@Validated
@RestController
@RequestMapping("/v1")
@Tag(name = "Чат", description = "методы для работы с чатом")
public class ChartTranscriptController {

    private final ChartTranscriptService service;

    @Autowired
    public ChartTranscriptController(ChartTranscriptService service) {
        this.service = service;
    }


    @GetMapping(value = "/interactionsList")
    @Operation(summary = "Список данных пользователей")
    public ResponseEntity<List<UserDataDTO>> findByMediaType(@Parameter(description = "Тип")
                                                             @NotBlank(message = "mediaType - обязательно поле")
                                                             @RequestParam(name = "mediaType") String mediaType) {

        List<UserDataDTO> userDataDTOList = service.findByMediaType(mediaType);
        return new ResponseEntity<>(userDataDTOList, HttpStatus.OK);
    }

    @GetMapping("/interaction/{id}")
    @Operation(summary = "Информация о сообщениях по заданной интеракции")
    public HttpEntity<List<ChatMessageDTO>> findById(@Parameter(description = "id сессии")
                                                     @PathVariable String id) {
        List<ChatMessageDTO> chatMessageDTOList = service.findByInteractionId(id);
        return new ResponseEntity<>(chatMessageDTOList, HttpStatus.OK);
    }

}
