package com.example.user.fragmentspractice;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by USER on 22-Nov-17.
 */

public class Frag2 extends Fragment {

    TextView Hybrid;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2,container,false);
        return  view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Hybrid = (TextView) view.findViewById(R.id.HybridView);
    }

    protected void  ChangeTheView(boolean BOOL)
    {
        if(BOOL){
            Hybrid.setText("Hybrid View");
        }
        else{
            Hybrid.setText("Normal View");
        }
    }


}
