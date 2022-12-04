package com.example.testRTelekomTest.exception;

public class ChartTranscriptServiceException extends RuntimeException {

    public ChartTranscriptServiceException(String message) {
        super(message);
    }

    public ChartTranscriptServiceException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
