package t6ejeLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class T6ejeLambda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random azar = new Random();
		int opcion = 0;

		List<Double> temperaturas = new ArrayList<>();

		for (int i = 0; i < 12; i++) {
			temperaturas.add(azar.nextDouble(-10, 35));
		}
		do {
			System.out.println("Elige opción: ");
			System.out.println("1) Mostrar temperaturas");
			System.out.println("2) Mostrar temperatas - de 10 grados");
			System.out.println("3) Mostrarlo en grados farenheit");
			System.out.println("4) Mostrar cuantos meses tuvieron mas de 20 grados");
			System.out.println("5) Mostrar temperaturas entre 15 y 20 grados redondeadas");
			System.out.println("6) Mostrar otra lista que contenga mismas temperaturas pero con 5 grados menos");
			System.out.println("0) SALIR");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				temperaturas.stream().forEach(temp -> System.out.println(String.format("%.2f", temp)));
				break;

			case 2:
				temperaturas.stream().filter(temp -> temp < 10)
						.forEach(temp -> System.out.println(String.format("%.2f", temp)));
				break;

			case 3:
				temperaturas.stream()
						.forEach(temp -> System.out.println(String.format("%.2f", temp * 9 / 5) + 32 + " fahreinheit"));
				break;
			case 4:
				System.out.println(temperaturas.stream().filter(temp -> temp > 20).count()); // o toLIst. size
				break;
			case 5:
				temperaturas.stream().filter(temp -> temp > 15 && temp < 20)
						.forEach(temp -> System.out.println(Math.round(temp)));
				break;

			case 6:
				List<Double> temperaturasMenos = temperaturas.stream().map(temp -> temp - 5).toList();
				System.out.println(temperaturasMenos);
				break;
			}
		} while (opcion != 0);
	}
}
//CAMBIO
