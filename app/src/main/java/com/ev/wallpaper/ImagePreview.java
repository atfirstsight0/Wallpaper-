package com.ev.wallpaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImagePreview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_preview);

        // Get intent data
        Intent i = getIntent();

        // Selected image id
        Integer imageResource = i.getExtras().getInt("id"); // Explicit Intent received  from
        ImageView imageView = (ImageView) findViewById(R.id.full_image_view); //MainActivity
        imageView.setImageResource(imageResource);
    }
}
