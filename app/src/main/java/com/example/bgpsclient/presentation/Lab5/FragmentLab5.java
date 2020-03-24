package com.example.bgpsclient.presentation.Lab5;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bgpsclient.presentation.Lab4.Lab4ViewModel;

public class FragmentLab5 extends Fragment {

    private RecyclerView mRecyclerView;
    private Lab4ViewModel mViewModel;

    public static FragmentLab5 newInstance() {
        return new FragmentLab5();
    }
}
