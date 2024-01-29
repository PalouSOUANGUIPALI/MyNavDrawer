package com.openclassrooms.mynavdrawer.Controllers.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.openclassrooms.mynavdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ParamsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ParamsFragment extends Fragment {
    public ParamsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance
     * @return A new instance of fragment ParamsFragment.
     */
    public static ParamsFragment newInstance() {
       return(new ParamsFragment());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_params, container, false);
    }
}