package com.example.demo.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {
	
	@GeneratedValue(generator = "seq_doctor",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name =  "seq_doctor",sequenceName =  "seq_doctor",allocationSize = 1)
	
	@Id
	@Column(name="doct_id")
	private Integer id;
	@Column(name="doct_cedula")
	private String cedula;
	@Column(name="doct_nombre")
	private String nombre;
	@Column(name="doct_apellido")
	private String apellido;
	@Column(name="doct_fecha_nacimiento")
	private LocalDateTime fecha_nacimiento;
	@Column(name="doct_consultorio")
	private String numero_consultorio;
	@Column(name="doct_codigo_senescyt")
	private String codigo_senescyt;
	@Column(name="doct_genero")
	private String genero;
	
	//relacion
	@OneToMany(mappedBy = "doctor")
	private List<Cita> citas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDateTime getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDateTime fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getNumero_consultorio() {
		return numero_consultorio;
	}

	public void setNumero_consultorio(String numero_consultorio) {
		this.numero_consultorio = numero_consultorio;
	}

	public String getCodigo_senescyt() {
		return codigo_senescyt;
	}

	public void setCodigo_senescyt(String codigo_senescyt) {
		this.codigo_senescyt = codigo_senescyt;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fecha_nacimiento=" + fecha_nacimiento + ", numero_consultorio=" + numero_consultorio
				+ ", codigo_senescyt=" + codigo_senescyt + ", genero=" + genero + ", citas=" + citas + "]";
	}
	

}
