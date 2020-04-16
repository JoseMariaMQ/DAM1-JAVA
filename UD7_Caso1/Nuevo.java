
public class Nuevo extends Producto {

	//Método constructor sin parámetros
	public Nuevo() {
		super();
	}
	//Método constructor con parámetros
	public Nuevo(String matricula, String color, String modelo) {
		super(matricula, color, modelo);
	}
	//Método para mostrar la información del objeto
	@Override
	public String toString() {
		return "Coche Nuevo: [Matrícula: " + getMatricula() + ", Color: " + getColor() + ", Modelo: " + getModelo() + "]";
	}
	
}
