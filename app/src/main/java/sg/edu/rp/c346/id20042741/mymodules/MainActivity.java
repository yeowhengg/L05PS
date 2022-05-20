package sg.edu.rp.c346.id20042741.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvc346;
    TextView tvc349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvc346 = findViewById(R.id.idc346);
        tvc349 = findViewById(R.id.idc349);

        tvc346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("modCode","C346");
                intent.putExtra("modName","Android Programming");
                intent.putExtra("acadYear", "2020");
                intent.putExtra("sem",1);
                intent.putExtra("modCredit",4);
                intent.putExtra("venue","W66M");
                startActivity(intent);
            }
        });

        tvc349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("modCode","C349");
                intent.putExtra("modName","iPad Programming");
                intent.putExtra("acadYear", "2020");
                intent.putExtra("sem",1);
                intent.putExtra("modCredit",4);
                intent.putExtra("venue","W64M");
                startActivity(intent);
            }
        });
    }
}