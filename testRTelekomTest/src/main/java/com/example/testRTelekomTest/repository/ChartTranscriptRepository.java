package com.example.testRTelekomTest.repository;

import com.example.testRTelekomTest.model.ChartTranscript;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChartTranscriptRepository extends CrudRepository<ChartTranscript, String> {

    List<ChartTranscript> findByMediaType(String mediaType);
}
