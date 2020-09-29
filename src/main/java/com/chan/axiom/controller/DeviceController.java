package com.chan.axiom.controller;

import com.chan.axiom.model.Device;
import com.chan.axiom.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
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

    //    @Autowired
//    DeviceRepository deviceRepository;
    @Autowired
    DeviceService deviceService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Device> getAllMobile() {
        return deviceService.getAllMobile();
    }

//    @GetMapping(params = {"id"})
//    public List<Device> findById(@RequestParam Integer id){
//        return deviceService.findById(new Long(id));
//    }

    @GetMapping(params = {"sim"})
    public List<Device> findBySim(@RequestParam String sim) {
        return deviceService.findBySim(sim);
    }

    @GetMapping(params = {"brand"})
    public List<Device> findByBrand(@RequestParam String brand) {
        return deviceService.findByBrand(brand);
    }

    @GetMapping(params = {"phone"})
    public List<Device> findByPhone(@RequestParam String phone) {
        return deviceService.findByPhone(phone);
    }

    @GetMapping(params = {"announceDate", "priceEur"})
    public List<Device> findByAnnounceDate(@RequestParam String announceDate, @RequestParam Integer priceEur) {
        return deviceService.findByAnnounceDateAndPriceEur(announceDate, priceEur);
    }

    @GetMapping(params = {"announceDate"})
    public List<Device> findByAnnounceDate(@RequestParam String announceDate) {
        return deviceService.findByAnnounceDate(announceDate);
    }


    @GetMapping(params = {"priceEur"})
    public List<Device> findByPriceEur(@RequestParam Integer priceEur) {
        return deviceService.getDeviceByPriceEur(priceEur);
    }


}
