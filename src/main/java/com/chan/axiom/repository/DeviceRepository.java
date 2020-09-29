package com.chan.axiom.repository;

import com.chan.axiom.model.Device;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: Chandra P Sharma
 * Project: AxiomTelcomAssignment
 * Package: com.chan.axiom.repository
 */

@Repository
public interface DeviceRepository extends CrudRepository<Device, Long> {
    List<Device> findBySim(String sim);

    List<Device> findByPriceEur(Integer priceEur);

    List<Device> findByBrand(String brand);

    List<Device> findByAnnounceDate(String announceDate);

    List<Device> findByAnnounceDateAndPriceEur(String announceDate, Integer priceEur);
}
