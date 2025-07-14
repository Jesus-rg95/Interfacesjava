
public class Trapecio implements FigurasGeometricas {
	
	private String nombre;
	private double bMenor;
	private double bMayor;
	private double altura;
	private double lado;
	
	public Trapecio(String nombre, double bMenor, double bMayor, double altura, double lado) {
		super();
		this.nombre = nombre;
		this.bMenor = bMenor;
		this.bMayor = bMayor;
		this.altura = altura;
		this.lado = lado;
	}//constructor
	
	public double calcularArea() {
		return getAltura() * (getbMayor() + (getbMenor()))/2;
	}//calcularArea
	
	public double calcularPerimetro() {
		return getbMayor() + getbMenor() + getLado() + getLado();
	}//calcularPerimetro
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getbMenor() {
		return bMenor;
	}
	public void setbMenor(double bMenor) {
		this.bMenor = bMenor;
	}
	public double getbMayor() {
		return bMayor;
	}
	public void setbMayor(double bMayor) {
		this.bMayor = bMayor;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Trapecio [nombre=" + nombre + ", bMenor=" + bMenor + ", bMayor=" + bMayor + ", altura=" + altura
				+ ", lado=" + lado + "]";
	}//toString
	

}//Trapecio
