/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:02 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.service;
import com.hoa.entities.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

/**
 * Service Interface for managing {@link Country}.
*  @author aek
 */
public interface CountryService  {
   
    /**
     * create new item for domain
     *
     * @param entity entity to save.
     * @return persisted entity Country
     */
    Country create(Country d);

    /**
     * Update entity. Check before if existing data. If data is empty throw Exception
     *
     * @param entity domain
     * @param id of entity
     * @return Country
     */
    Country update(Country d);

    /**
     * get Country by id. Can be return empty
     *
     * @param id the id of the entity.
     * @return Country
     */
    Country getOne(Integer id) ;

    /**
     * Get all entities
     *
     * @return list of entities List<Country>
     */
    List<Country> getAll();

    /**
     * Count item in entity
     *
     * @return long 
     */
    long getTotal();

    /**
     * Delete record by id
     *  
     */
    void delete(Integer id);

    /**
     * Find all with pagination
     *
     * @return Page<Country>  
     */
    Page<Country> findAllPaginate(Pageable pageable);

    /**
     * Find all with pagination  by criteria 
     *
     * @return Page<Country>  
     */
	Page<Country> findAllSpecification(Specification<Country> specs, Pageable pageable);

}
