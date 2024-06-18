package de.pan.patientfilebackend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.pan.patientfilebackend.model.PatientfileItem;
import de.pan.patientfilebackend.repository.PatientfileItemRepository;

@RestController
public class PatientfileController {
    private static final Logger log = LoggerFactory.getLogger(PatientfileController.class);

    private PatientfileItemRepository patientfileItemRepository;

    public PatientfileController(PatientfileItemRepository patientfileItemRepository) {
        this.patientfileItemRepository = patientfileItemRepository;
    }

    @GetMapping("/patientfile")
    public Iterable<PatientfileItem> getAllPatientfileItems(){
        return this.patientfileItemRepository.findAll();
    }

    @GetMapping("/patientfile/{id}")
    public ResponseEntity<PatientfileItem> getPatientfileById(@PathVariable Integer id){
        var item = patientfileItemRepository.findById(id).orElse(null);

        if(item == null){
            return ResponseEntity.notFound().build(); 
        }
        
        return ResponseEntity.ok().body(item);
    }

    @PostMapping("/patientfile")
    public ResponseEntity<PatientfileItem> postPatientfileItem(@RequestBody PatientfileItem item){
        var createdItem = patientfileItemRepository.save(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdItem);

    }

    @PutMapping("/patientfile/{id}/{name}")
    public ResponseEntity<PatientfileItem> UpdatePatientfileItem(@PathVariable Integer id, @PathVariable String name ){
       var existingItem = patientfileItemRepository.findById(id).orElse(null);

       if(existingItem == null){
            return ResponseEntity.notFound().build();
       }

       existingItem.setPatientfileItemName(name);
       patientfileItemRepository.save(existingItem);
       return ResponseEntity.ok().body(existingItem);
    }

    @DeleteMapping("/patientfile/{id}")
    public ResponseEntity<PatientfileItem> deletePatientfileItem(@PathVariable Integer id){
        var existingItem = patientfileItemRepository.findById(id).orElse(null);

        if(existingItem == null){
            return ResponseEntity.notFound().build();
        }
        
        patientfileItemRepository.delete(existingItem);
        return ResponseEntity.ok().build();
    }
}
