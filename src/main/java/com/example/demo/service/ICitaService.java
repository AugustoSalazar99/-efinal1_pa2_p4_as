package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.example.demo.repository.modelo.Cita;

public interface ICitaService {
	
	public void guardar(Cita cita);
	public void actualizar(Cita cita);
	public void eliminar(Integer id);
	public Cita reporte(Integer id);
	
	///
	
	public Cita reporteAgendarCita(String numero_cita,LocalDateTime fecha_cita,
			BigDecimal valor_cita,String lugar_cita,String cedula_doctor,
			String cedula_paciente);


}
