package com.sauce.mytablayout.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sauce.mytablayout.R;
import com.sauce.mytablayout.model.tabModel_1;


/**
 * Created by user on 2018-06-11.
 */

public class tabHolder_1 extends RecyclerView.ViewHolder {

    public ImageView itemImage; // ex :
    public TextView itemDate; // ex :

    public tabHolder_1(View itemView) {
        super(itemView);

        initView(itemView);

    }

    public void initView(View itemView) {

        itemImage = (ImageView) itemView.findViewById(R.id.item_image);
        itemDate = (TextView) itemView.findViewById(R.id.item_date);

    }

    public void bind(tabModel_1 model) {

        itemDate.setText(model.getDate().toString());

        switch (model.getImage()) {
            case 1:

                itemImage.setImageResource(R.drawable.img_20181208_1_005);
                break;

            case 2:

                itemImage.setImageResource(R.drawable.img_20181213_2_005);
                break;

            case 3:

                itemImage.setImageResource(R.drawable.img_20181224_3_005);
                break;

            case 4:

                itemImage.setImageResource(R.drawable.img_20181226_4_005);
                break;

            case 5:

                itemImage.setImageResource(R.drawable.img_20190116_5_005);
                break;

            case 6:

                itemImage.setImageResource(R.drawable.img_20190116_6_005);
                break;

            case 7:

                itemImage.setImageResource(R.drawable.img_20190116_7_005);
                break;
        }

    }
}
