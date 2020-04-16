
public class Punto {
	
	//Atributos
	private double x, y;
	//Constructores
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	//Suma a X e Y los dos valores recibidos
	public void desplazarXY(double x, double y) {
		this.x += x;
		this.y += y;
				
	}
	//Suma a X el valor recibido
	public void desplazarX(double x) {
		this.x += x;
		
	}
	//Suma a Y el valor recibido
	public void desplazarY(double y) {
		this.y += y;
		
	}
	//Getter y Setter
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	//Devuelve un String con la cadena que queremos que se muestre
	@Override
	public String toString() {
		return "Posición [x=" + x + ", y=" + y + "]";
	}
	//Devuelve true si dos puntos están en las mismas coordenadas
	public boolean sonIguales(Punto p) {
		return x == p.getX() && y == p.getY();
	}
	//Devuelve un nuevo punto con las mismas coordenadas que el original
	public Punto copia() {
		return new Punto(this.x, this.y);
	}
}
