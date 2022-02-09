package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Appointment;
import com.example.demo.repository.AppointmentRepository;

@Service

public class AppointmentService {
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	public void addAppointment(@Valid Appointment appointment) {
		appointmentRepository.save(appointment);
	}

}
