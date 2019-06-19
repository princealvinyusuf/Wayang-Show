package com.intent.wayangshow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class FavoriteActivity extends AppCompatActivity implements View.OnClickListener{
    private Button detail1, detail2, share1, share2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        detail1 = (Button)findViewById(R.id.btn_set_detail);
        detail1.setOnClickListener(this);
        detail2 = (Button)findViewById(R.id.btn_set_detailsss);
        detail2.setOnClickListener(this);

        share1 = (Button)findViewById(R.id.btn_set_share);
        share1.setOnClickListener(this);
        share2 = (Button)findViewById(R.id.btn_set_sharesss);
        share2.setOnClickListener(this);

        getSupportActionBar().setTitle("Pertunjukan Wayang Terfavorite");

        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
    }

    @Override
    public void onClick(View v){
        if (v.getId() == R.id.btn_set_detail){
            Intent intent = new Intent(this, ListrikActivity.class);
            startActivity(intent);

        }
        else if (v.getId() == R.id.btn_set_detailsss){
            Intent intent = new Intent(this, JawaActivity.class);
            startActivity(intent);

        }
        else if (v.getId() == R.id.btn_set_share){
            Toast.makeText(this, "Berhasil Dibagikan", Toast.LENGTH_SHORT).show();

        }
        else if (v.getId() == R.id.btn_set_sharesss){
            Toast.makeText(this, "Berhasil Dibagikan", Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

}
