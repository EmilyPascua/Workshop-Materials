package com.example.acm_demo.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.acm_demo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Announcements extends Fragment {


    public Announcements() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Announcements");
        return inflater.inflate(R.layout.fragment_announcements, container, false);
    }

}
