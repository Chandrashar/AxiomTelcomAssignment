package com.chan.axiom.service;

import com.chan.axiom.model.Mobile;
import com.chan.axiom.repository.MobileRepository;
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
public class MobileService {

    @Autowired
    private MobileRepository mobileRepository;
    // @Autowired
    // private DeviceRepository deviceRepository;
    //private DeviceService deviceService;

    public MobileService(MobileRepository mobileRepository) {
        this.mobileRepository = mobileRepository;
    }

    public MobileService() {

    }

    public void save(List<Mobile> handSet) {
        mobileRepository.saveAll(handSet);
    }

    /*public  Iterable<Mobile> list() {
        return mobileRepository.findAll();
    }


    public Mobile save(Mobile handSet) {
        return mobileRepository.save(handSet);
    }

*/


    public List<Mobile> getAllMobile() {
        List<Mobile> mobiles = new ArrayList<>();
        mobileRepository.findAll().forEach(mobiles::add);
        return mobiles;
    }


}
