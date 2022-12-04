package com.example.testRTelekomTest.service;

import com.example.testRTelekomTest.dto.ChatMessageDTO;
import com.example.testRTelekomTest.dto.UserDataDTO;

import java.util.List;


public interface ChartTranscriptService {

    List<UserDataDTO> findByMediaType(String mediaType);

    List<ChatMessageDTO> findByInteractionId(String interactionId);
}
