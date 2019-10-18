package org.app.repository;

import org.app.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository  extends CrudRepository<Address,Long>{

}
