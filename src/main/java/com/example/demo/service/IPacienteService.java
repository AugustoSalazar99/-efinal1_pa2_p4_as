package com.example.demo.service;

import com.example.demo.repository.modelo.Paciente;

public interface IPacienteService {
	
	public void guardar(Paciente paciente);
	public void actualizar(Paciente paciente);
	public void eliminar(Integer id);
	public Paciente reporte(Integer id);

}
