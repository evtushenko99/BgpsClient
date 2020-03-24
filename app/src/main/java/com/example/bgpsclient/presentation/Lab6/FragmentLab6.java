package com.example.bgpsclient.presentation.Lab6;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bgpsclient.presentation.Lab4.Lab4ViewModel;

public class FragmentLab6 extends Fragment {

    private RecyclerView mRecyclerView;
    private Lab4ViewModel mViewModel;

    public static FragmentLab6 newInstance() {
        return new FragmentLab6();
    }
}
