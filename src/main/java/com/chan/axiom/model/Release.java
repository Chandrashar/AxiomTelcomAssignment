package com.chan.axiom.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * User: Chandra P Sharma
 * Project: AxiomHiring
 * Package: com.chan.axiom.model
 */

@Data
@AllArgsConstructor
//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
//@Table(name="Release")
public class Release implements Serializable {
//    @Id
//    @GeneratedValue( strategy = GenerationType.AUTO )
//    private Long id;

    @Column(name = "ANNOUNCE_DATE")
    private String announceDate;
    @Column(name = "PRICE_EUR")
    private Integer priceEur;

    public Release() {
    }


    public String getAnnounceDate() {
        return announceDate;
    }

    public Integer getPriceEur() {
        return priceEur;
    }
}
