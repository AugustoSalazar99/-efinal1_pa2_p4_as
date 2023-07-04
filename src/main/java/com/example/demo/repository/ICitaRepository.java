package com.example.demo.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.example.demo.repository.modelo.Cita;

public interface ICitaRepository {
	
	public void insertar(Cita cita);
	public void actualizar(Cita cita);
	public void eliminar(Integer id);
	public Cita seleccionar(Integer id);
	
	//agendar cita
	
	public Cita agendarCita(String numero_cita,LocalDateTime fecha_cita,
			BigDecimal valor_cita,String lugar_cita,String cedula_doctor,
			String cedula_paciente);

}
