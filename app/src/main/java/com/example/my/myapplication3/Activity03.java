package com.example.my.myapplication3;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Activity03 extends ActionBarActivity {
    //定义组件
    private EditText edtOne;
    private EditText edtTwo;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity03);
        //获取组件id
        edtOne=(EditText)findViewById(R.id.edtOne);
        edtTwo=(EditText)findViewById(R.id.edtTwo);
        btn=(Button)findViewById(R.id.btn);
        //设置按钮的监听，并在匿名内部类中实现java逻辑
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取edittext上的信息
                String factorOne=edtOne.getText().toString();
                String factorTwo=edtTwo.getText().toString();
                //创建Intent
                Intent intent = new Intent();
                //添加数据到intent中
                intent.putExtra("one", factorOne);
                intent.putExtra("two",factorTwo);
                //设置启动另一个activity
                intent.setClass(Activity03.this,ResultActivity.class);
                Activity03.this.startActivity(intent);
            }
        });
    }

    //这里是创建Menu的方法
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_activity03, menu);
        //在菜单中添加item
        menu.add(0,1,1,R.string.exit);
        menu.add(0,2,2,R.string.about);
        return true;
    }

    //这里是对所选的item的一个监听
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == 1) {
            finish();//finish()方法是结束应用的作用
        }

        return super.onOptionsItemSelected(item);
    }
}
