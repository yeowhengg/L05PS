package sg.edu.rp.c346.id20042741.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvModCode;
    TextView tvModName;
    TextView tvAcadYear;
    TextView tvSem;
    TextView tvModCredit;
    TextView tvVenue;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvModCode = findViewById(R.id.modCode);
        tvModName = findViewById(R.id.modName);
        tvAcadYear = findViewById(R.id.acadYear);
        tvSem = findViewById(R.id.sem);
        tvModCredit = findViewById(R.id.modCredit);
        tvVenue = findViewById(R.id.venue);
        btnBack = findViewById(R.id.btnBack);

        Intent getValues = getIntent();

        tvModCode.append(getValues.getStringExtra("modCode"));
        tvModName.append(getValues.getStringExtra("modName"));
        tvAcadYear.append(getValues.getStringExtra("acadYear"));
        tvSem.append(String.format("%d",getValues.getIntExtra("sem",0)));
        tvModCredit.append(String.format("%d",getValues.getIntExtra("modCredit",0)));
        tvVenue.append(getValues.getStringExtra("venue"));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goback = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(goback);
            }
        });




    }
}