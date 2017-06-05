package xir2n01.remidiuts.telkomschid.navigasi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNav1 = (Button) findViewById(R.id.btnNav1);
        Button btnNav2 = (Button) findViewById(R.id.btnNav2);
        Button btnNav3 = (Button) findViewById(R.id.btnNav3);
        Button btnNav4 = (Button) findViewById(R.id.btnNav4);
        Button btnExit = (Button) findViewById(R.id.btnExit);

        btnNav1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this, Nav1Activity.class);
                startActivity(pindah);
            }
        });

        btnNav2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this, Nav2Activity.class);
                startActivity(pindah);
            }
        });

        btnNav3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this, Nav3Activity.class);
                startActivity(pindah);
            }
        });

        btnNav4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this, Nav4Activity.class);
                startActivity(pindah);
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
            }
        });
    }
}
