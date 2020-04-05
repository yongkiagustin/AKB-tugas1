package id.yongki.edu.tugas1;
//NIM : 10117903
//NAMA : YONGKI AGUSTIN
//KELAS : IF6K
//DESKRIPSI PEKERJAAN :
//- MINGGU 5 APRIL 2020 16:40 LAYOUTING MAIN_ACTIVITY
//- MINGGU 5 APRIL 2020 16:54 MEMBUAT TOMBOL MULAI
//- MINGGU 5 APRIL 2020 17:32 LAYOUTING LOGIN CODE ACTIVITY
//- MINGGU 5 APRIL 2020 18:24 SETTING NO ACTION BAR
//- MINGGU 5 APRIL 2020 17:44 add INTENT mulai
//- MINGGU 5 APRIL 2020 19:16 mengganti warna tombol
//- MINGGU 5 APRIL 2020 19:34 layouting activity biodata
//- MINGGU 5 APRIL 2020 19:50 set intent di semua activity
//
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mulai_btn(View v){
        Intent intent = new Intent(this, LoginCode.class);
        startActivity(intent);

    }
}
