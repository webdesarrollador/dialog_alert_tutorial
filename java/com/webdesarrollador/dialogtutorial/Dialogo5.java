package com.webdesarrollador.dialogtutorial;


import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

/**
 * Created by raulrevillas on 21/12/2016.
 */

public class Dialogo5 extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();

        View view=inflater.inflate(R.layout.custom_dialog, null);
        //Inflamos nuestro layout y se lo pasamos al buider
        builder.setView(view);

        Button botonOk = (Button) view.findViewById(R.id.buttonOK);
        Button botonCancel = (Button) view.findViewById(R.id.buttonCancel);

        botonOk.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Mostramos un log y salimos del diálogo
                    Log.d("salir","Has salido");
                    dismiss();
                }
            }
        );
        botonCancel.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Simplemente cerramos el dialogo sin hacer nada
                    dismiss();
                }
            }
        );
        // Devolvemos el objeto
        return builder.create();
    }
}