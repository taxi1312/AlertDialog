package com.example.ongor1.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private AlertDialog.Builder aletDialog;
    private Button showDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showDialog = (Button)findViewById(R.id.showDialogID);
        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aletDialog = new AlertDialog.Builder(MainActivity.this);
                aletDialog.setTitle(getResources().getString(R.string.title));

                aletDialog.setMessage(getResources().getString(R.string.message));
                aletDialog.setCancelable(false);
                aletDialog.setPositiveButton(getResources().getString(R.string.yes),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                MainActivity.this.finish();
                            }
                        });
                aletDialog.setNegativeButton(getResources().getString(R.string.no),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog dialog = aletDialog.create();
                dialog.show();
            }
        });

    }
}
