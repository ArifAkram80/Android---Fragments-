package com.example.user.fragmentspractice;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

/**
 * Created by USER on 22-Nov-17.
 */

public class Frag1 extends Fragment {
    @Nullable


    private Switch SW;
    switchTheLight SwitchListener;

    public interface switchTheLight{

        public void SwitchOnOff(boolean flag);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1,container,false);
        return view;
    }

    @Override
    public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {

        SW = view.findViewById(R.id.LightSwitch);

        SW.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    Toast.makeText(getActivity().getApplicationContext(), "ON", Toast.LENGTH_SHORT).show();
                    SwitchListener.SwitchOnOff(true);

                }
                else
                {
                    SwitchListener.SwitchOnOff(false);
                    Toast.makeText(getActivity().getApplicationContext(), "OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            SwitchListener = (switchTheLight) getActivity();
        } catch (ClassCastException e)
        {
            throw new ClassCastException("Error in retrieving data. Please try again");
        }
    }
}
