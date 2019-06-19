package com.intent.wayangshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NusantaraActivity extends AppCompatActivity implements View.OnClickListener{
    private Button kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nusantara);

        getSupportActionBar().setTitle("Pertunjukan Wayang Nusantara");

        kembali = (Button)findViewById(R.id.btn_kembali);
        kembali.setOnClickListener(this);

        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button

    }


    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    @Override
    public void onClick(View v){
        if(v.getId() == R.id.btn_kembali){
            finish();
        }
    }

}