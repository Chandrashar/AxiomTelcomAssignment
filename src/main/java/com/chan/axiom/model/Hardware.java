package com.chan.axiom.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * User: Chandra P Sharma
 * Project: AxiomTelcomAssignment
 * Package: com.chan.axiom.model
 */

@Data
@AllArgsConstructor
//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
//@Table(name="Hardware")
public class Hardware implements Serializable {
    //  @Id
    //  @GeneratedValue( strategy = GenerationType.AUTO )
    //  private Long id;
    private String audioJack;
    private String gps;
    private String battery;
    public Hardware() {
    }

    public String getAudioJack() {
        return audioJack;
    }

    public String getGps() {
        return gps;
    }

    public String getBattery() {
        return battery;
    }
}
