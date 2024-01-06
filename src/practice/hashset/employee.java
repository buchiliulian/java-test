package practice.hashset;

import java.text.SimpleDateFormat;
import java.util.Date;

public class employee {
    int id;
    String name;
    Date daydate;

    public employee(int id, String name, Date daydate) {
        this.id = id;
        this.name = name;
        this.daydate = daydate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDaydate() {
        return daydate;
    }

    public void setDaydate(Date daydate) {
        this.daydate = daydate;
    }

    @Override
    public String toString() {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-mm-dd");
        return  id + ":" + name + ":" + ft.format(daydate);
    }
}
