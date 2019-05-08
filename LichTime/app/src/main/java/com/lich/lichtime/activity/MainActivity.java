package com.lich.lichtime.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lich.lichtime.R;
import com.lich.lichtime.activity.basic.BasicActivity;
import com.lich.lichtime.activity.bottom.BottomActivity;
import com.lich.lichtime.activity.drawer.DrawerActivity;
import com.lich.lichtime.activity.empty.EmptyActivity;
import com.lich.lichtime.activity.full.FullscreenActivity;
import com.lich.lichtime.activity.login.LoginActivity;
import com.lich.lichtime.activity.master.ItemListActivity;
import com.lich.lichtime.activity.model.ModelActivity;
import com.lich.lichtime.activity.scroll.ScrollingActivity;
import com.lich.lichtime.activity.settings.SettingsActivity;
import com.lich.lichtime.activity.tab.TabActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startActivity(Class clazz) {
        startActivity(new Intent(this, clazz));
    }

    //01
    public void basic(View view) {
        startActivity(BasicActivity.class);
    }

    //02
    public void bottom(View view) {
        startActivity(BottomActivity.class);
    }

    //03
    public void empty(View view) {
        startActivity(EmptyActivity.class);
    }

    //04
    public void model(View view) {
        startActivity(ModelActivity.class);
    }

    //05
    public void full(View view) {
        startActivity(FullscreenActivity.class);
    }

    //06
    public void login(View view) {
        startActivity(LoginActivity.class);
    }

    //07
    public void master(View view) {
        startActivity(ItemListActivity.class);
    }

    //08
    public void drawer(View view) {
        startActivity(DrawerActivity.class);
    }

    //09
    public void scroll(View view) {
        startActivity(ScrollingActivity.class);
    }

    //10
    public void settings(View view) {
        startActivity(SettingsActivity.class);
    }

    //11
    public void tab(View view) {
        startActivity(TabActivity.class);
    }
}
