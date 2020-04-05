package id.yongki.edu.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SayHi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hi);

        Intent intent = getIntent();
        String nama  =intent.getStringExtra(biodata.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.display_nama_textView);
        textView.setText(nama);
    }

}
