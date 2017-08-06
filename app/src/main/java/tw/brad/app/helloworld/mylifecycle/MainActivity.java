package tw.brad.app.helloworld.mylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private View test2, test3, test4;

    public void test1(View view){

    }
    public void test3(View view){

    }
    public void test4(View view){

    }
    public void test34(View view){

        if (view == test3) {
            Log.i("brad", "test3");
        }else if (view == test4){
            Log.i("brad", "test4");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("brad", "onCreate");

        test2 = findViewById(R.id.test2);
        test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("brad", "test2");
            }
        });
        test3 = findViewById(R.id.test3);
        test4 = findViewById(R.id.test4);

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("brad", "onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("brad", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("brad", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("brad", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("brad", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("brad", "onDestroy");
    }
}
