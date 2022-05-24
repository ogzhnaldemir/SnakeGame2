package com.example.ylandeneme3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class GameView extends View {
private Bitmap bmGrass1,bmGrass2;
public static  int sizeOfMap=75*Constants.SCREEN_WIDTH/1080;
private  int h =26,w=14;
private ArrayList<Grass>arrGrass=new ArrayList<>();

    public GameView(Context context, @Nullable AttributeSet attrs)

    {
        super(context, attrs);
        bmGrass1= BitmapFactory.decodeResource(this.getResources(),R.drawable.grass);
        bmGrass1=Bitmap.createScaledBitmap(bmGrass1,sizeOfMap,sizeOfMap,true);
        bmGrass2= BitmapFactory.decodeResource(this.getResources(),R.drawable.grass03);
        bmGrass2=Bitmap.createScaledBitmap(bmGrass2,sizeOfMap,sizeOfMap,true);
       for ( int i=0;i< h;i++){
           for (int j=0;j<w;j++){
               if ((i+j)%2==0){
                   arrGrass.add(new Grass(bmGrass1, j*bmGrass1.getWidth() + Constants.SCREEN_WIDTH/2 - (w/2)*bmGrass1.getWidth(),
                           i*bmGrass1.getHeight()+50*Constants.SCREEN_HEIGHT/1920, bmGrass1.getWidth(), bmGrass1.getHeight()));
               }else{
                   arrGrass.add(new Grass(bmGrass2, j*bmGrass2.getWidth() + Constants.SCREEN_WIDTH/2 - (w/2)*bmGrass2.getWidth(),
                           i*bmGrass2.getHeight()+50*Constants.SCREEN_HEIGHT/1920, bmGrass2.getWidth(), bmGrass2.getHeight()));

               }
           }

    }
    }

    public  void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.drawColor(0xFF2e2e2e);
        for (int i = 0; i < arrGrass.size(); i++) {
            canvas.drawBitmap(arrGrass.get(i).getBm(), arrGrass.get(i).getX(), arrGrass.get(i).getY(), null);
        }
    }
}

