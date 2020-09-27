package com.chan.axiom.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.io.Serializable;
import java.util.Objects;

/**
 * User: Chandra P Sharma
 * Project: AxiomHiring
 * Package: com.chan.axiom.model
 */

@Data
@AllArgsConstructor
//@Entity
@Inheritance(strategy = InheritanceType.JOINED)
//@Table(name="Hardware")
public class Hardware implements Serializable {
    public Hardware() {
    }

    private String audioJack;
    private String gps;
    private String battery;

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
        Hardware hardware = (Hardware) o;
        return Objects.equals(audioJack, hardware.audioJack) &&
                Objects.equals(gps, hardware.gps) &&
                Objects.equals(battery, hardware.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioJack, gps, battery);
    }

    @Override
    public String toString() {
        return "Hardware{" +
                "audioJack='" + audioJack + '\'' +
                ", gps='" + gps + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }
}
