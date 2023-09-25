package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.io.OutputStream;
import java.util.UUID;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Код для старту передачі даних через Bluetooth
                // Використовуйте BluetoothAdapter та інші класи для цього

                long timeInSeconds = 60; // 60 секунд

                new CountDownTimer(timeInSeconds * 1000, 1000) { // Перетворюємо секунди в мілісекунди
                    public void onTick(long millisUntilFinished) {
                        // Виконується кожну секунду, поки таймер не закінчиться
                        // Можете оновлювати інтерфейс або виконувати інші дії тут
                        long secondsRemaining = millisUntilFinished / 1000;
                        // Оновлювати інтерфейс або виводити час залишку у секундах
                    }

                    public void onFinish() {
                        // Виконується, коли таймер закінчується (по закінченні 60 секунд)
                        // Обробка завершення таймера тут
                    }
                }.start();


                Toast.makeText(MainActivity.this, "Початок передачі даних", Toast.LENGTH_SHORT).show();
            }
        });
    }
}