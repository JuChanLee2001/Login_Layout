package com.example.login_layout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public TextView inputID, inputPS, setView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        inputID = findViewById(R.id.inputID);
        inputPS = findViewById(R.id.inputPS);
        setView = findViewById(R.id.setView);
    }


    public void onclick(View view) {

        String id = inputID.getText().toString();
        String password = inputPS.getText().toString();
        setView.setText("회원가입이 완료되었습니다."+ "\n아이디: "+ id + "\n패스워드: "+password);

    }
}