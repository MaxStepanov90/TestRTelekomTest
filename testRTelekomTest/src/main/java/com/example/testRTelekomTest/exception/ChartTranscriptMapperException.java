package com.example.testRTelekomTest.exception;

import com.example.testRTelekomTest.dto.charttranscriptdto.Message;

public class ChartTranscriptMapperException extends RuntimeException {

    public ChartTranscriptMapperException(String message) {
        super(message);
    }

    public ChartTranscriptMapperException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
