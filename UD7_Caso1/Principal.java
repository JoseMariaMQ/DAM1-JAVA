
public class Principal {

	public static void main(String[] args) {
		//Creacion de objetos de cada clase
		Nuevo nuevo = new Nuevo("1111KMN", "Azul", "Seat Ibiza");
		Km0 km0 = new Km0("2222JBL", "Rojo", "Seat León", 45);
		SegundaMano segundaMano = new SegundaMano("3333HCD", "Amarillo", "Seat Ateca", 26000, "Antonio López");
		
		//Mostrar por pantalla los resultados
		System.out.println(nuevo);
		System.out.println(km0);
		System.out.println(segundaMano);

	}

}
