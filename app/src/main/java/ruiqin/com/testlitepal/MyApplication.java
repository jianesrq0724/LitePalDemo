package ruiqin.com.testlitepal;

import android.app.Application;

import org.litepal.LitePal;

/**
 * Created by ruiqin.shen
 * 类说明：
 */

public class MyApplication extends Application {
    private static MyApplication mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
        mContext = this;
    }

    public static MyApplication getAppContent() {
        return mContext;
    }
}
