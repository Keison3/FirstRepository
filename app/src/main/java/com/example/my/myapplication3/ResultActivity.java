package com.example.my.myapplication3;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ResultActivity extends ActionBarActivity {
    //定义组件
    //private TextView txt1;
    private TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        //获取组件id
        txt2=(TextView)findViewById(R.id.txt2);
        //该activity由Activity03启动的，下面获取其传来的信息内容
        //创建Intent
        Intent intent = getIntent();
        //获取intent里面的值
        String factorStrone = intent.getStringExtra("one");
        String factorStrtwo = intent.getStringExtra("two");
        //转化为int型
        int factorIntone = Integer.parseInt(factorStrone);
        int factorInttwo = Integer.parseInt(factorStrtwo);
        int result = factorIntone*factorInttwo;
        //设置显示的结果
        txt2.setText(result+"");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_result, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
