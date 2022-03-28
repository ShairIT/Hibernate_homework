package peaksost.entity;

import javax.persistence.*;

@Entity
@Table(name="schools")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int pupils;
    private int teachers;
    @Column(name="director_of_lastname", length = 50)
    private String director;
    @Column(name="classrooms_of_name")
    private String classrooms;
    private String address;

    public School() {
    }

    public School(int pupils, int teachers, String director, String classrooms, String address) {
        this.pupils = pupils;
        this.teachers = teachers;
        this.director = director;
        this.classrooms = classrooms;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPupils() {
        return pupils;
    }

    public void setPupils(int pupils) {
        this.pupils = pupils;
    }

    public int getTeachers() {
        return teachers;
    }

    public void setTeachers(int teachers) {
        this.teachers = teachers;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(String classrooms) {
        this.classrooms = classrooms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", pupils=" + pupils +
                ", teachers=" + teachers +
                ", director='" + director + '\'' +
                ", classrooms='" + classrooms + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
