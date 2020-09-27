package com.chan.axiom.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Data
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="Mobile")
public class Mobile implements Serializable {
    @Id
    private Integer id;
    private String brand;
    private String phone;
    private String picture;
    @Embedded
    // @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Release release;
    private String sim;
    private String resolution;
    @Embedded
    // @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Hardware hardware;

    public Mobile() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Release getRelease() {
        return release;
    }

    public void setRelease(Release release) {
        this.release = release;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Hardware getHardware() {
        return hardware;
    }

    public void setHardware(Hardware hardware) {
        this.hardware = hardware;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mobile that = (Mobile) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(brand, that.brand) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(picture, that.picture) &&
                Objects.equals(release, that.release) &&
                Objects.equals(sim, that.sim) &&
                Objects.equals(resolution, that.resolution) &&
                Objects.equals(hardware, that.hardware);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, phone, picture, release, sim, resolution, hardware);
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", phone='" + phone + '\'' +
                ", picture='" + picture + '\'' +
                ", release=" + release +
                ", sim='" + sim + '\'' +
                ", resolution='" + resolution + '\'' +
                ", hardware=" + hardware +
                '}';
    }
}
