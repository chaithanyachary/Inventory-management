/**
 * 
 */
package com.inventory.mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventory.mgmt.entity.Supplier;

/**
 * @author ddharaniprag
 *
 */
@Repository
public interface SuppliersRepository extends JpaRepository<Supplier, String> {

}
