package com.example.bgpsclient.presentation.Lab4;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.bgpsclient.data.JournalConverterImpl;
import com.example.bgpsclient.data.JournalRepositoryImpl;
import com.example.bgpsclient.domain.JournalInteractor;
import com.example.bgpsclient.domain.JournalRepository;
import com.example.bgpsclient.presentation.Utils.ResourceWrapper;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Lab4ViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private final Executor mExecutor;
    private final JournalInteractor mJournalInteractor;
    private final ResourceWrapper mResourceWrapper;

    public Lab4ViewModelFactory(Context context) {
        mExecutor = Executors.newFixedThreadPool(2);
        JournalRepository journalRepository = new JournalRepositoryImpl(new JournalConverterImpl());
        mJournalInteractor = new JournalInteractor( journalRepository);
        mResourceWrapper = new ResourceWrapper(context.getResources());
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (Lab4ViewModel.class.equals(modelClass)) {
            return (T) new Lab4ViewModel(
                    mExecutor,
                    mJournalInteractor,
                    mResourceWrapper);
        }
        return super.create(modelClass);
    }
}
