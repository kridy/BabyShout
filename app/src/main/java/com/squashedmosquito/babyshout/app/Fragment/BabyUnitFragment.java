package com.squashedmosquito.babyshout.app.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squashedmosquito.babyshout.app.R;

/**
 * Created by krd on 23-04-2014.
 */
public class BabyUnitFragment extends Fragment {


    public static Fragment newInstance(){
        return new BabyUnitFragment();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_baby_unit, container, false);

        return rootView;
    }
}
