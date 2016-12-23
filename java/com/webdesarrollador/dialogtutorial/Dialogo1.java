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

public class Dialogo1 extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Definimos el objeto builder, con el que construiremos el dialogo
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        //Definimos el título
        builder.setTitle(R.string.titulo)
            //Definimos el mensaje
            .setMessage(R.string.mensaje1)
            //Definimos botón positivo
            .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    //Mostramos un log
                    Log.d("salir","Has salido");
                }
            })
            //Botón negativo
            .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    //Simplemente cerramos el dialogo sin hacer nada
                    dismiss();
                }
            });
        // Devolvemos el objeto
        return builder.create();
    }
}
