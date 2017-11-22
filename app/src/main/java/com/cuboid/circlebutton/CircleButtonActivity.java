package com.cuboid.circlebutton;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cuboid.cuboidcirclebutton.CuboidButton;

public class CircleButtonActivity extends AppCompatActivity {

    CuboidButton btn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activtiy_design);
        btn = (CuboidButton) findViewById(R.id.test_issues);
        btn.ripleEffect=true;
        btn.setCircle_hover_color(Color.YELLOW);
        btn.setCircle_border_color(Color.GREEN);
        btn.setCircle_border_radius(30);
        btn.setCr_icon(R.drawable.ic_camera);

    }
}
