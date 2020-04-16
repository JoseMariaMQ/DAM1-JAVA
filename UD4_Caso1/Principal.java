public class Principal {

	public static void main(String[] args) {
				
		Empleado e1 = new Empleado("Antonio", "García", "Muñoz", "99999999A", 600000000, "Calle Andalucia");
		System.out.println(e1);
		
		Informatico i1 = new Informatico("Antonio", "García", "Muñoz", "99999999A", 600000000, "Calle Andalucia nº1", "Prácticas", 15000, "Completa");
		System.out.println(i1);
		
		Administrativo a1 = new Administrativo("Julia", "Aranda", "Pérez", "11111111B", 699999999, "Calle Alemania nº2", "Indefinido");
		System.out.println(a1);
		
		Contable c1 = new Contable("Julia", "Aranda", "Pérez", "11111111B", 699999999, "Calle Alemania nº2", "Indefinido", 23000, "Completa");
		System.out.println(c1);
		
		Contable c2 = new Contable();
		System.out.println(c2);

	}
}
