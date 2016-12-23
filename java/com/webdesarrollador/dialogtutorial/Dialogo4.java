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

public class Dialogo4 extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        //Elementos de la lista
        final String[] items = {"Pop", "Dance", "Rock"};
        //Definimos los elementos que esta seleccionados
        final boolean[] items_checked = {false,true,true};

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.opciones)
            .setMultiChoiceItems(items,items_checked, new DialogInterface.OnMultiChoiceClickListener() {
                public void onClick(DialogInterface dialog, int which,boolean isChecked) {
                    //El entero which representará a los elementos de la lista seleccionados
                    Log.d("opcion", items[which]);
                }
            });
        return builder.create();
    }
}





