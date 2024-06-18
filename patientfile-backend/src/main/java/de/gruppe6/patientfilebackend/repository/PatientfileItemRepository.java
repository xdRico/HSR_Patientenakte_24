package de.gruppe6.patientfilebackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.gruppe6.patientfilebackend.model.PatientfileItem;

@Repository
public interface PatientfileItemRepository extends CrudRepository<PatientfileItem, Integer> {
}
