package com.example.product3.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity

public class Product3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String product3name;
    private String product3code;
    private int price;

    public String getProduct3name() {
        return product3name;
    }

    public void setProduct3name(String product3name) {
        this.product3name = product3name;
    }

    public String getProduct3code() {
        return product3code;
    }

    public void setProduct3code(String product3code) {
        this.product3code = product3code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product3{" +
                "product3name='" + product3name + '\'' +
                ", product3code='" + product3code + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product3 product3 = (Product3) o;
        return price == product3.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }
}
