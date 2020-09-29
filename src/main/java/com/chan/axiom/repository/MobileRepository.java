package com.chan.axiom.repository;

import com.chan.axiom.model.Mobile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileRepository extends CrudRepository<Mobile, Long> {

//public interface MobileRepository extends PagingAndSortingRepository<Mobile, Long>, JpaSpecificationExecutor<Mobile> {


}
