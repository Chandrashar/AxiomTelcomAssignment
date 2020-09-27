package com.chan.axiom.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
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
//@Table(name="Release")
public class Release implements Serializable {
    private String announceDate;
    @Column(name = "PRICE_EUR")
    private Integer priceEur;

    public Release() {
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


    @Override
    public String toString() {
        return "Release{" +
                "announceDate='" + announceDate + '\'' +
                ", priceEur=" + priceEur +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Release release = (Release) o;
        return Objects.equals(announceDate, release.announceDate) &&
                Objects.equals(priceEur, release.priceEur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(announceDate, priceEur);
    }

}
