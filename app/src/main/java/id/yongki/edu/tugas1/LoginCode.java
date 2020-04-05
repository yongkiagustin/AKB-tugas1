package id.yongki.edu.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_code);
    }
    public void masuk_btn(View v){
        Intent intent = new Intent(this,biodata.class);
        startActivity(intent);

    }
    public void toastMsg(String msg) {

        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();

    }
    public void beli_kode_btn(View v) {
        toastMsg("Anda Menekan Tombol Beli Kode!!!");

    }
}
