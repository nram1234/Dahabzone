package com.dahabzone.android.dahabzone.Dialog;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import com.dahabzone.android.dahabzone.HoldData;
import com.dahabzone.android.dahabzone.R;

public class Fre   extends DialogFragment  {
    ImageView imageView;
    Button button;
    TextView textView,textView2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.dialog_layout,container,false);
        getDialog().setTitle(HoldData.name);

        textView=view.findViewById(R.id.textView);
        textView2=view.findViewById(R.id.textView2);
        imageView=view.findViewById(R.id.imageView);
        textView.setText(HoldData.des);
        textView2.setText(HoldData.phone);
        imageView.setImageResource(HoldData.image);


        return view;
    }

    }