package com.tcl.aodlauncher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.tcl.aodlauncher.BadgeView.Badge;
import com.tcl.aodlauncher.BadgeView.QBadgeView;
import com.tcl.aodlauncher.Util.BlurUtil;
import com.tcl.aodlauncher.Util.ImageBlur;
import com.tcl.aodlauncher.Util.StackBlurManager;
import com.tcl.aodlauncher.fragments.message_fragment;
import com.tcl.aodlauncher.fragments.robot_fragment;
import com.tcl.aodlauncher.fragments.schedule_fragment;
import com.tcl.aodlauncher.fragments.weather_fragment;


public class MainActivity extends AppCompatActivity {

    ImageView image;

    Badge badge;

    private int mode=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weather_fragment weather = new weather_fragment(LayoutInflater.from(this),(ConstraintLayout) findViewById(R.id.weather_fragment_layout));
        robot_fragment robot = new robot_fragment(LayoutInflater.from(this),(ConstraintLayout) findViewById(R.id.robot_fragment_layout));
        schedule_fragment schedule = new schedule_fragment(LayoutInflater.from(this),(ConstraintLayout) findViewById(R.id.schedule_fragment_layout));
        message_fragment message = new message_fragment(LayoutInflater.from(this),(ConstraintLayout) findViewById(R.id.message_fragment_layout));


        Button myButton2 = (Button)findViewById(R.id.button);

        myButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               // Toast.makeText(MainActivity.this,"you click the button2",Toast.LENGTH_SHORT).show();
                if(mode ==1 )
                    mode = 2;
                else if(mode ==2 )
                    mode = 1;

                weather.setMode(mode);
                schedule.setMode(mode);
                message.setMode(mode);

            }
        });

 //       weather.setTemperature(40);

/*
        View view= inflater.inflate(R.layout.weather_layout_1,lin,false);

        //ConstraintLayout layout = (ConstraintLayout)inflater.inflate(R.layout.weather_layout_1,lin,false).findViewById(R.id.weather_constra_layout);
        TextView tv = view.findViewById(R.id.temperature_text);
        tv.setText("30");


        lin.removeAllViews();
        lin.addView(view);


        image = (ImageView) findViewById(R.id.imageView3);

        BitmapDrawable bitmapDrawable = (BitmapDrawable) getResources().getDrawable(R.drawable.rectangle_shadow);
        final StackBlurManager stackBlurManager = new StackBlurManager(bitmapDrawable.getBitmap());
        image.setImageBitmap(stackBlurManager.process(10));

 //       ImageBlur.makeBlur(image, this);
        Bitmap bitmap;
        bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.rectangle_shadow);
        Bitmap newImg = BlurUtil.doBlur(bitmap, 1, 100);
        image.setImageBitmap(newImg);

        badge = new QBadgeView(this).bindTarget(image).setBadgeText("PNG").setBadgeTextColor(0x00000000)
                .setBadgeGravity(Gravity.TOP | Gravity.END)
                .setBadgeBackground(getResources().getDrawable(R.drawable.back01));
*/
    }
}