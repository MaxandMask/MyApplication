package com.dadiapp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private InputMethodLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView() {
        layout = (InputMethodLayout) findViewById(R.id.input_method_layout);
        layout.setOnkeyboarddStateListener(new InputMethodLayout.onKeyboardsChangeListener() {// 监听软键盘状态

            @Override
            public void onKeyBoardStateChange(int state) {
                // TODO Auto-generated method stub
                switch (state) {
                    case InputMethodLayout.KEYBOARD_STATE_SHOW:
                        Toast.makeText(MainActivity.this, "打开软键盘", 1000).show();
                        break;
                    case InputMethodLayout.KEYBOARD_STATE_HIDE:
                        Toast.makeText(MainActivity.this, "关闭软键盘", 1000).show();
                        break;
                }
            }
        });
    }
}
