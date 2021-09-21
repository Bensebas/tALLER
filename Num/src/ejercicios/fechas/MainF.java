package ejercicios.fechas;

import java.time.LocalDate;

public class MainF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate hoy = LocalDate.now();
		LocalDate fin = hoy.plusDays(15);

		CursoVacacional curso1 = new CursoVacacional();
		curso1.setNombre("Volley principiantes");
		curso1.setFechaInicio(hoy);
		curso1.setFechaFin(fin);

		System.out.println("Nombre: " + curso1.getNombre());
		System.out.println("F I: " + curso1.getFechaInicio());
		System.out.println("F I: " + curso1.getFechaFin());

		LocalDate hoy2 = LocalDate.now();
		LocalDate diaInicio = hoy.minusDays(2);
		LocalDate diaFinalizo = hoy.plusDays(20);

		CursoVacacional curso2 = new CursoVacacional();
		curso2.setNombre("Natación principiantes");
		curso2.setFechaInicio(hoy);
		curso2.setFechaFin(fin);

		LocalDate fechaEspecifica = LocalDate.of(2022, 2, 15);
		System.out.println(fechaEspecifica);

		LocalDate fechaEspeciIni = LocalDate.of(2022, 2, 15);
		LocalDate fechaEspeciFin = LocalDate.of(2022, 7, 10);

		CursoVacacional curso3 = new CursoVacacional();
		curso3.setNombre("Karate");
		curso3.setFechaInicio(fechaEspeciIni);
		curso3.setFechaFin(fechaEspeciFin);

		LocalDate fechaVista = curso3.getFechaFin();
		LocalDate fechaVistaNueva = fechaVista.plusDays(3);

		curso3.setFechaFin(fechaVistaNueva);

		System.out.println("Nombre: " + curso3.getNombre());
		System.out.println("F I: " + curso3.getFechaInicio());
		System.out.println("F I: " + curso3.getFechaFin());

	}

}
