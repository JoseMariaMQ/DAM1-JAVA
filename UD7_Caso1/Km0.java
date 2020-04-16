
public class Km0 extends Producto {
	//Atributos
	private int nKm;
	//Método constructor sin parámetros
	public Km0() {
		super();
	}
	//Método constructor con parámetros
	public Km0(String matricula, String color, String modelo, int nKm) {
		super(matricula, color, modelo);
		this.nKm = nKm;
	}
	//Getter
	public int getnKm() {
		return nKm;
	}
	//Setter
	public void setnKm(int nKm) {
		this.nKm = nKm;
	}
	//Método para mostrar la información del objeto
	@Override
	public String toString() {
		return "Coche Km0: [Matrícula: " + getMatricula() + ", Color: " + getColor() + ", Modelo: " + getModelo() + ", Nº km: " + nKm + "]";
	}	
	
}
