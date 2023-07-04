package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cita")

public class Cita {

	@GeneratedValue(generator = "seq_cita",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name =  "seq_cita",sequenceName = "seq_cita",allocationSize = 1)
	
	@Id
	@Column(name="cime_id")
	private Integer id;
	@Column(name="cime_numero_cita")
	private String numero_cita;
	@Column(name="cime_fecha_cita")
	private LocalDateTime fecha_cita;
	@Column(name="cime_valor_cita")
	private BigDecimal valor_cita;
	@Column(name="cime_lugar_cita")
	private String lugar_cita;
	@Column(name="cime_diagnostico")
	private String diagnostico;
	@Column(name="cime_receta")
	private String receta;
	@Column(name="cime_fecha_proxima_cita")
	private LocalDateTime fecha_proxima_cita;
	

	
	//rel doc/cita
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cita_id_doctor")
	private Doctor doctor;
		
		
	//rel pac/cita
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cita_id_paciente")
	private Paciente paciente;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNumero_cita() {
		return numero_cita;
	}


	public void setNumero_cita(String numero_cita) {
		this.numero_cita = numero_cita;
	}


	public LocalDateTime getFecha_cita() {
		return fecha_cita;
	}


	public void setFecha_cita(LocalDateTime fecha_cita) {
		this.fecha_cita = fecha_cita;
	}


	public BigDecimal getValor_cita() {
		return valor_cita;
	}


	public void setValor_cita(BigDecimal valor_cita) {
		this.valor_cita = valor_cita;
	}


	public String getLugar_cita() {
		return lugar_cita;
	}


	public void setLugar_cita(String lugar_cita) {
		this.lugar_cita = lugar_cita;
	}


	public String getDiagnostico() {
		return diagnostico;
	}


	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}


	public String getReceta() {
		return receta;
	}


	public void setReceta(String receta) {
		this.receta = receta;
	}


	public LocalDateTime getFecha_proxima_cita() {
		return fecha_proxima_cita;
	}


	public void setFecha_proxima_cita(LocalDateTime fecha_proxima_cita) {
		this.fecha_proxima_cita = fecha_proxima_cita;
	}


	public Doctor getDoctor() {
		return doctor;
	}


	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


	@Override
	public String toString() {
		return "Cita [id=" + id + ", numero_cita=" + numero_cita + ", fecha_cita=" + fecha_cita + ", valor_cita="
				+ valor_cita + ", lugar_cita=" + lugar_cita + ", diagnostico=" + diagnostico + ", receta=" + receta
				+ ", fecha_proxima_cita=" + fecha_proxima_cita + ", doctor=" + doctor + ", paciente=" + paciente + "]";
	}


}
