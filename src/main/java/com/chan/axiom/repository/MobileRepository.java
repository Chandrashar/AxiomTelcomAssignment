package com.chan.axiom.repository;

import com.chan.axiom.model.Mobile;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * User: Chandra P Sharma
 * Project: AxiomTelcomAssignment
 * Package: com.chan.axiom.model
 */

@Repository
public interface MobileRepository extends PagingAndSortingRepository<Mobile, Long>, JpaSpecificationExecutor<Mobile> {

}
