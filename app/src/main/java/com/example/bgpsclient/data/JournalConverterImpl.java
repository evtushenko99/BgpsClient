package com.example.bgpsclient.data;

import androidx.annotation.NonNull;

import com.example.bgpsclient.data.model.JournalRecordExpanded;
import com.example.bgpsclient.domain.JournalConverter;
import com.example.bgpsclient.domain.model.JournalRecord;

import java.util.ArrayList;
import java.util.List;

public class JournalConverterImpl implements JournalConverter<List<JournalRecordExpanded>, List<JournalRecord>> {
    @NonNull
    @Override
    public List<JournalRecord> convert(@NonNull List<JournalRecordExpanded> journalRecordExpandeds) {
        List<JournalRecord> result = new ArrayList<>();
        for (JournalRecordExpanded record : journalRecordExpandeds) {
            result.add(new JournalRecord(
                    record.getId(),
                    record.getCount(),
                    record.getStudentFulName(),
                    record.getSubjectName(),
                    record.getSubjectShortName(),
                    record.getExamType(),
                    record.getMarkName(),
                    record.getMarkValue()
            ));
        }
        return result;
    }
}
