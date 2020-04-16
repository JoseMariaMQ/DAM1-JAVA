import java.util.Scanner;

public class TestSegmento {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		//Entrada de datos para un Punto del Segmento s1
		System.out.println("Introduce el primer valor para un punto de s1: ");
		int x1 = entrada.nextInt();
		System.out.println("Introduce el segundo valor para un punto de s1: ");
		int y2 = entrada.nextInt();
		
		Punto puntoIZ = new Punto(x1, y2);
		//Entrada de datos para otro Punto del Segmento s1
		System.out.println("Introduce el primer valor para otro punto de s1: ");
		int a1 = entrada.nextInt();
		System.out.println("Introduce el segundo valor para otro punto de s1: ");
		int b2 = entrada.nextInt();
			
		Punto puntoDE = new Punto(a1, b2);
		
		Segmento s1 = new Segmento(puntoIZ, puntoDE);
		//Entrada de datos para un Punto del Segmento s2		
		System.out.println("Introduce el primer valor para un punto de s2: ");
		int x = entrada.nextInt();
		System.out.println("Introduce el segundo valor para un punto de s2: ");
		int y = entrada.nextInt();
		
		Punto puntoIZ2 = new Punto(x, y);
		//Entrada de datos para otro Punto del Segmento s2
		System.out.println("Introduce el primer valor para otro punto de s2: ");
		int a = entrada.nextInt();
		System.out.println("Introduce el segundo valor para otro punto de s2: ");
		int b = entrada.nextInt();
			
		Punto puntoDE2 = new Punto(a, b);
		
		Segmento s2 = new Segmento(puntoIZ2, puntoDE2);
		//Mostramos en pantalla los valores de ambos Segmentos
		System.out.println("1er " + s1);
		System.out.println("2do " + s2);
		//Mostramos en pantalla la pendiente de ambos Segmentos
		System.out.println("Pendiente del 1er Segmento: " + s1.pendiente());
		System.out.println("Pendiente del 2do Segmento: " + s2.pendiente());
		//Comparamos si son consecutivos con el método sonConsecutivos y mostramos en pantalla el resultado
		if (s1.sonConsecutivos(s2)) {
			System.out.println("Segmento 1 y Segmento 2 son consecutivos");
		} else {
			System.out.println("Segmento 1 y Segmento 2 no son consecutivos");
		}
		//Comparamos si son iguales con el método sonIguales y mostramos en pantalla el resultado
		if (s1.sonIguales(s2)) {
			System.out.println("Segmento 1 y Segmento 2 son iguales");
		} else {
			System.out.println("Segmento 1 y Segmento 2 son distintos");
		}
		
	}

}
