package com.example.Labo1Ex;

import com.example.Labo1Ex.domain.model.BaseVirus;
import com.example.Labo1Ex.domain.model.State;
import com.example.Labo1Ex.services.SpecimenService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Labo1ExApplication {

	public static void main(String[] args) {
		SpringApplication.run(Labo1ExApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(SpecimenService productService) {
		return args -> {
			System.out.println("=== INICIANDO REPORTE ===");
			System.out.println("=== REGISTRO COMPLETO ===");
			productService.getAllSpecimens().forEach(specimen ->
					System.out.println("[S.T.A.R.S-REPORT] Nombre: " + specimen.getName() + " | Nivel de Peligro: " + specimen.getDangerLevel() + " | Punto Débil: " + specimen.getWeakPoint()));

			System.out.println("=== ESPECÍMENES CON G-VIRUS ===");
			productService.getSpecimensByBaseVirus(BaseVirus.GVIRUS).forEach(specimen ->
					System.out.println("[S.T.A.R.S-REPORT] Nombre: " + specimen.getName() + " | Nivel de Peligro: " + specimen.getDangerLevel() + " | Punto Débil: " + specimen.getWeakPoint()));

			System.out.println("=== ESPECIMENES CONTENIDOS ===");
			productService.getSpecimenByState(State.CONTAINED).forEach(specimen ->
					System.out.println("[S.T.A.R.S-REPORT] Nombre: " + specimen.getName() + " | Nivel de Peligro: " + specimen.getDangerLevel() + " | Punto Débil: " + specimen.getWeakPoint()));

			System.out.println("=== VIRUS ACTIVOS ===");
			productService.getBaseVirusInLiberty().forEach(virus -> System.out.println("[S.T.A.R.S-REPORT] Nombre del virus: " + virus));
		};
	}
}
