package peaksost.entity;

import javax.persistence.*;

@Entity
@Table(name="houses")
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int rooms;
    private int floor;
    private String village;
    private int human;
    private String street;

    public House() {
    }

    public House(int rooms, int floor, String town, int human, String street) {
        this.rooms = rooms;
        this.floor = floor;
        this.village = village;
        this.human = human;
        this.street = street;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village= village;
    }

    public int getHuman() {
        return human;
    }

    public void setHuman(int human) {
        this.human = human;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", rooms=" + rooms +
                ", floor=" + floor +
                ", village='" + village + '\'' +
                ", human=" + human +
                ", street='" + street + '\'' +
                '}';
    }
}
