package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICitaRepository;
import com.example.demo.repository.modelo.Cita;

@Service
public class CitaServiceImpl implements ICitaService {
	@Autowired
	private ICitaRepository citaRepository;

	@Override
	public void guardar(Cita cita) {
		// TODO Auto-generated method stub
		this.citaRepository.insertar(cita);
	}

	@Override
	public void actualizar(Cita cita) {
		// TODO Auto-generated method stub
		this.citaRepository.actualizar(cita);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.citaRepository.eliminar(id);
	}

	@Override
	public Cita reporte(Integer id) {
		// TODO Auto-generated method stub
		return this.citaRepository.seleccionar(id);
	}

	@Override
	public Cita reporteAgendarCita(String numero_cita, LocalDateTime fecha_cita, BigDecimal valor_cita,
			String lugar_cita, String cedula_doctor, String cedula_paciente) {
		// TODO Auto-generated method stub
		return this.citaRepository.agendarCita(numero_cita, fecha_cita, valor_cita, lugar_cita, cedula_doctor, cedula_paciente);
	}

}
