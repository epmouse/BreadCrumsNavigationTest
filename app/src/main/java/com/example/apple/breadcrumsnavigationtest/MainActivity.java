package com.example.apple.breadcrumsnavigationtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.apple.breadcrumsnavigationtest.breadcrumnavigation.BreadView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.ll_bread)
    BreadView llBread;
    @BindView(R.id.btn)
    Button btn;
    @BindView(R.id.btn_back)
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn, R.id.btn_back})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn:

                MyBread_1 myBread_1 = new MyBread_1(this);
                llBread.addView(myBread_1, item -> {

                });
                break;
            case R.id.btn_back:
                llBread.removeTopView((BreadView.CurrentItemListener<MyBread_1>) item -> {

                });
                break;
        }
    }
}
