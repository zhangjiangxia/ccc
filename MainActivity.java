package bwie.com.lianxi201830_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private MyShapeView myShapeView;
    private MyView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myShapeView = findViewById(R.id.my_shape);
        myView = findViewById(R.id.myview);
    }
}
