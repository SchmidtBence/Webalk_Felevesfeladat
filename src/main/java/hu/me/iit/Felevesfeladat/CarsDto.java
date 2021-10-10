package hu.me.iit.Felevesfeladat;

import javax.validation.constraints.*;

public class CarsDto {

    @NotNull
    private Long id;
    @NotNull
    @NotBlank
    private String model;
    @NotBlank
    @NotNull
    private String type;
    @Min(1900)
    private int year;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "CarsDto{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", year=" + year +
                '}';
    }
}