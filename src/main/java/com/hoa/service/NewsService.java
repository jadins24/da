/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:03 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.service;
import com.hoa.entities.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

/**
 * Service Interface for managing {@link News}.
*  @author aek
 */
public interface NewsService  {
   
    /**
     * create new item for domain
     *
     * @param entity entity to save.
     * @return persisted entity News
     */
    News create(News d);

    /**
     * Update entity. Check before if existing data. If data is empty throw Exception
     *
     * @param entity domain
     * @param id of entity
     * @return News
     */
    News update(News d);

    /**
     * get News by id. Can be return empty
     *
     * @param id the id of the entity.
     * @return News
     */
    News getOne(Integer id) ;

    /**
     * Get all entities
     *
     * @return list of entities List<News>
     */
    List<News> getAll();

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
     * @return Page<News>  
     */
    Page<News> findAllPaginate(Pageable pageable);

    /**
     * Find all with pagination  by criteria 
     *
     * @return Page<News>  
     */
	Page<News> findAllSpecification(Specification<News> specs, Pageable pageable);

}
