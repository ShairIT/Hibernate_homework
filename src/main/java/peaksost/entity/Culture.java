package peaksost.entity;

import javax.persistence.*;

@Entity
@Table(name = "cultuers")
public class Culture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String education;
    private String civilization;
    private String ethical;
    private String economic;
    private String political;

    public Culture() {
    }

    public Culture(String education, String civilization, String ethical, String economic, String political) {
        this.education = education;
        this.civilization = civilization;
        this.ethical = ethical;
        this.economic = economic;
        this.political = political;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCivilization() {
        return civilization;
    }

    public void setCivilization(String civilization) {
        this.civilization = civilization;
    }

    public String getEthical() {
        return ethical;
    }

    public void setEthical(String ethical) {
        this.ethical = ethical;
    }

    public String getEconomic() {
        return economic;
    }

    public void setEconomic(String economic) {
        this.economic = economic;
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political;
    }

    @Override
    public String toString() {
        return "Culture{" +
                "id=" + id +
                ", education='" + education + '\'' +
                ", civilization='" + civilization + '\'' +
                ", ethical='" + ethical + '\'' +
                ", economic='" + economic + '\'' +
                ", political='" + political + '\'' +
                '}';
    }
}
