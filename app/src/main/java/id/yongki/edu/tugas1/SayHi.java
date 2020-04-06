package id.yongki.edu.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SayHi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hi);

        Intent intent = getIntent();
        String nama = intent.getStringExtra(biodata.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.display_nama_textView);
        textView.setText("Beres! Sekarang " + nama + " udah bisa ngecek penggunaan HP " + nama + " tiap hari buat bantu " + nama + " ngatur waktu:)");
    }

    public void oke_btn(View v) {

        finish();
        moveTaskToBack(true);
    }

}
