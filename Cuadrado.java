

public class Cuadrado implements FigurasGeometricas {
	private String nombre;
	private double lado;
	
	public Cuadrado(String nombre, double lado) {
		super();
		this.nombre = nombre;
		this.lado = lado;
	}//constructor
	
	public double calcularArea() {
		return (getLado() * getLado());
	}
	
	public double calcularPerimetro() {
		return 4*(getLado());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
	}
	
	

}//class
