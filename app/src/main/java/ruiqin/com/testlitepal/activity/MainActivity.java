package ruiqin.com.testlitepal.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.litepal.LitePal;

import ruiqin.com.testlitepal.R;
import ruiqin.com.testlitepal.entity.Book;
import ruiqin.com.testlitepal.utils.ToastUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.create).setOnClickListener(view -> {
//            LitePal.getDatabase();
            ToastUtils.show("创建数据库");
        });

        findViewById(R.id.button).setOnClickListener(view -> {
            Book book = new Book();
            book.setId(1);
            book.setPrice("22.1");
            book.save();
            ToastUtils.show("保存数据成功");
        });
    }
}
