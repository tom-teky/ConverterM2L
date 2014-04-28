package com.example.converterm2l;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calc = (Button)findViewById(R.id.btnCalculate);
        calc.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                EditText number = (EditText)findViewById(R.id.num);
                TextView display = (TextView)findViewById(R.id.display);

                double num = Double.parseDouble(number.getText().toString());

                // first option
                num = num * 5;    

                // second option (using static method)
                num = Double.parseDouble(samplecalc.multNum(num));

                // third option (using instance method)
                samplecalc x = new samplecalc(num);
                num = x.multNum2();
                    
                display.setText(num + "");              
            }
        });
    }

    
    
    
    
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
