package io.tutorial.spring.garageApp.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class Car {

    public enum Color{
        RED,
        BLUE,
        GREEN,
        YELLOW,
    }

    @Id
    private long id;
    private String model;
    private String  brand;

    @Column(name = "release_year")
    private int year;
    private Color color;

    public Car() {

    }

    public Car(long id, String model, String brand, int year, Color color) {
        this.model = model;
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {this.color = color;}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}


