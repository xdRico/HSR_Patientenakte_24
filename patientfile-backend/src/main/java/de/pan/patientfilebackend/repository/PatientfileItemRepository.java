package de.pan.patientfilebackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.pan.patientfilebackend.model.PatientfileItem;

@Repository
public interface PatientfileItemRepository extends CrudRepository<PatientfileItem, Integer> {
}
