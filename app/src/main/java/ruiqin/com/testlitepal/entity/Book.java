package ruiqin.com.testlitepal.entity;

import org.litepal.crud.DataSupport;

/**
 * Created by ruiqin.shen
 * 类说明：
 */

public class Book extends DataSupport {
    private int id;
    private String price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
