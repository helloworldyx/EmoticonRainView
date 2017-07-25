package com.nope.hyx;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.nope.hyx.rain.EmoticonRainView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EmoticonRainView mRainView;
    private Button btnStartRain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRainView = (EmoticonRainView) findViewById(R.id.emoticon_rain_view);
        btnStartRain = (Button) findViewById(R.id.btn_start_rain);
        btnStartRain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EmoticonRainView.Conf conf = new EmoticonRainView.Conf.Builder().bitmaps(getBitmaps()).build();
                mRainView.start(conf);
            }
        });
    }

    public List<Bitmap> getBitmaps(){
        List<Bitmap> bitmaps = new ArrayList<>();
        bitmaps.add(BitmapFactory.decodeResource(getResources(), R.drawable.baby));
        bitmaps.add(BitmapFactory.decodeResource(getResources(), R.drawable.paper));
        return bitmaps;
    }
}
