package com.tcl.aodlauncher.fragments;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.tcl.aodlauncher.R;
import com.tcl.aodlauncher.Util.BlurUtil;

public class weather_fragment {

    private View view;
    private TextView temp_text;
    private int Mode = 1;
    LayoutInflater minflater;
    ConstraintLayout mconstra;
    public weather_fragment(LayoutInflater inflater, ConstraintLayout constra) {
        minflater = inflater;
        mconstra = constra;
        view = inflater.inflate(R.layout.weather_layout_1,constra,false);
        Mode = 1;


        temp_text = view.findViewById(R.id.temperature_text);

        constra.removeAllViews();
        constra.addView(view);

        ImageView image = (ImageView) view.findViewById(R.id.weather_blur_image);
        Bitmap bitmap = BitmapFactory.decodeResource(view.getResources(),R.drawable.rectangle_shadow);
        Bitmap newImg = BlurUtil.doBlur(bitmap, 1, 10);
        image.setImageBitmap(newImg);


    }
    public void setTemperature(int temp)
    {
        temp_text.setText(String.valueOf(temp));
    }
    public void setMode(int mode)
    {
        Mode = mode;
        if(Mode ==1)
            view = minflater.inflate(R.layout.weather_layout_1,mconstra,false);
        else
            view = minflater.inflate(R.layout.weather_layout_2,mconstra,false);

        mconstra.removeAllViews();
        mconstra.addView(view);

    }
}
