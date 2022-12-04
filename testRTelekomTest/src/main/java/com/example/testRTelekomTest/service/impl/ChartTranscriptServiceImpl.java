package com.example.testRTelekomTest.service.impl;

import com.example.testRTelekomTest.dto.ChatMessageDTO;
import com.example.testRTelekomTest.dto.UserDataDTO;
import com.example.testRTelekomTest.dto.charttranscriptdto.ChartTranscriptDTO;
import com.example.testRTelekomTest.dto.charttranscriptdto.Item;
import com.example.testRTelekomTest.dto.charttranscriptdto.NewParty;
import com.example.testRTelekomTest.exception.ChartTranscriptServiceException;
import com.example.testRTelekomTest.mapper.ChartTranscriptMapper;
import com.example.testRTelekomTest.mapper.ChatMessageMapper;
import com.example.testRTelekomTest.mapper.UserDataMapper;
import com.example.testRTelekomTest.model.ChartTranscript;
import com.example.testRTelekomTest.repository.ChartTranscriptRepository;
import com.example.testRTelekomTest.service.ChartTranscriptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class ChartTranscriptServiceImpl implements ChartTranscriptService {

    private final ChartTranscriptRepository repository;
    private final ChatMessageMapper chatMessageMapper;
    private final ChartTranscriptMapper chartTranscriptMapper;
    private final UserDataMapper userDataMapper;

    @Autowired
    public ChartTranscriptServiceImpl(ChartTranscriptRepository repository,
                                      ChatMessageMapper chatMessageMapper,
                                      ChartTranscriptMapper chartTranscriptMapper,
                                      UserDataMapper userDataMapper) {
        this.repository = repository;
        this.chatMessageMapper = chatMessageMapper;
        this.chartTranscriptMapper = chartTranscriptMapper;
        this.userDataMapper = userDataMapper;
    }


    @Override
    public List<UserDataDTO> findByMediaType(String mediaType) {
        try {
            List<ChartTranscript> chartTranscriptList = repository.findByMediaType(mediaType);

            if (chartTranscriptList == null || chartTranscriptList.isEmpty()) {
                throw new ChartTranscriptServiceException("Не найден по mediaType: " + mediaType);
            }

            List<ChartTranscriptDTO> chartTranscriptDTOList = chartTranscriptList.stream()
                    .map(chartTranscriptMapper::convertToDTO)
                    .collect(Collectors.toList());

            List<UserDataDTO> userDataDTOList = new ArrayList<>();

            for (ChartTranscriptDTO dto : chartTranscriptDTOList) {
                for (NewParty newParty : dto.getNewPartyList()) {
                    List<Item> userData = newParty.getUserData();

                    if (userData != null) {
                        List<UserDataDTO> collect = userData.stream()
                                .map(userDataMapper::convertToDTO)
                                .collect(Collectors.toList());
                        userDataDTOList.addAll(collect);
                    }
                }
            }
            return userDataDTOList;
        } catch (Exception e) {
            throw new ChartTranscriptServiceException(
                    "Произошла ошибка получения списка всех интеракций по mediaType = " + mediaType, e);
        }
    }

    public List<ChatMessageDTO> findByInteractionId(String interactionId) {
        try {
            ChartTranscript chartTranscript = repository.findById(interactionId)
                    .orElseThrow(() -> new ChartTranscriptServiceException("Не найден по interactionId: " + interactionId));

            ChartTranscriptDTO chartTranscriptDTO = chartTranscriptMapper.convertToDTO(chartTranscript);

            return chartTranscriptDTO.getMessageList().stream()
                    .map(chatMessageMapper::convertToDTO)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new ChartTranscriptServiceException(
                    "Произошла ошибка получения переписки по заданной интеракции = " + interactionId, e);
        }
    }
}
