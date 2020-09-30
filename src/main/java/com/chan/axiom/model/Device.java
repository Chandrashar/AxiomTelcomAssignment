package com.chan.axiom.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * User: Chandra P Sharma
 * Project: AxiomTelcomAssignment
 * Package: com.chan.axiom.model
 */

@Data
//@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Device")
public class Device implements Serializable {
    @Id
    private Integer id;
    private String brand;
    private String phone;
    private String picture;
    private String announceDate;
    private Integer priceEur;
    private String sim;
    private String resolution;

    private String audioJack;
    private String gps;
    private String battery;

    public Device() {
    }

    public Device(Integer id, String brand, String phone, String picture, String announceDate, Integer priceEur, String sim, String resolution, String audioJack, String gps, String battery) {
        this.id = id;
        this.brand = brand;
        this.phone = phone;
        this.picture = picture;
        this.announceDate = announceDate;
        this.priceEur = priceEur;
        this.sim = sim;
        this.resolution = resolution;
        this.audioJack = audioJack;
        this.gps = gps;
        this.battery = battery;
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

    public String getAnnounceDate() {
        return announceDate;
    }

    public void setAnnounceDate(String announceDate) {
        this.announceDate = announceDate;
    }

    public Integer getPriceEur() {
        return priceEur;
    }

    public void setPriceEur(Integer priceEur) {
        this.priceEur = priceEur;
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

    public String getAudioJack() {
        return audioJack;
    }

    public void setAudioJack(String audioJack) {
        this.audioJack = audioJack;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.chan.axiom.model.Device handSet = (com.chan.axiom.model.Device) o;
        return Objects.equals(id, handSet.id) &&
                Objects.equals(brand, handSet.brand) &&
                Objects.equals(phone, handSet.phone) &&
                Objects.equals(picture, handSet.picture) &&
                Objects.equals(announceDate, handSet.announceDate) &&
                Objects.equals(priceEur, handSet.priceEur) &&
                Objects.equals(sim, handSet.sim) &&
                Objects.equals(resolution, handSet.resolution) &&
                Objects.equals(audioJack, handSet.audioJack) &&
                Objects.equals(gps, handSet.gps) &&
                Objects.equals(battery, handSet.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, phone, picture, announceDate, priceEur, sim, resolution, audioJack, gps, battery);
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", phone='" + phone + '\'' +
                ", picture='" + picture + '\'' +
                ", announceDate='" + announceDate + '\'' +
                ", priceEur=" + priceEur +
                ", sim='" + sim + '\'' +
                ", resolution='" + resolution + '\'' +
                ", audioJack='" + audioJack + '\'' +
                ", gps='" + gps + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }
}

