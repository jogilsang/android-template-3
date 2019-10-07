package com.sauce.mytablayout.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.sauce.mytablayout.frag.TabFragment2;
import com.sauce.mytablayout.frag.TabFragment3;
import com.sauce.mytablayout.frag.TabFragment4;
import com.sauce.mytablayout.frag.TabFragment5;
import com.sauce.mytablayout.frag.TabFragment6;

/**
 * Created by Junyoung on 2016-06-23.
 */

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    // Count number of tabs
    private int tabCount;

    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        // Returning the current tabs
        switch (position) {
            case 0:
                TabFragment2 tabFragment2 = new TabFragment2();
                return tabFragment2;
            case 1:
                TabFragment3 tabFragment3 = new TabFragment3();
                return tabFragment3;
            case 2:
                TabFragment4 tabFragment4 = new TabFragment4();
                return tabFragment4;

            case 3:
                TabFragment5 tabFragment5 = new TabFragment5();
                return tabFragment5;

            case 4:
                TabFragment6 tabFragment6 = new TabFragment6();
                return tabFragment6;


            default:



                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
