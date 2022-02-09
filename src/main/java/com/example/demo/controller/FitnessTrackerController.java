package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Appointment;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.service.AppointmentService;

@RestController
public class FitnessTrackerController {
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping("/appointment")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addAppointment(@RequestBody @Valid Appointment appointment) {
		appointmentService.addAppointment(appointment);
	}
	@GetMapping("/appointment")
	public List<Appointment> getAllAppointment() {
		return appointmentRepository.findAll();
	}
	@GetMapping("/appointment/{id}")
	public Appointment getAppointmentById(@PathVariable(value = "id") int id) {
		return appointmentRepository.findById(id);
	}

}
