package com.example.bgpsclient.presentation.Lab4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bgpsclient.R;

public class FragmentLab4 extends Fragment {

    private RecyclerView mRecyclerView;
    private Lab4ViewModel mViewModel;

    public static FragmentLab4 newInstance() {
        return new FragmentLab4();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mViewModel = ViewModelProviders.of(requireActivity(), new Lab4ViewModelFactory(requireContext())).get(Lab4ViewModel.class);
        return inflater.inflate(R.layout.fragment_lab_4, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = view.findViewById(R.id.journal_recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mViewModel.getJournalRecordsByGroupId().observe(getViewLifecycleOwner(), records -> mRecyclerView.setAdapter(new JournalAdapter(records)));

    }
}
