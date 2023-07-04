package com.example.demo.repository;

import com.example.demo.repository.modelo.Doctor;

public interface IDoctorRepository {
	/*public void insertar();
	public void actualizar();
	public void eliminar();
	public Doctor seleccionar();
*/
	//ddl
	public void insertar(Doctor doctor);
	public void actualizar(Doctor doctor);
	public void eliminar(Integer id);
	public Doctor seleccionar(Integer id);
	
	//dml
	
	//public Doctor seleccionar(Integer id);
}
