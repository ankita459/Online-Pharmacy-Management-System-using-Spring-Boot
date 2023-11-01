package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Medicine;

@RestController
@RequestMapping("/medicines")
public class MedicineController {
	
	private final Map<Integer, Medicine> medicineDatabase = new HashMap<>();
    private final AtomicInteger idGenerator = new AtomicInteger();

    @PostMapping
    public boolean addMedicine(@RequestBody Medicine medicine) {
        int medicineId = idGenerator.incrementAndGet();
        medicine.setMedicineId(medicineId);
        medicineDatabase.put(medicineId, medicine);
        return true;
    }
    
    @PutMapping("/{medicineId}")
    public Medicine updateMedicine(@PathVariable int medicineId, @RequestBody Medicine updatedMedicine) {
        if (medicineDatabase.containsKey(medicineId)) {
            Medicine existingMedicine = medicineDatabase.get(medicineId);
            existingMedicine.setMedicineName(updatedMedicine.getMedicineName());
            existingMedicine.setPrice(updatedMedicine.getPrice());
            existingMedicine.setQuantity(updatedMedicine.getQuantity());
            existingMedicine.setDescription(updatedMedicine.getDescription());
            return existingMedicine;
        }
        return null; // Handle the case when the medicine with given ID is not found
    }
    
    @GetMapping
    public List<Medicine> getAllMedicines() {
        return new ArrayList<>(medicineDatabase.values());
    }

    @GetMapping("/{medicineId}")
    public Medicine getMedicine(@PathVariable int medicineId) {
        return medicineDatabase.get(medicineId);
    }

}
