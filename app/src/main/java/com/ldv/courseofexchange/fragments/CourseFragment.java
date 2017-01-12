package com.ldv.courseofexchange.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ldv.courseofexchange.R;

import org.androidannotations.annotations.EFragment;

@EFragment
public class CourseFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.course_fragment,container,false);
        return  rootView;
    }
}
