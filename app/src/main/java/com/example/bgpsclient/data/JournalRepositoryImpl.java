package com.example.bgpsclient.data;

import androidx.annotation.NonNull;

import com.example.bgpsclient.data.model.JournalRecordExpanded;
import com.example.bgpsclient.domain.JournalRepository;
import com.example.bgpsclient.domain.model.JournalRecord;

import java.io.IOException;
import java.util.List;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class JournalRepositoryImpl implements JournalRepository {
    public static final String BASE_URL = "http://10.0.2.2:8080/";
    private final JournalApi mJournalApi;
    private final JournalConverterImpl mJournalConverter;

    public JournalRepositoryImpl(@NonNull JournalConverterImpl journalConverter) {
        mJournalConverter = journalConverter;
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        mJournalApi = retrofit.create(JournalApi.class);
    }


    @Override
    public List<JournalRecord> loadJournalRecordByGroupId(int groupId) throws IOException {
        Response<List<JournalRecordExpanded>> response = mJournalApi.getJournalRecordsByStudyGroup(groupId).execute();
        if (response.body() == null || response.errorBody() != null) {
            throw new IOException("Не удалось загрузить журнал");
        }
        List<JournalRecordExpanded> journalRecordExpandeds = response.body();
        return mJournalConverter.convert(journalRecordExpandeds);
    }
}
