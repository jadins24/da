/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:04 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hoa.repositories.ViolationRepository;
import com.hoa.entities.Violation;
import com.hoa.service.ViolationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;


import java.util.Collections;
import java.util.List;

/**
 * Service Implementation for managing {@link Violation}.
 * @author aek
 */
@Service
@Transactional
public class ViolationServiceImpl implements ViolationService {


    private final ViolationRepository repository;

    public ViolationServiceImpl(ViolationRepository repo) {
         this.repository = repo;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Violation create(Violation d) {
        try {
            return repository.save(d);

        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Violation update(Violation d) {
        try {
            return repository.saveAndFlush(d);

        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Violation getOne(Integer id) {
        try {
            return repository.findById(id).orElse(null);

        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Violation> getAll() {
        try {
            return repository.findAll();

        } catch (Exception ex) {
            return Collections.emptyList();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getTotal() {
        try {
            return repository.count();
        } catch (Exception ex) {
            return 0;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    /**
     * {@inheritDoc}
     */
   	@Override
	public Page<Violation> findAllPaginate(Pageable pageable) {

		return repository.findAll(pageable);
	}

    /**
     * {@inheritDoc}
     */
    @Override
	public Page<Violation> findAllSpecification(Specification<Violation> specs, Pageable pageable) {
		return repository.findAll(specs, pageable);
	}

}
