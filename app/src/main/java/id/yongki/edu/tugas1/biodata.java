package id.yongki.edu.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class biodata extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "id.yongki.edu.tugas1.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void selanjutnya_btn(View view) {
        Intent sendnama = new Intent(this, SayHi.class);
        EditText editText = (EditText) findViewById(R.id.nama_editText);
        String nama = editText.getText().toString();
        sendnama.putExtra(EXTRA_MESSAGE, nama);
        startActivity(sendnama);
    }
}
