import java.util.Scanner;

public class TestPunto {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		//Punto p1 tendrá los datos con los que se inicializo las variables (0, 0)	
		Punto p1 = new Punto();
		//Entrada de datos para el punto p2
		System.out.println("Primer valor del punto p2: ");
		int a = entrada.nextInt();
		System.out.println("Segundo valor del punto p2: ");
		int b = entrada.nextInt();
			
		Punto p2 = new Punto(a, b);
		//Punto p3 sera la copia del punto original
		Punto p3 = new Punto();
		System.out.println("Copia Punto original: " + p3.copia());
		//Mostramos en pantalla el Punto p2
		System.out.println("Punto p2 = " + p2);
		//Comparamos si los Puntos p1 y p2 2 son iguales y mostramos el resultado por pantalla
		if (p1.sonIguales(p2)) {
			System.out.println("Punto original y Punto p2 son iguales");
		} else {
			System.out.println("Punto original y Punto p2 son distintos");
		}
		//Desplazamos a X e Y los datos introducidos (Sumar)
		Punto p4 = new Punto();
		p4.desplazarXY(a, b);
		System.out.println("Suma de los valores recibidos a X e Y: " + p4);
		//Desplazamos a X el valor correspondiente que hemos introducido
		Punto p5 = new Punto();
		p5.desplazarX(a);
		System.out.println("Suma a X el valor recibido: " + p5);
		//Desplazamos a Y el valor correspondiente que hemos introducido
		Punto p6 = new Punto();
		p6.desplazarY(b);
		System.out.println("Suma a Y el valor recibido: " + p6);
		
	}
}
