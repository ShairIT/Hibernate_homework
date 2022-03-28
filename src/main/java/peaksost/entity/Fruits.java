package peaksost.entity;

import javax.persistence.*;

@Entity
@Table(name = "fruits")
public class Fruits {

    @Id
    @SequenceGenerator(name = "fruits_seq", sequenceName = "fruits_fruits_id_seq", allocationSize = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fruits_seq")
    private int id;
    private String hybrid;
    private String sort;
    private String form;
    private String quality;
    private String seasonal;

    public Fruits(String hybrid, String sort, String form, String quality, String seasonal) {
        this.hybrid = hybrid;
        this.sort = sort;
        this.form = form;
        this.quality = quality;
        this.seasonal = seasonal;
    }

    public Fruits() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHybrid() {
        return hybrid;
    }

    public void setHybrid(String hybrid) {
        this.hybrid = hybrid;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getSeasonal() {
        return seasonal;
    }

    public void setSeasonal(String seasonal) {
        this.seasonal = seasonal;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "id=" + id +
                ", hybrid='" + hybrid + '\'' +
                ", sort='" + sort + '\'' +
                ", form='" + form + '\'' +
                ", quality='" + quality + '\'' +
                ", seasonal='" + seasonal + '\'' +
                '}';
    }
}
