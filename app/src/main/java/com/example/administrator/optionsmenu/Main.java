package com.example.administrator.optionsmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0,1,1,"保存");
        menu.add(0,2,2,"退出");
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId()==2)
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
