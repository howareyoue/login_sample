package com.example.login_sample;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.text.AttributedCharacterIterator;

public class chinaItemView extends LinearLayout {

    TextView textView;
    ImageView imageView;

    public chinaItemView(Context context) {
        super(context);
        init(context);
    }

    public chinaItemView(Context context, @Nullable AttributeSet attrs){
        super(context, attrs);

    }
    private void init(Context context) {
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.korea_item,this,true);
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);
    }
    public void setName(String name){
        textView.setText(name);
    }
    public void setImage(int resid){
        imageView.setImageResource(resid);
    }
}
