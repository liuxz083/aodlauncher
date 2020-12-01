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

public class robot_fragment {

    private View view;
    private TextView temp_text;
    private int Mode = 1;
    public robot_fragment(LayoutInflater inflater, ConstraintLayout constra) {
        view = inflater.inflate(R.layout.robot_layout_1,constra,false);
        Mode = 1;

        constra.removeAllViews();
        constra.addView(view);

        ImageView image = (ImageView) view.findViewById(R.id.robot_blur_image);
        Bitmap bitmap = BitmapFactory.decodeResource(view.getResources(),R.drawable.rectangle_shadow);
        Bitmap newImg = BlurUtil.doBlur(bitmap, 1, 10);
        image.setImageBitmap(newImg);


    }


}
