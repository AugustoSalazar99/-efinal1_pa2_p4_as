package com.example.demo.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.print.Doc;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Cita;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

@Repository
@Transactional
public class CitaRepositoryImpl implements ICitaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Cita cita) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cita);
	}

	@Override
	public void actualizar(Cita cita) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cita);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Cita cit = this.seleccionar(id);
		this.entityManager.remove(cit);
	}

	@Override
	public Cita seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cita.class, id);
	}

	@Override
	public Cita agendarCita(String numero_cita, LocalDateTime fecha_cita, BigDecimal valor_cita, String lugar_cita,
			String cedula_doctor, String cedula_paciente) {
		
		Cita cita = new Cita();
		cita.setNumero_cita(numero_cita);
		cita.setFecha_cita(fecha_cita);
		cita.setValor_cita(valor_cita);
		cita.setLugar_cita(lugar_cita);

		Doctor doctor = this.entityManager.find(Doctor.class, cedula_doctor);
		Paciente paciente = this.entityManager.find(Paciente.class, cedula_paciente);
		if (doctor == null || paciente == null) {
			return null;
		}

		// rela cit/doc
		cita.setDoctor(doctor);
		cita.setPaciente(paciente);
		this.entityManager.persist(cita);

		return cita;

	}

}
