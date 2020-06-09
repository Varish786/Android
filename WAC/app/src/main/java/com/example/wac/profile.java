package com.example.wac;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class profile extends AppCompatActivity {
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        bt1=findViewById(R.id.btn1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://whataftercollege.com/online-summer-training-mta-hpecoc/ ";
                Uri uri=Uri.parse(url);
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                 startActivity(intent);
            }
            
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case  R.id.iten1:
                Toast.makeText(this, "item1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iten2:
                Toast.makeText(this, "Item2", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.iten3:
                Toast.makeText(this, "item3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iten4:
                Toast.makeText(this, "Item4", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.iten5:
                Toast.makeText(this, "item5", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iten6:
                Intent intent=new Intent(profile.this,MainActivity.class);
                 startActivity(intent);
                 Toast.makeText(profile.this, "Log out", Toast.LENGTH_SHORT).show();
                 break;
        }
        return super.onOptionsItemSelected(item);


    }
}