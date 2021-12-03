package kr.ac.cwmu.it.termapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubActivity extends AppCompatActivity {

    private Button btn_move1;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        btn_move1 = findViewById(R.id.btn_move1);
        btn_move1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubActivity.this, SubActivity.class);
                startActivity(intent); // 액티비티 이동
            }
        });
    }
}