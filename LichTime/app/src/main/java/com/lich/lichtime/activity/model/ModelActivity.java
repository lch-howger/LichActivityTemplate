package com.lich.lichtime.activity.model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lich.lichtime.R;
import com.lich.lichtime.activity.model.ui.model.ModelFragment;

public class ModelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.model_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ModelFragment.newInstance())
                    .commitNow();
        }
    }
}
