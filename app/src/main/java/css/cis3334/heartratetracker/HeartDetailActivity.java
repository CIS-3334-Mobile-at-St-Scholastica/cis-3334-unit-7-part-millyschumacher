package css.cis3334.heartratetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HeartDetailActivity extends AppCompatActivity {

    TextView tvPulse, tvRange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_detail);

        //Set up for the pulse and range displays
        tvPulse=(TextView) findViewById(R.id.tvDisplayPulseDetail);
        tvRange=(TextView) findViewById(R.id.tvDisplayRangeDetail);

        //This displays the pulse and range information in the second activity screen
        Bundle extras = getIntent().getExtras();
        HeartRate hr = (HeartRate) extras.getSerializable(MainActivity.HEARTRATE_KEY);
        tvPulse.setText(hr.getPulse().toString());
        tvRange.setText(hr.getRangeName().toString());
    }
}
