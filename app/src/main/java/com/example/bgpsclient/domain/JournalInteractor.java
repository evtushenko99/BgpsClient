package com.example.bgpsclient.domain;

import com.example.bgpsclient.domain.model.JournalRecord;

import java.io.IOException;
import java.util.List;

public class JournalInteractor {
    private final JournalRepository mJournalRepository;

    public JournalInteractor(JournalRepository journalRepository) {
        mJournalRepository = journalRepository;

    }

    public List<JournalRecord> loadJournalRecordByGroupId(int id) throws LoadJournalException {
        try {
            return mJournalRepository.loadJournalRecordByGroupId(id);
        } catch (IOException e) {
            throw new LoadJournalException(e.getMessage(), e);
        }
    }
}
