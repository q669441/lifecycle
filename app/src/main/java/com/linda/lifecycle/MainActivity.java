package com.linda.lifecycle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDail =findViewById(R.id.btnDial);
        Button  btnsecond =findViewById(R.id.btnsecond);
        Button  btnfinish  =findViewById(R.id.btnfinish);


      
        btnDail.setOnClickListener(myListener);
        btnsecond.setOnClickListener(myListener);
        btnfinish.setOnClickListener(myListener);

        Toast.makeText(getApplicationContext(), "Oncreat(1)", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart(1)", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume(1)", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart(1)", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause() {
            super.onPause();
            Toast.makeText(this, "onPauset(1)", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStopt(1)", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy(1)", Toast.LENGTH_LONG).show();
    }

    private Button.OnClickListener myListener = new Button.OnClickListener() {

        @Override

        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnDial :
                    Uri uri = Uri.parse("tel:09881234566");
                    Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                    startActivity(intent);
                    break;

                case R.id.btnsecond :
                    Intent intent1 = new Intent(MainActivity.this, secondActivity.class);
                   startActivity(intent1);
                    break;
                case R.id.btnfinish :
                    finish();
                    break;


            }
        }

    } ;
    }
}








































































































































































































































































































































































