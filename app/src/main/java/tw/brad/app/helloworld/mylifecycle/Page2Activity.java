package tw.brad.app.helloworld.mylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import static tw.brad.app.helloworld.mylifecycle.MainApp.data4;

public class Page2Activity extends AppCompatActivity {
    private long lastKeyTime;
    private MainApp mainApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        lastKeyTime = System.currentTimeMillis();

        mainApp = (MainApp) getApplication();
        Log.i("brad", "MainApp:username = " + mainApp.username);
        Log.i("brad", "MainApp:data3 = " + mainApp.data3);
        Log.i("brad", "MainApp:data4 = " + data4);

    }

    public void doExit(View view){
        finish();
    }

    @Override
    public void finish() {
        Log.i("brad", "Page2:finish");

        if (System.currentTimeMillis() - lastKeyTime <= 3*1000 ) {
            super.finish();
        }else {
            Toast.makeText(this, "Press one more time", Toast.LENGTH_SHORT).show();
        }
        lastKeyTime = System.currentTimeMillis();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("brad", "Page2:onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("brad", "Page2:onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("brad", "Page2:onDestroy");
    }



}
