package com.webdesarrollador.dialogtutorial;


import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;

/**
 * Created by raulrevillas on 21/12/2016.
 */

public class Dialogo2 extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        //Elementos de la lista
        final String[] items = {"Pop", "Dance", "Rock"};

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.opciones)
            .setItems(items, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    //El entero which representa el elemento de la lista seleccionado
                    Log.d("opcion", items[which]);
                }
            });
        return builder.create();
    }
}
