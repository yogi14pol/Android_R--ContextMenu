package com.clicks.yogi.contextmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        registerForContextMenu(btn1);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo){

        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Languages");
        menu.add(0,v.getId(),1,"Java");
        menu.add(0,v.getId(),4,"HTML");
        menu.add(0,v.getId(),3,"CSS");
        menu.add(0,v.getId(),2,"Javascript");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        Toast.makeText(this, "Clciked on " + item.getTitle(),
                Toast.LENGTH_SHORT).show();
        return true;
    }
}