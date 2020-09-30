package com.chan.axiom.service;

import com.chan.axiom.model.Device;
import com.chan.axiom.model.Mobile;
import com.chan.axiom.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
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

    public MobileService(MobileRepository mobileRepository) {
        this.mobileRepository = mobileRepository;
    }

    public MobileService() {

    }

    public void save(List<Mobile> handSet) {
        mobileRepository.saveAll(handSet);
    }

    public List<Mobile> getAllMobile() {
        List<Mobile> mobiles = new ArrayList<>();
        mobileRepository.findAll().forEach(mobiles::add);
        return mobiles;
    }

/*
    public Iterable<Mobile> findBySim(Specification<Mobile> spec) {
        return mobileRepository.findAll(spec);
    }

    public Iterable<Mobile> findByBrand(Specification<Mobile> spec) {
        return mobileRepository.findAll(spec);
    }

    public Iterable<Mobile> findByBattery(Specification<Mobile> spec) {
        return mobileRepository.findAll(spec);
    }

    public Iterable<Mobile> findByPriceEur(Specification<Mobile> spec) {
        return mobileRepository.findAll(spec);
    }

    public Iterable<Mobile> findByAnnounceDate(Specification<Mobile> spec) {
        return mobileRepository.findAll(spec);
    }

    public List<Mobile> findbyMobileParam(Specification<Mobile> spec) {
        return mobileRepository.findAll(spec);
    }*/
}
