package com.cloud.nativ.networkelements.repository;

import com.cloud.nativ.networkelements.domain.entities.NetworkDevice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : Lyes Sefiane
 * @mailto : lyes.sefiane@gmail.com
 * @created : 2021-12-25 1:36 p.m.
 */
@Repository
public interface INetworkDeviceRepository extends CrudRepository<NetworkDevice, String> {

    // Override Iterable<T> findAll()
    List<NetworkDevice> findAll();

}
