package com.example.bgpsclient.data;

import com.example.bgpsclient.data.model.JournalRecordExpanded;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JournalApi {
    @GET("/study_group/{studyGroupId}")
    Call<List<JournalRecordExpanded>> getJournalRecordsByStudyGroup(@Path("studyGroupId") int studyGroupId);

    @GET("/journal")
    Call<List<JournalRecordExpanded>> getAllJournalRecords();
}
