package com.rajibroy.technovotest.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.rajibroy.technovotest.R;


public class DialogUtils {
    // Basic Positive Negetive Neutral
    public static void showAlertDialog(Context context, int titleRes, int positiveRes, int neutralRes,
                                       int negetiveRes, ButtonCallbacks callbacks) {
        new MaterialAlertDialogBuilder(context)
                .setTitle(titleRes)
                .setPositiveButton(positiveRes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        callbacks.positive();
                        dialog.dismiss();
                    }
                })
                .setNeutralButton(neutralRes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        callbacks.neutral();
                        dialog.dismiss();
                    }
                })
                .setNegativeButton(negetiveRes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        callbacks.negetive();
                        dialog.dismiss();
                    }
                })
                .show();
    }

    // Basic Positive Negetive
    public static void showAlertDialog(Context context, int titleRes, int positiveRes,
                                       int negetiveRes, ButtonCallbacks callbacks) {
        new MaterialAlertDialogBuilder(context)
                .setTitle(titleRes)
                .setPositiveButton(positiveRes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        callbacks.positive();
                        dialog.dismiss();
                    }
                })
                .setNegativeButton(negetiveRes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        callbacks.negetive();
                        dialog.dismiss();
                    }
                })
                .show();
    }
    // positive only
    public static void showAlertDialog(Context context, int titleRes, int positiveRes,
                                       ButtonCallbacks callbacks) {
        new MaterialAlertDialogBuilder(context)
                .setTitle(titleRes)
                .setPositiveButton(positiveRes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        callbacks.positive();
                        dialog.dismiss();
                    }
                })
                .show();
    }


    // Option Selection Dialog

    public static void showSelectionTypeDialog(Context context, int titleRes, int itemRes, ClickCallbacks callbacks) {
        new MaterialAlertDialogBuilder(context)
                .setTitle(titleRes)
                .setItems(itemRes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        callbacks.click(which);
                        dialog.dismiss();
                    }
                })
                .show();
    }


    // Edit text Options

    public static void showEditTextDialog(Context context, int titleRes, int layoutID, int positiveRes,
                                          int negetiveRes, String preset, EditCallbacks callbacks) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutID, null, false);
        EditText textView = view.findViewById(R.id.number);
        textView.setText(preset);

        new MaterialAlertDialogBuilder(context)
                .setTitle(titleRes)
                .setView(view)
                .setPositiveButton(positiveRes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (textView.getText() != null && !textView.getText().toString().isEmpty())
                            callbacks.positive(textView.getText().toString());
                        dialog.dismiss();
                    }
                })
                .setNegativeButton(negetiveRes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        callbacks.negetive();
                        dialog.dismiss();
                    }
                })
                .show();
    }

    public static void showEditTextDialog(Context context, String titleRes, int layoutID, String positiveRes,
                                          String negetiveRes, String preset, EditCallbacks callbacks) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutID, null, false);
        EditText textView = view.findViewById(R.id.number);
        textView.setText(preset);

        new MaterialAlertDialogBuilder(context)
                .setTitle(titleRes)
                .setView(view)
                .setPositiveButton(positiveRes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (textView.getText() != null && !textView.getText().toString().isEmpty())
                            callbacks.positive(textView.getText().toString());
                        dialog.dismiss();
                    }
                })
                .setNegativeButton(negetiveRes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        callbacks.negetive();
                        dialog.dismiss();
                    }
                })
                .show();
    }






    public interface RatingCallbacks {
        void negetive();
        void positive(int rating,String review, String pharmacyReview);
    }


    public interface Callbacks {
        void click(int position);

        void negetive();

        void positive();

        void neutral();
    }

    public interface ButtonCallbacks {
        void negetive();

        void positive();

        void neutral();
    }

    public interface ClickCallbacks{
        void click(int position);
    }

    public interface EditCallbacks {
        void negetive();

        void positive(String value);
    }

}
