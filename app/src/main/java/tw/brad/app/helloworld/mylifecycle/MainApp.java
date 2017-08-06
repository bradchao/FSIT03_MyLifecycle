package tw.brad.app.helloworld.mylifecycle;

import android.app.Application;
import android.util.Log;

/**
 * Created by user01 on 2017/8/6.
 */

public class MainApp extends Application {
    String username;
    int data3;
    static int data4;
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("brad", "MainApp:onCreate()");
        username = "Brad";
        data3 = data4 = 400;
    }
}
