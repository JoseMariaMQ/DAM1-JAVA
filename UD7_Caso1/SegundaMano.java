
public class SegundaMano extends Km0 {
	//Atributos
	private String nombreAntPro;
	//M�todo constructor sin par�metros
	public SegundaMano() {
		super();
	}
	//M�todo constructor con par�metros
	public SegundaMano(String matricula, String color, String modelo, int nKm, String nombreAntPro) {
		super(matricula, color, modelo, nKm);
		this.nombreAntPro = nombreAntPro;
	}
	//Getter
	public String getNombreAntPro() {
		return nombreAntPro;
	}
	//Setter
	public void setNombreAntPro(String nombreAntPro) {
		this.nombreAntPro = nombreAntPro;
	}
	//M�todo para mostrar la informaci�n del objeto
	@Override
	public String toString() {
		return "Coche Segunda Mano: [Matr�cula: " + getMatricula() + ", Color: " + getColor() + ", Modelo: " + getModelo() + 
				", N� km: " + getnKm() + ", Nombre Antig�o Propietario: " + nombreAntPro + "]";
	}

}
