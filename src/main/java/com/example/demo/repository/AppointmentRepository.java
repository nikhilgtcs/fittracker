package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Appointment;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {
	Appointment findById(int id);
	List<Appointment> findAll();
	void deleteById(int id);

}
