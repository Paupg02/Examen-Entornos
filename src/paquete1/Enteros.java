package paquete1;

/**
 * 
 * @author Paula Plaza Guirado
 * @version 1.0
 *
 */
public class Enteros {

	/**
	 * Metodo que calcula el factorial de un número contando del número hasta 1
	 * @param n Número a calcular el factorial
	 * @return Factorial del número
	 */
	public static int r_factorial(int n) {
		int resultado;

		if (n == 0) {
			resultado = 1;
		} else {
			resultado = n * r_factorial(n - 1);
		}
		return resultado;
	}

	/**
	 * Metodo que calcula el factorial de un número desde 2 hasta el número
	 * @param n Número a calcular el factorial
	 * @return Factorial del número
	 */
	public static int factorial(int n) {
		int resultado;

		resultado = 1;
		for (int i = 2; i <= n; i++) {
			resultado = resultado * i;
		}
		return resultado;
	}

	/**
	 * Escribe una cadena al reves
	 * @param cadena Cadena a escribir
	 * @return Cadena escrita al reves
	 */
	public static String alreves(String cadena) {
		String resultado = "";

		for (int i = cadena.length() - 1; i >= 0; i--) {
			resultado = resultado + cadena.charAt(i);
		}
		return resultado;
	}

	/**
	 * Comprueba si un número es capicuio o no
	 * @param n Número al reves
	 * @return True si es capicuo False si no es capicuo
	 */
	public static boolean capicua(int n) {
		boolean resultado;
		String cadena;

		cadena = Integer.toString(n);
		if (cadena.equals(alreves(cadena))) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
	}

	/**
	 * Comprueba si un número es divisible entre otro es decir si el resultado de la  division es 0
	 * @param multiplo Número a dividir
	 * @param divisor Número por el que va a ser dividido 
	 * @return True si el resto es 0 False si el resto no es 0
	 */
	public static boolean divisible(int multiplo, int divisor) {
		boolean resultado;

		if (multiplo % divisor == 0) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
	}

	/**
	 * Comprueba si un número es multiplo de otro es decir si el resultado de la  division es 0
	 * @param mult  multiplo Número a dividir
	 * @param divisor Número por el que va a ser dividido 
	 * @return True si el resto es 0 False si el resto no es 0
	 */
	public static boolean multiplo(int mult, int divisor) {
		boolean resultado;

		try {
			if (mult % divisor == 0) {
				resultado = true;
			} else {
				resultado = false;
			}
		} catch (ArithmeticException e) {
			resultado = false;
		}
		return resultado;
	}

	/**
	 * Comprueba si un número es primo o no
	 * @param n Número a omprobar
	 * @return True si el numero es primo False si no lo es
	 */
	public static boolean esPrimo(int n) {
		boolean primo;

		if (n <= 1) {
			primo = false;
		} else {
			primo = true;
			int i = 2;
			while (primo && i <= n / 2) {
				if (divisible(n, i)) {
					primo = false;
				} else {
					i++;
				}
			}
		}
		return primo;
	}

	/**
	 * Calcula el número primos entre 2 y un número pasado por parametro 
	 * @param n Número pasado
	 * @return Cantidad de primos que hay desde 2 hasta el número
	 */
	public static int n_primos(int n) {
		int resultado = 0;

		for (int i = 2; i <= n; i++) {
			if (esPrimo(i)) {
				resultado++;
			}
		}
		return resultado;
	}

	/**
	 * Calcula todos los números primos que hay desde 2 hasta el númreo pasdo por parametro
	 * @param n Número pasado
	 * @return Primos que hay desde 2 hasta el número
	 */
	public static int[] primosHasta(int n) {
		int[] resultado;

		resultado = new int[n_primos(n)];
		int cont = 0;
		for (int i = 2; i <= n; i++) {
			if (esPrimo(i)) {
				resultado[cont] = i;
				cont++;
			}
		}

		return resultado;
	}

	/**
	 * Calcula los n primeros primos 
	 * @param n Númreo de primos a calcular
	 * @return n primeros primos
	 */
	public static int[] primerosPrimos(int n) {
		int[] resultado = new int[(n < 0) ? 0 : n];

		int cont = 0;
		int i = 2;
		while (cont < n) {
			if (esPrimo(i)) {
				resultado[cont] = i;
				cont++;
			}
			i++;
		}

		return resultado;
	}
}
