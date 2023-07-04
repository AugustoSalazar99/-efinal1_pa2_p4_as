package com.example.demo.service;

import com.example.demo.repository.modelo.Doctor;

public interface IDoctorService {
	
	//ddl
		public void guardar(Doctor doctor);
		public void actualizar(Doctor doctor);
		public void eliminar(Integer id);
		public Doctor reporte(Integer id);
		
		//dml

}
