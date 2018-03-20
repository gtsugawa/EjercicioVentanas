package com.example.u_22_et.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Main2Activity extends AppCompatActivity {

    ImageView im1,im2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        im1 = findViewById(R.id.imageView);
        im2 = findViewById(R.id.imageView2);
        String url1 = "http://www.programadoresperuanos.com/test_app/picasso/imagen1.jpg";
        String url2 = "http://www.programadoresperuanos.com/test_app/picasso/imagen2.jpg";
        Picasso.get().load(url1).error(R.drawable.error).fit().placeholder(R.drawable.error).into(im1);
        Picasso.get().load(url2).error(R.drawable.error).fit().placeholder(R.drawable.error).into(im2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu m) {
        getMenuInflater().inflate(R.menu.primer_menu,m);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem i) {
        switch (i.getItemId())
        {
            case R.id.opcion1:
                Intent intento1 = new Intent(this,MainActivity.class);
                startActivity(intento1);
                return true;
            case R.id.opcion2:
                Intent intento2 = new Intent(this,Main2Activity.class);
                startActivity(intento2);
                return true;
            case R.id.opcion3:
                Intent intento3 = new Intent(this,Main3Activity.class);
                startActivity(intento3);
                return true;
            default:
                return super.onOptionsItemSelected(i);
        }
    }
}
