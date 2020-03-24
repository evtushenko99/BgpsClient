package com.example.bgpsclient.domain;

import androidx.annotation.NonNull;

import com.example.bgpsclient.domain.model.JournalRecord;

import java.io.IOException;
import java.util.List;

public interface JournalRepository {
    List<JournalRecord> loadJournalRecordByGroupId(int groupId) throws IOException;

}
