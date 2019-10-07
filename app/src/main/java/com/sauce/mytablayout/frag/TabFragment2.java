package com.sauce.mytablayout.frag;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sauce.mytablayout.R;

/**
 * Created by Junyoung on 2016-06-23.
 */

public class TabFragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.frag_tab_2, container, false);

        initView(rootView);

        return rootView;



    }


    public void initView(View v){

    }
}
