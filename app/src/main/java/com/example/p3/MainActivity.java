package com.example.p3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.b2);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            showMenu(view);
            //registerForContextMenu(btn);
        }
    });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater mMenuInflater = getMenuInflater();
        mMenuInflater.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.action_add :
                Toast.makeText(MainActivity.this, "Add", Toast.LENGTH_SHORT).show();break;

            case R.id.action_edit :
                Toast.makeText(MainActivity.this, "Edit", Toast.LENGTH_SHORT).show();break;
            case R.id.action_delete :
                Toast.makeText(MainActivity.this, "delete", Toast.LENGTH_SHORT).show();break;
        }
        return super.onOptionsItemSelected(item);
    }



   @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        MenuInflater mMenuInflater = getMenuInflater();
        mMenuInflater.inflate(R.menu.menu_main,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.action_add :
                Toast.makeText(MainActivity.this, "Add", Toast.LENGTH_SHORT).show();break;

            case R.id.action_edit :
                Toast.makeText(MainActivity.this, "Edit", Toast.LENGTH_SHORT).show();break;
            case R.id.action_delete :
                Toast.makeText(MainActivity.this, "delete", Toast.LENGTH_SHORT).show();break;
        }
        return super.onContextItemSelected(item);
    }



    public void showMenu(View v)
    {
        PopupMenu popup =new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_main);
        popup.show();


    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem)
    {
        switch(menuItem.getItemId()) {
            case R.id.action_add:
                Log.d("Menu", "Add");
                return true;
            case R.id.action_edit:
                Log.d("Menu", "Edit");
                return true;

            case R.id.action_delete:
                Log.d ("Menu","Delete");
                return true;
             default:
                 return false;


        }
    }
}
