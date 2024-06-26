/*
*  Copyright (c) 2019. All right reserved
* Created on 2024-04-22 ( Date ISO 2024-04-22 - Time 21:42:04 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.hoa.controller;

import com.hoa.entities.ViolationDetail;
import com.hoa.service.ViolationdetailService;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.Valid;
import java.util.List;


/**
 * REST controller for managing {@link ViolationDetail}.
 *
 * @author @aek
 */
@RestController
@RequestMapping("/api/violationdetail")
public class ViolationdetailController {

    private final Logger log = LoggerFactory.getLogger(ViolationdetailController.class);
	
    private final ViolationdetailService entityService;

 	public ViolationdetailController (ViolationdetailService entityService) {
		this.entityService = entityService;
	}

    /**
     * {@code POST  /violationdetail} : Create a new violationdetail.
     *
     * @param violationdetail the violationdetail to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new violationdetail.
     */
	@PostMapping("/add")
	public ResponseEntity<ViolationDetail> createViolationdetail(@RequestBody @Valid ViolationDetail violationdetail) {
         log.debug("REST request to save Violationdetail : {}", violationdetail);
         return new ResponseEntity<>(entityService.create(violationdetail), HttpStatus.CREATED);
    }

   /**
     * {@code PUT  /violationdetail} : Updates an existing violationdetail.
     *
     * @param violationdetail the violationdetail to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated violationdetail,
     * or with status {@code 400 (Bad Request)} if the violationdetail is not valid,
     * or with status {@code 500 (Internal Server Error)} if the violationdetail couldn't be updated.
     */
    @PutMapping("/update")
    public ResponseEntity<ViolationDetail> updateViolationdetail(@Valid @RequestBody ViolationDetail violationdetail) {
        log.debug("REST request to update Violationdetail : {}", violationdetail);
        ViolationDetail result = entityService.update(violationdetail);
        return ResponseEntity.ok().body(result);
    }

    /**
     * {@code GET  /violationdetail} : get all the violationdetails.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of violationdetail in body.
     */

    @GetMapping("/getAll")
    public ResponseEntity<List<ViolationDetail>> getAllViolationdetail() {
	    log.debug("REST request to get all violationdetails");
        List<ViolationDetail> lst = entityService.getAll();

        return new ResponseEntity<>(lst,HttpStatus.OK);
    }

    /**
     * {@code GET  /violationdetail/:id} : get the "id" violationdetail.
     *
     * @param id the id of the violationdetail to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the violationdetail, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/getOne/{id}")
    public ResponseEntity<ViolationDetail> getOneViolationdetail(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to get Violationdetail : {}", id);
        ViolationDetail e = entityService.getOne(id);

        return new ResponseEntity<>(e, HttpStatus.OK);
    }

  /**
     * {@code DELETE  /violationdetail/:id} : delete the "id" violationdetail.
     *
     * @param id the id of the violationdetail to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteViolationdetail(@PathVariable(value = "id") Integer id) {
        log.debug("REST request to delete Violationdetail : {}", id);
        entityService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
