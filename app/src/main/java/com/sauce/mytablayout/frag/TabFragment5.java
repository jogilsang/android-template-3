package com.sauce.mytablayout.frag;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sauce.mytablayout.R;
import com.sauce.mytablayout.adapter.ItemListAdapter;
import com.sauce.mytablayout.model.itemModel;
import com.sauce.mytablayout.model.tabModel_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Junyoung on 2016-06-23.
 */

public class TabFragment5 extends Fragment {

    private RecyclerView mRecycler;
    private ItemListAdapter mAdapter;
    public LinearLayoutManager mLinearManager;
    public final List<itemModel> itemList = new ArrayList<itemModel>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.frag_tab_5, container, false);

        initView(rootView);

        return rootView;
    }

    public void initView(View v){

        mRecycler = (RecyclerView)v.findViewById(R.id.item_list);

    }

    public void initSet(){

        mLinearManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        //mLinearManager.setStackFromEnd(true);

        mAdapter = new ItemListAdapter(getContext(), itemList, 3);
        mRecycler.setLayoutManager(mLinearManager);
        mRecycler.setAdapter(mAdapter);

    }

    public void initData(){

        // 리스트가 비어있지않다면
        if(itemList.size() != 0) {

        }
        else {

            // Add a new sent message to the list.
            itemModel item1 = new tabModel_1(1, "2018-12-08");
            itemModel item2 = new tabModel_1(2, "2018-12-13");
            itemModel item3 = new tabModel_1(3, "2018-12-24");
            itemModel item4 = new tabModel_1(4, "2018-12-26");
            itemModel item5 = new tabModel_1(5, "2019-01-16");
            itemModel item6 = new tabModel_1(6, "2019-01-16");
            itemModel item7 = new tabModel_1(7, "2019-01-16");

            itemList.add(item1);
            itemList.add(item2);
            itemList.add(item3);
            itemList.add(item4);
            itemList.add(item5);
            itemList.add(item6);
            itemList.add(item7);

            // Notify recycler view insert one new data.
            //mAdapter.notifyItemInserted(0);

            // Scroll RecyclerView to the last message.
            //mRecycler.scrollToPosition(0);

            mAdapter.notifyDataSetChanged();

        }


    }

}
