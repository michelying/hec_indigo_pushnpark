package com.gildas.challengehec;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import java.io.*;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private BluetoothDevice device = null;// le périphérique (le module bluetooth)
    private BluetoothSocket socket = null;
    private InputStream receiveStream = null;// Canal de réception
    private OutputStream sendStream = null;// Canal d'émission

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button.setText("Click Me !");
                Intent j = new Intent("com.android.music.musicservicecommand");
                j.putExtra("command", "play");
                sendBroadcast(j);
            }
        });
    }
}
