
public abstract class Producto {
	
	//Atributos
	private String matricula;
	private String color;
	private String modelo;
	
	//Método constructor sin parámetros
	public Producto() {
		
	}
	//Método constructor con parámetros
	public Producto(String matricula, String color, String modelo) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.modelo = modelo;
	}
	
	//Getter
	public String getMatricula() {
		return matricula;
	}
	public String getColor() {
		return color;
	}
	public String getModelo() {
		return modelo;
	}
	//Setter
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
