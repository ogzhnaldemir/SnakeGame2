package com.example.ylandeneme3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;


public class ilk_giris extends AppCompatActivity {
ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilk_giris);
        imageButton=(ImageButton) findViewById(R.id.imageButton5);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ilk_giris.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public  class Snake{


        private Bitmap bm,bm_head_up,bm_head_down,bm_head_left,bm_head_right,bm_body_vertical,getBm_body_horizontal,bm_body_bottom_left, bm_body_bottom_right, bm_body_top_left, bm_body_top_right,
                bm_tail_up, bm_tail_down, bm_tail_right, bm_tail_left;
        private int x,y,lenght;
        private ArrayList<PartSnake>arrPartSnake=new ArrayList<>();




    }
}