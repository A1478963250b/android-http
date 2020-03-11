package com.example.testlayout.ui.gallery;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.testlayout.R;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    private TextView tt;
    private TextView ttt;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {



        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        //final TextView textView = root.findViewById(R.id.text_gallery);

        final TextView tt = root.findViewById(R.id.m1s1);
        tt.setText("Sensor1:          666");
        tt.setBackgroundColor(Color.rgb(255,50,159));

        final TextView ttt = root.findViewById(R.id.m1s2);
        ttt.setText("Sensor2:          888");
        ttt.setBackgroundColor(Color.rgb(0,255,0));


        galleryViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);
            }
        });
        return root;


    }
}