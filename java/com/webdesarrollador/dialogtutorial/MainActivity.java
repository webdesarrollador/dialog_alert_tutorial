package com.webdesarrollador.dialogtutorial;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDialogo1 (View view) {
        DialogFragment newFragment = new Dialogo1();
        newFragment.show(getSupportFragmentManager(), "dialogo1");
    }
    public void openDialogo2 (View view) {
        DialogFragment newFragment = new Dialogo2();
        newFragment.show(getSupportFragmentManager(), "dialogo2");
    }
    public void openDialogo3 (View view) {
        DialogFragment newFragment = new Dialogo3();
        newFragment.show(getSupportFragmentManager(), "dialogo3");
    }
    public void openDialogo4 (View view) {
        DialogFragment newFragment = new Dialogo4();
        newFragment.show(getSupportFragmentManager(), "dialogo4");
    }
    public void openDialogo5 (View view) {
        DialogFragment newFragment = new Dialogo5();
        newFragment.show(getSupportFragmentManager(), "dialogo5");
    }
}
