package mobidowonders.datapole.rathi.apitwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    public static final String TAG = "MainAct2";
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String res = getIntent().getStringExtra(MainActivity.KEY);
        ((TextView) findViewById(R.id.tv1)).setText(res);
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "ON resume has launched");
        super.onResume();
    }
}
