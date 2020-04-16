
public class SegundaMano extends Km0 {
	//Atributos
	private String nombreAntPro;
	//Método constructor sin parámetros
	public SegundaMano() {
		super();
	}
	//Método constructor con parámetros
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
	//Método para mostrar la información del objeto
	@Override
	public String toString() {
		return "Coche Segunda Mano: [Matrícula: " + getMatricula() + ", Color: " + getColor() + ", Modelo: " + getModelo() + 
				", Nº km: " + getnKm() + ", Nombre Antigüo Propietario: " + nombreAntPro + "]";
	}

}
