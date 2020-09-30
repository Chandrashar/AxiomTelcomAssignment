package com.chan.axiom.controller;

import com.chan.axiom.model.Device;
import com.chan.axiom.service.DeviceService;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.domain.LikeIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.OnTypeMismatch;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * User: Chandra P Sharma
 * Project: AxiomTelcomAssignment
 * Package: com.chan.axiom.controller
 */

@RestController
@RequestMapping("/mobile/search")
public class DeviceController {


    @Autowired
    DeviceService deviceService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Device> getAllMobile() {
        return deviceService.getAllMobile();
    }

    @GetMapping(params = {"sim"})
    public Iterable<Device> filterBySim(
            @Spec(path = "sim", spec = LikeIgnoreCase.class) Specification<Device> spec) {
        return deviceService.findAll(spec);
    }

    @GetMapping(params = {"brand"})
    public Iterable<Device> findByBrand(
            @Spec(path = "brand", spec = LikeIgnoreCase.class) Specification<Device> spec) {
        return deviceService.findAll(spec);
    }
    @GetMapping(params = {"phone"})
    public Iterable<Device> findByPhone(
            @Spec(path = "phone", spec = LikeIgnoreCase.class) Specification<Device> spec) {
        return deviceService.findAll(spec);
    }
    @GetMapping(params = {"battery"})
    public Iterable<Device> findByBattery(
            @Spec(path = "battery", spec = LikeIgnoreCase.class) Specification<Device> spec) {
        return deviceService.findAll(spec);

    }

    @GetMapping(params = {"picture"})
    public Iterable<Device> findByPicture(
            @Spec(path = "picture", spec = LikeIgnoreCase.class) Specification<Device> spec) {
        return deviceService.findAll(spec);

    }

    @GetMapping(params = {"resolution"})
    public Iterable<Device> findByResolution(
            @Spec(path = "resolution", spec = LikeIgnoreCase.class) Specification<Device> spec) {
        return deviceService.findAll(spec);
    }

    @GetMapping(params = {"audioJack"})
    public Iterable<Device> findByAudioJack(
            @Spec(path = "audioJack", spec = LikeIgnoreCase.class) Specification<Device> spec) {
        return deviceService.findAll(spec);
    }
    @GetMapping(params = {"gps"})
    public Iterable<Device> findByGps(
            @Spec(path = "gps", spec = LikeIgnoreCase.class) Specification<Device> spec) {
        return deviceService.findAll(spec);
    }

    @GetMapping(params = {"announceDate", "priceEur"})
    public List<Device> findByAnnounceDate(@RequestParam String announceDate, @RequestParam Integer priceEur) {
        return deviceService.findByAnnounceDateAndPriceEur(announceDate, priceEur);
    }


   /* @GetMapping(params = {"announceDate", "priceEur"})
    public Page<Device> findByAnnounceDateAndPriceEur(
            @Or({
                    @Spec(path = "announceDate", params = "announceDate", spec = Like.class),
                    @Spec(path = "priceEur", params = "priceEur", spec = Equal.class)
            })
                    Specification<Device> spec, Pageable pageable) {

        return (Page<Device>) deviceService.findByAnnounceDateAndPriceEur(spec, pageable);
    }*/

    @GetMapping(params = {"priceEur"})
    public Iterable<Device> findByPriceEur(
            @Spec(path = "priceEur", spec = Equal.class, onTypeMismatch = OnTypeMismatch.EXCEPTION) Specification<Device> spec) {
        return deviceService.findAll(spec);
    }

    @GetMapping(params = {"announceDate"})
    public Iterable<Device> findByAnnounceDate(
            @Spec(path = "announceDate", spec = Like.class) Specification<Device> spec) {
        return deviceService.findAll(spec);
    }
}
