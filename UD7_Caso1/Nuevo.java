
public class Nuevo extends Producto {

	//M�todo constructor sin par�metros
	public Nuevo() {
		super();
	}
	//M�todo constructor con par�metros
	public Nuevo(String matricula, String color, String modelo) {
		super(matricula, color, modelo);
	}
	//M�todo para mostrar la informaci�n del objeto
	@Override
	public String toString() {
		return "Coche Nuevo: [Matr�cula: " + getMatricula() + ", Color: " + getColor() + ", Modelo: " + getModelo() + "]";
	}
	
}
