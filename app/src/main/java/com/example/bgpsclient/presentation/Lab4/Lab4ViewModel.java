package com.example.bgpsclient.presentation.Lab4;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.bgpsclient.domain.JournalInteractor;
import com.example.bgpsclient.domain.LoadJournalException;
import com.example.bgpsclient.domain.model.JournalRecord;
import com.example.bgpsclient.presentation.Utils.ResourceWrapper;

import java.util.List;
import java.util.concurrent.Executor;

public class Lab4ViewModel extends ViewModel {

    private final Executor mExecutor;
    private final JournalInteractor mJournalInteractor;
    private final ResourceWrapper mResourceWrapper;
    private MutableLiveData<List<JournalRecord>> mJournalRecordsByGroupId = new MutableLiveData<>();
    private MutableLiveData<String> mErrors = new MutableLiveData<>();

    public Lab4ViewModel(Executor executor, JournalInteractor journalInteractor, ResourceWrapper resourceWrapper) {
        mExecutor = executor;
        mJournalInteractor = journalInteractor;
        mResourceWrapper = resourceWrapper;
        loadJournalRecords();
    }

    private void loadJournalRecords() {
        mExecutor.execute(() -> {
            try {
                List<JournalRecord> records = mJournalInteractor.loadJournalRecordByGroupId(1);
                mJournalRecordsByGroupId.postValue(records);
            } catch (LoadJournalException e) {
                mErrors.postValue(e.getMessage());
            }
        });
    }

    public LiveData<List<JournalRecord>> getJournalRecordsByGroupId() {
        return mJournalRecordsByGroupId;
    }

    public LiveData<String> getErrors() {
        return mErrors;
    }


}
