package acy.artugue.com.artugueacylab4;

import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.Snackbar;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4itb", "onCreate() has been executed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4itb", "onStart() has been executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4itb", "onResume() has been executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4itb", "onPause() has been executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4itb", "onStop() has been executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4itb", "onDestroy() has been executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4itb", "onRestart() has been executed");
         }

        public void showToast(View v){
            Toast.makeText(this,"4ITB", Toast.LENGTH_LONG).show();
        }

        public void showSnackbar(View v){
            Snackbar.make(v,"ICS 115", Snackbar.LENGTH_LONG).show();
        }
    }
