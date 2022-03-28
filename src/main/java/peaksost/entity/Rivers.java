package peaksost.entity;

import javax.persistence.*;

@Entity
@Table(name="rivers")
public class Rivers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int length;
    private String town;
    private int volume;
    private int width;

    public Rivers() {
    }

    public Rivers(String title, int length, String town, int volume, int width) {
        this.title = title;
        this.length = length;
        this.town = town;
        this.volume = volume;
        this.width = width;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rivers{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", length=" + length +
                ", town='" + town + '\'' +
                ", volume=" + volume +
                ", width=" + width +
                '}';
    }
}
