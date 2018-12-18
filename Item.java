import java.awt.*;
import java.util.Date;

public abstract class Item {
    private Date date;
    private String name;
    private Color color;

    Item() {

    }

    Item(Date date, String name) {
        this.date = date;
        this.name = name;
        this.color = Color.white;
    }

    public Item(Date date, String name, Color color) {
        this(date, name);
        this.color = color;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
}
