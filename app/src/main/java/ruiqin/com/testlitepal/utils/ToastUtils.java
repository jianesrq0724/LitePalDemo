package ruiqin.com.testlitepal.utils;

import android.widget.Toast;

import ruiqin.com.testlitepal.MyApplication;

/**
 * Created by ruiqin.shen
 * 类说明：
 */

public class ToastUtils {
    static Toast sToast;

    public static void show(String content) {
        if (sToast == null) {
            sToast = Toast.makeText(MyApplication.getAppContent(), content, Toast.LENGTH_SHORT);
        } else {
            sToast.setText(content);
        }
        sToast.show();
    }
}
