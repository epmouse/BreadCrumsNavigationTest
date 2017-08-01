package com.example.apple.breadcrumsnavigationtest;

import android.content.Context;
import android.graphics.Color;
import android.provider.ContactsContract;

import com.example.apple.breadcrumsnavigationtest.breadcrumnavigation.BaseVH;
import com.example.apple.breadcrumsnavigationtest.breadcrumnavigation.BreadView;

import java.util.List;

/**
 * Created by stars on 17/8/1.
 */

public class MyBread_1 extends BreadView.BaseBreadItem {

    public String str;
    public List<ContactsContract.Contacts> list;

    public MyBread_1(Context context) {
        super(context);
    }

    @Override
    public int setLayout() {
        return R.layout.bread_item_layout;
    }

    @Override
    public void setViewHight(BaseVH view, BreadView.BaseBreadItem item) {
          view.setText(R.id.tv,"aa").setTextColor(R.id.tv, Color.RED).setImgUrl(R.id.iv,R.drawable.photochoice_sle);
    }

    @Override
    public void setNoViewHight(BaseVH view, BreadView.BaseBreadItem item) {
        view.setText(R.id.tv,"aa").setTextColor(R.id.tv, Color.GRAY).setImgUrl(R.id.iv,R.drawable.photochoice_nor);
    }
}
