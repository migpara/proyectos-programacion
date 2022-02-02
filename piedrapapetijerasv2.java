import java.util.Random;
import java.util.Scanner;

public class piedrapapetijerasv2 {

	public static void main(String[] args) {
		// Pierda papel o tijera

		// Zona declarativa

		int jugador;
		Scanner sc = new Scanner(System.in);
		int maquina;
		Random random = new Random();
		int puntosjugador;
		int puntosmaquina;
		puntosjugador = 0;
		puntosmaquina = 0;

		// Zona ejecutiva
		// Primera partida
		System.out.println("Elige el numero que represente tu eleccion:");
		System.out.println("1--->Tijeras");
		System.out.println("2--->Papel");
		System.out.println("3--->Piedra");
		System.out.println("4--->Spock");
		System.out.println("5--->Lagarto");
		jugador = sc.nextInt();
		maquina = random.nextInt(5) + 1;
		System.out.println("La maquina ha escogido:");
		switch (maquina) {
		case 1:
			System.out.println("Tijeras");
			break;
		case 2:
			System.out.println("Papel");
			break;
		case 3:
			System.out.println("Piedra");
			break;
		case 4:
			System.out.println("Spock");
			break;
		case 5:
			System.out.println("Lagarto");
			break;
		}
		if (jugador == 1 && maquina == 1) {
			System.out.println("Tijeras vs Tijeras");
			System.out.println("Empate");
			puntosjugador++;
			puntosmaquina++;
		} else if (jugador == 1 && maquina == 2) {
			System.out.println("Tijeras vs Papel");
			System.out.println("Ganas");
			puntosjugador++;

		} else if (jugador == 1 && maquina == 3) {
			System.out.println("Tijeras vs Piedra");
			System.out.println("Pierdes");
			puntosmaquina++;
		} else if (jugador == 1 && maquina == 4) {
			System.out.println("Tijeras vs Spock");
			System.out.println("Pierdes");
			puntosmaquina++;
		} else if (jugador == 1 && maquina == 5) {
			System.out.println("Tijeras vs Lagarto");
			System.out.println("Ganas");
			puntosjugador++;

		} else if (jugador == 2 && maquina == 1) {
			System.out.println("Papel vs Tijeras");
			System.out.println("Pierdes");
			puntosmaquina++;

		} else if (jugador == 2 && maquina == 2) {
			System.out.println("Papel vs Papel");
			System.out.println("Empate");
			puntosjugador++;
			puntosmaquina++;
		} else if (jugador == 2 && maquina == 3) {
			System.out.println("Papel vs Piedra");
			System.out.println("Ganas");
			puntosjugador++;

		} else if (jugador == 2 && maquina == 4) {
			System.out.println("Papel vs Spock");
			System.out.println("Ganas");
			puntosjugador++;
		} else if (jugador == 2 && maquina == 5) {
			System.out.println("Papel vs Lagarto");
			System.out.println("Pierdes");
			puntosmaquina++;

		} else if (jugador == 3 && maquina == 1) {
			System.out.println("Piedra vs Tijeras");
			System.out.println("Ganas");
			puntosjugador++;

		} else if (jugador == 3 && maquina == 2) {
			System.out.println("Pierda vs Papel");
			System.out.println("Pierdes");
			puntosmaquina++;

		} else if (jugador == 3 && maquina == 3) {
			System.out.println("Piedra vs Piedra");
			System.out.println("Empate");
			puntosjugador++;
			puntosmaquina++;

		} else if (jugador == 4 && maquina == 1) {
			System.out.println("Spock vs Tijeras");
			System.out.println("Ganas");
			puntosjugador++;

		} else if (jugador == 4 && maquina == 2) {
			System.out.println("Spock vs Papel");
			System.out.println("Pierdes");
			puntosmaquina++;
		} else if (jugador == 4 && maquina == 3) {
			System.out.println("Spock vs Piedra");
			System.out.println("Ganas");
			puntosjugador++;

		} else if (jugador == 4 && maquina == 4) {
			System.out.println("Spock vs Spock");
			System.out.println("Empate");
			puntosjugador++;
			puntosmaquina++;

		} else if (jugador == 4 && maquina == 5) {
			System.out.println("Spock vs Lagarto");
			System.out.println("Pierdes");
			puntosmaquina++;

		} else if (jugador == 5 && maquina == 1) {
			System.out.println("Lagarto vs Tijeras");
			System.out.println("Pierdes");
			puntosmaquina++;

		} else if (jugador == 5 && maquina == 2) {
			System.out.println("Lagarto vs Papel");
			System.out.println("Ganas");
			puntosjugador++;

		} else if (jugador == 5 && maquina == 3) {
			System.out.println("Lagarto vs Piedra");
			System.out.println("Pierdes");
			puntosmaquina++;

		} else if (jugador == 5 && maquina == 4) {
			System.out.println("Lagarto vs Spock");
			System.out.println("Ganas");
			puntosjugador++;

		} else if (jugador == 5 && maquina == 5) {
			System.out.println("Lagarto vs Lagarto");
			System.out.println("Empate");
			puntosjugador++;
			puntosmaquina++;

		}
		System.out.println("Tus puntos son:");
		System.out.println(puntosjugador);
		System.out.println("Los puntos de la maquina son:");
		System.out.println(puntosmaquina);

		// Segunda partida

		System.out.println("Elige el numero que represente tu eleccion:");
		System.out.println("1--->Tijeras");
		System.out.println("2--->Papel");
		System.out.println("3--->Piedra");
		System.out.println("4--->Spock");
		System.out.println("5--->Lagarto");
		jugador = sc.nextInt();
		maquina = random.nextInt(5) + 1;
		System.out.println("La maquina ha escogido:");
		switch (maquina) {
		case 1:
			System.out.println("Tijeras");
			break;
		case 2:
			System.out.println("Papel");
			break;
		case 3:
			System.out.println("Piedra");
			break;
		case 4:
			System.out.println("Spock");
			break;
		case 5:
			System.out.println("Lagarto");
			break;
		}
		if (jugador == 1 && maquina == 1) {
			System.out.println("Tijeras vs Tijeras");
			System.out.println("Empate");
			puntosjugador++;
			puntosmaquina++;
		} else if (jugador == 1 && maquina == 2) {
			System.out.println("Tijeras vs Papel");
			System.out.println("Ganas");
			puntosjugador++;

		} else if (jugador == 1 && maquina == 3) {
			System.out.println("Tijeras vs Piedra");
			System.out.println("Pierdes");
			puntosmaquina++;
		} else if (jugador == 1 && maquina == 4) {
			System.out.println("Tijeras vs Spock");
			System.out.println("Pierdes");
			puntosmaquina++;
		} else if (jugador == 1 && maquina == 5) {
			System.out.println("Tijeras vs Lagarto");
			System.out.println("Ganas");
			puntosjugador++;

		} else if (jugador == 2 && maquina == 1) {
			System.out.println("Papel vs Tijeras");
			System.out.println("Pierdes");
			puntosmaquina++;

		} else if (jugador == 2 && maquina == 2) {
			System.out.println("Papel vs Papel");
			System.out.println("Empate");
			puntosjugador++;
			puntosmaquina++;
		} else if (jugador == 2 && maquina == 3) {
			System.out.println("Papel vs Piedra");
			System.out.println("Ganas");
			puntosjugador++;

		} else if (jugador == 2 && maquina == 4) {
			System.out.println("Papel vs Spock");
			System.out.println("Ganas");
			puntosjugador++;
		} else if (jugador == 2 && maquina == 5) {
			System.out.println("Papel vs Lagarto");
			System.out.println("Pierdes");
			puntosmaquina++;

		} else if (jugador == 3 && maquina == 1) {
			System.out.println("Piedra vs Tijeras");
			System.out.println("Ganas");
			puntosjugador++;

		} else if (jugador == 3 && maquina == 2) {
			System.out.println("Pierda vs Papel");
			System.out.println("Pierdes");
			puntosmaquina++;

		} else if (jugador == 3 && maquina == 3) {
			System.out.println("Piedra vs Piedra");
			System.out.println("Empate");
			puntosjugador++;
			puntosmaquina++;

		} else if (jugador == 4 && maquina == 1) {
			System.out.println("Spock vs Tijeras");
			System.out.println("Ganas");
			puntosjugador++;

		} else if (jugador == 4 && maquina == 2) {
			System.out.println("Spock vs Papel");
			System.out.println("Pierdes");
			puntosmaquina++;
		} else if (jugador == 4 && maquina == 3) {
			System.out.println("Spock vs Piedra");
			System.out.println("Ganas");
			puntosjugador++;

		} else if (jugador == 4 && maquina == 4) {
			System.out.println("Spock vs Spock");
			System.out.println("Empate");
			puntosjugador++;
			puntosmaquina++;

		} else if (jugador == 4 && maquina == 5) {
			System.out.println("Spock vs Lagarto");
			System.out.println("Pierdes");
			puntosmaquina++;

		} else if (jugador == 5 && maquina == 1) {
			System.out.println("Lagarto vs Tijeras");
			System.out.println("Pierdes");
			puntosmaquina++;

		} else if (jugador == 5 && maquina == 2) {
			System.out.println("Lagarto vs Papel");
			System.out.println("Ganas");
			puntosjugador++;

		} else if (jugador == 5 && maquina == 3) {
			System.out.println("Lagarto vs Piedra");
			System.out.println("Pierdes");
			puntosmaquina++;

		} else if (jugador == 5 && maquina == 4) {
			System.out.println("Lagarto vs Spock");
			System.out.println("Ganas");
			puntosjugador++;

		} else if (jugador == 5 && maquina == 5) {
			System.out.println("Lagarto vs Lagarto");
			System.out.println("Empate");
			puntosjugador++;
			puntosmaquina++;

		}
		System.out.println("Tus puntos son:");
		System.out.println(puntosjugador);
		System.out.println("Los puntos de la maquina son:");
		System.out.println(puntosmaquina);

		// Tercera partida
		if (puntosmaquina == 2 && puntosjugador == 0) {
			System.out.println("Vas perdiendo 2 a 0 :(");
		} else if (puntosmaquina == 0 && puntosjugador == 2) {
			System.out.println("Vas ganando 2 a 0 :)");
		} else {
			System.out.println("Elige el numero que represente tu eleccion:");
			System.out.println("1--->Tijeras");
			System.out.println("2--->Papel");
			System.out.println("3--->Piedra");
			System.out.println("4--->Spock");
			System.out.println("5--->Lagarto");
			jugador = sc.nextInt();
			maquina = random.nextInt(5) + 1;
			System.out.println("La maquina ha escogido:");
			switch (maquina) {
			case 1:
				System.out.println("Tijeras");
				break;
			case 2:
				System.out.println("Papel");
				break;
			case 3:
				System.out.println("Piedra");
				break;
			case 4:
				System.out.println("Spock");
				break;
			case 5:
				System.out.println("Lagarto");
				break;
			}
			if (jugador == 1 && maquina == 1) {
				System.out.println("Tijeras vs Tijeras");
				System.out.println("Empate");
				puntosjugador++;
				puntosmaquina++;
			} else if (jugador == 1 && maquina == 2) {
				System.out.println("Tijeras vs Papel");
				System.out.println("Ganas");
				puntosjugador++;

			} else if (jugador == 1 && maquina == 3) {
				System.out.println("Tijeras vs Piedra");
				System.out.println("Pierdes");
				puntosmaquina++;
			} else if (jugador == 1 && maquina == 4) {
				System.out.println("Tijeras vs Spock");
				System.out.println("Pierdes");
				puntosmaquina++;
			} else if (jugador == 1 && maquina == 5) {
				System.out.println("Tijeras vs Lagarto");
				System.out.println("Ganas");
				puntosjugador++;

			} else if (jugador == 2 && maquina == 1) {
				System.out.println("Papel vs Tijeras");
				System.out.println("Pierdes");
				puntosmaquina++;

			} else if (jugador == 2 && maquina == 2) {
				System.out.println("Papel vs Papel");
				System.out.println("Empate");
				puntosjugador++;
				puntosmaquina++;
			} else if (jugador == 2 && maquina == 3) {
				System.out.println("Papel vs Piedra");
				System.out.println("Ganas");
				puntosjugador++;

			} else if (jugador == 2 && maquina == 4) {
				System.out.println("Papel vs Spock");
				System.out.println("Ganas");
				puntosjugador++;
			} else if (jugador == 2 && maquina == 5) {
				System.out.println("Papel vs Lagarto");
				System.out.println("Pierdes");
				puntosmaquina++;

			} else if (jugador == 3 && maquina == 1) {
				System.out.println("Piedra vs Tijeras");
				System.out.println("Ganas");
				puntosjugador++;

			} else if (jugador == 3 && maquina == 2) {
				System.out.println("Pierda vs Papel");
				System.out.println("Pierdes");
				puntosmaquina++;

			} else if (jugador == 3 && maquina == 3) {
				System.out.println("Piedra vs Piedra");
				System.out.println("Empate");
				puntosjugador++;
				puntosmaquina++;

			} else if (jugador == 4 && maquina == 1) {
				System.out.println("Spock vs Tijeras");
				System.out.println("Ganas");
				puntosjugador++;

			} else if (jugador == 4 && maquina == 2) {
				System.out.println("Spock vs Papel");
				System.out.println("Pierdes");
				puntosmaquina++;
			} else if (jugador == 4 && maquina == 3) {
				System.out.println("Spock vs Piedra");
				System.out.println("Ganas");
				puntosjugador++;

			} else if (jugador == 4 && maquina == 4) {
				System.out.println("Spock vs Spock");
				System.out.println("Empate");
				puntosjugador++;
				puntosmaquina++;

			} else if (jugador == 4 && maquina == 5) {
				System.out.println("Spock vs Lagarto");
				System.out.println("Pierdes");
				puntosmaquina++;

			} else if (jugador == 5 && maquina == 1) {
				System.out.println("Lagarto vs Tijeras");
				System.out.println("Pierdes");
				puntosmaquina++;

			} else if (jugador == 5 && maquina == 2) {
				System.out.println("Lagarto vs Papel");
				System.out.println("Ganas");
				puntosjugador++;

			} else if (jugador == 5 && maquina == 3) {
				System.out.println("Lagarto vs Piedra");
				System.out.println("Pierdes");
				puntosmaquina++;

			} else if (jugador == 5 && maquina == 4) {
				System.out.println("Lagarto vs Spock");
				System.out.println("Ganas");
				puntosjugador++;

			} else if (jugador == 5 && maquina == 5) {
				System.out.println("Lagarto vs Lagarto");
				System.out.println("Empate");
				puntosjugador++;
				puntosmaquina++;

			}
			System.out.println("Tus puntos son:");
			System.out.println(puntosjugador);
			System.out.println("Los puntos de la maquina son:");
			System.out.println(puntosmaquina);
		}

		if (puntosjugador > puntosmaquina) {
			System.out.println("Has ganado :)");
		} else if (puntosjugador < puntosmaquina) {
			System.out.println("Has perdido :(");

		} else {
			System.out.println("Empate");
		}
	}

}
