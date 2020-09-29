package com.chan.axiom.service;

import com.chan.axiom.model.Device;
import com.chan.axiom.model.Hardware;
import com.chan.axiom.model.Mobile;
import com.chan.axiom.model.Release;
import com.chan.axiom.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Chandra P Sharma
 * Project: AxiomTelcomAssignment
 * Package: com.chan.axiom.service
 */
@Service
public class DeviceService {

    @Autowired
    DeviceRepository deviceRepository;

    public List<Device> getAllMobile() {
        List<Device> mobiles = new ArrayList<>();
        deviceRepository.findAll().forEach(mobiles::add);
        return mobiles;
    }

    public List<Device> load(List<Mobile> handSets) {
        List<Device> deviceBeans = new ArrayList<>();
        for (Mobile hs : handSets) {
            Device deviceBean = new Device();
            Hardware hw = hs.getHardware();
            Release rs = hs.getRelease();

            deviceRepository.save(new Device(hs.getId(), hs.getBrand(), hs.getPhone(), hs.getPicture(), hs.getRelease().getAnnounceDate(), hs.getRelease().getPriceEur(), hs.getSim(), hs.getResolution(), hs.getHardware().getAudioJack(), hs.getHardware().getGps(), hs.getHardware().getBattery()));

            deviceBean.setId(hs.getId());
            deviceBean.setBrand(hs.getBrand());
            deviceBean.setPhone(hs.getPhone());
            deviceBean.setPicture(hs.getPicture());
            deviceBean.setAnnounceDate(hs.getRelease().getAnnounceDate());
            deviceBean.setPriceEur(hs.getRelease().getPriceEur());
            deviceBean.setSim(hs.getSim());
            deviceBean.setResolution(hs.getResolution());
            deviceBean.setAudioJack(hs.getHardware().getAudioJack());
            deviceBean.setGps(hs.getHardware().getGps());
            deviceBean.setBattery(hs.getHardware().getBattery());
            deviceBeans.add(deviceBean);

            //System.out.println(hs.getId() + " " + hs.getPhone() + " " + hw.getBattery() + " " + rs.getPriceEur() + " " + rs.getAnnounceDate() + " " + hs.getSim());

        }

        return deviceBeans;

    }

    public void save(List<Device> deviceBeans) {
        deviceRepository.saveAll(deviceBeans);
    }

    public List<Device> findBySim(String sim) {
        System.out.println("getDeviceBySim " + sim);
        return deviceRepository.findBySim(sim);
    }

    public List<Device> getDeviceByPriceEur(Integer priceEur) {

        System.out.println("getDeviceByPriceEur " + priceEur);
        return deviceRepository.findByPriceEur(priceEur);
    }


    public List<Device> findByBrand(String brand) {
        return deviceRepository.findByBrand(brand);
    }

    public List<Device> findByPhone(String phone) {
        return deviceRepository.findByBrand(phone);
    }

    public List<Device> findByAnnounceDate(String announceDate) {
        return deviceRepository.findByAnnounceDate(announceDate);
    }

    public List<Device> findByAnnounceDateAndPriceEur(String announceDate, Integer priceEur) {
        return deviceRepository.findByAnnounceDateAndPriceEur(announceDate, priceEur);
    }

    /*public List<Device> findById(Long aLong) {
        return deviceRepository.findById(aLong);
    }*/
}
