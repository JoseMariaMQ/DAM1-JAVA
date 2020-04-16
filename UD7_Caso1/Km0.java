
public class Km0 extends Producto {
	//Atributos
	private int nKm;
	//M�todo constructor sin par�metros
	public Km0() {
		super();
	}
	//M�todo constructor con par�metros
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
	//M�todo para mostrar la informaci�n del objeto
	@Override
	public String toString() {
		return "Coche Km0: [Matr�cula: " + getMatricula() + ", Color: " + getColor() + ", Modelo: " + getModelo() + ", N� km: " + nKm + "]";
	}	
	
}
