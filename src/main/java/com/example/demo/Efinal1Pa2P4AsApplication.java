package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Cita;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;
import com.example.demo.service.ICitaService;
import com.example.demo.service.IDoctorService;
import com.example.demo.service.IPacienteService;

@SpringBootApplication
public class Efinal1Pa2P4AsApplication implements CommandLineRunner {
	@Autowired
	private IPacienteService pacienteService;

	@Autowired
	private IDoctorService doctorService;

	@Autowired
	private ICitaService citaService;

	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P4AsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * Doctor doc=new Doctor(); doc.setCedula("1243213265"); doc.setNombre("Jorge");
		 * doc.setApellido("Arias"); doc.setFecha_nacimiento(LocalDateTime.now());
		 * doc.setNumero_consultorio("34-A");
		 * 
		 * doc.setCodigo_senescyt("34E56"); doc.setGenero("M");
		 * 
		 * this.doctorService.guardar(doc);
		 * 
		 */
		/*
		 * Paciente pac= new Paciente();
		 * 
		 * pac.setNombre("Augusto"); pac.setCedula("3212547623");
		 * pac.setApellido("Salazar"); pac.setFecha_nacimiento(LocalDateTime.now());
		 * pac.setCodigo_seguro("321"); pac.setEstatura("1.50"); pac.setPeso("55kg");
		 * pac.setGenero("M");
		 * 
		 * this.pacienteService.guardar(pac);
		 * 
		 * 
		 * Paciente pac1= new Paciente(); pac1.setId(1); pac1.setNombre("Rony");
		 * pac1.setApellido("Quinaucho"); this.pacienteService.actualizar(pac1);
		 */
		Cita cita = this.citaService.reporteAgendarCita("234", LocalDateTime.now(), new BigDecimal(100), "Av.Patria",
				"32541243", "2315421");
		if (cita != null) {
			System.out.println("Cita encontrada:");
			System.out.println("Número de cita: " + cita.getNumero_cita());
			System.out.println("Fecha de cita: " + cita.getFecha_cita());
			System.out.println("Valor de cita: " + cita.getValor_cita());
			System.out.println("Lugar de cita: " + cita.getLugar_cita());

		} else {
			System.out.println("No se ingreso ");
		}

	}
}
