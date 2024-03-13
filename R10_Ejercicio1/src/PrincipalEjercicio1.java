import java.util.Random;
import java.util.Scanner;

public class PrincipalEjercicio1 {
	public static final int NUMERO_ALUMNOS = 8;
	public static final int NOTA_LIMITE_APROBADO = 5;
	public static final int NOTA_MAXIMA=10;
	public static final String[] ASIGNATURAS = 
		{ "PROGRAMACION", "BASE DE DATOS", "LENGUAJES DE MARCA" };
	private static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		int matrizNotas[][] = new int[NUMERO_ALUMNOS][ASIGNATURAS.length];
		String asignatura;
		
		cargarNotasMatriz(matrizNotas);

		imprimirNotas(matrizNotas);

		numeroDeSuspensosPorAlumno(matrizNotas);

		System.out.println("Introduce asignatura:");
		asignatura=teclado.nextLine();
		
		notaMediaDeAsignatura(matrizNotas, asignatura);
		

	}

	/**
	 * Carga los datos de la matriz con notas aleatorias entre 0 y 10
	 * @param matrizNotas
	 */
	private static void cargarNotasMatriz(int matrizNotas[][]) {
		int indiceAlumno, indiceAsignatura;

		Random serie = new Random();
		for (indiceAlumno = 0; indiceAlumno < matrizNotas.length; indiceAlumno++) {

			for (indiceAsignatura = 0; indiceAsignatura < matrizNotas[0].length; indiceAsignatura++) {

				matrizNotas[indiceAlumno][indiceAsignatura] = serie.nextInt(NOTA_MAXIMA+1); // DE
																								// 0
																								// A
																								// NOTA_MAXIMA
			}
		}
	}
	/**
	 * Imprime las notas por pantalla
	 * @param matrizNotas
	 */
	private static void imprimirNotas(int matrizNotas[][]) {
		int indiceAlumno, indiceAsignatura;

		for (int i = 0; i < ASIGNATURAS.length; i++) {
			System.out.print("\t" + ASIGNATURAS[i]);
		}
		
		
		System.out.println();
		for (indiceAlumno = 0; indiceAlumno < matrizNotas.length; indiceAlumno++) {
			System.out.print("Alumno " + (indiceAlumno + 1) + "    ");
			for (indiceAsignatura = 0; indiceAsignatura < matrizNotas[0].length; indiceAsignatura++) {
				System.out.print(matrizNotas[indiceAlumno][indiceAsignatura]);
				System.out.print("\t\t");
			}
			System.out.println();
		}
		
	}
	/**
	 * Realiza un listado donde aparezca para cada alumno cuantos suspensos tiene
	 */
	private static void numeroDeSuspensosPorAlumno(int matrizNotas[][]) {
		
		for (int i = 0; i < matrizNotas.length; i++) {
			for (int j = 0; j < matrizNotas[i].length; j++) {
				if (matrizNotas[i][j] < NOTA_LIMITE_APROBADO) {
					System.out.print("");
				}
			}
		}
		
	}

	
	private static double notaMediaDeAsignatura(int matrizNotas[][], String asignatura) {
		
		return 0;
	}

	private static void notaMediaPorAsignatura( int[][] matrizNota){


	}

	/* Alumnos con 0 suspensos: X
	 * Alumnos con 1 suspensos: X
	 * Alumnos con 2 suspensos: X
	 * Alumnos con 3 suspensos: X
	 */
	private static void estadisticaAlumnosPorSuspensos( int[][] matrizNotas){

	}

	

	
}

