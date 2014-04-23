package com.squashedmosquito.babyshout.app.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squashedmosquito.babyshout.app.R;

/**
 * Created by Kristian on 23/04/2014.
 */
public class ParentUnitFragment extends Fragment {
    public static Fragment newInstance(){
        return new ParentUnitFragment();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_parent_unit, container, false);

        return rootView;
    }
}
