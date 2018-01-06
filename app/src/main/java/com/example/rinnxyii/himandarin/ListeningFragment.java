package com.example.rinnxyii.himandarin;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ListeningFragment extends Fragment {

    public ListeningFragment() {
        // Required empty public constructor
    }

    public static ListeningFragment newInstance() {
        ListeningFragment fragment = new ListeningFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_listening, container, false);
    }


}
