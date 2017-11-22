package com.example.user.fragmentspractice;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity implements Frag1.switchTheLight {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void SwitchOnOff(boolean flag) {
        Frag2 f2 = (Frag2) getFragmentManager().findFragmentById(R.id.frag2);
        f2.ChangeTheView(flag);
    }
}
