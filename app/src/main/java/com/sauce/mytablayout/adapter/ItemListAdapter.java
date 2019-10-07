package com.sauce.mytablayout.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sauce.mytablayout.R;
import com.sauce.mytablayout.model.itemModel;
import com.sauce.mytablayout.model.tabModel_1;
import com.sauce.mytablayout.viewholder.tabHolder_1;

import java.util.List;


/**
 * Created by user on 2018-06-11.
 */

public class ItemListAdapter extends RecyclerView.Adapter{


    public Context mContext;
    public List<itemModel> mItemList;
    public int mTabinfo;   // 탭에 맞는 아이템 받아오기


    public ItemListAdapter(Context context, List<itemModel> itemList, int tabInfo) {
        mContext = context;
        mItemList = itemList;
        mTabinfo = tabInfo;
    }

        @Override
        public int getItemCount() {
            return mItemList.size();
        }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    // Inflates the appropriate layout according to the ViewType.
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


            // viewHolder 레이아웃 선택
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_tab_1, parent, false);

            // viewHolder 리턴
            return new tabHolder_1(view);

        }



        // Passes the message object to a ViewHolder so that the contents can be bound to UI.
        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

                    tabModel_1 item1 = (tabModel_1) mItemList.get(position);
                    ((tabHolder_1)holder).bind(item1);


        }

    }



