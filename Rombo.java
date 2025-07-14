
public class Rombo implements FigurasGeometricas{
	
	private String nombre;
	private double lado;
	private double dMenor;
	private double dMayor;
	
	public Rombo(String nombre, double lado, double dMayor, double dMenor) {
		super();
		this.nombre = nombre;
		this.lado = lado;
		this.dMenor = dMenor;
		this.dMayor = dMayor;
	}

	
	public double calcularArea() {
		return (getdMayor() * getdMenor()) /2;
	}//Area
	
	public double calcularPerimetro() {
		return 4*(getLado());
	}//perimetro


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


	public double getdMenor() {
		return dMenor;
	}


	public void setdMenor(double dMenor) {
		this.dMenor = dMenor;
	}


	public double getdMayor() {
		return dMayor;
	}


	public void setdMayor(double dMayor) {
		this.dMayor = dMayor;
	}


	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", lado=" + lado + ", dMenor=" + dMenor + ", dMayor=" + dMayor + "]";
	}
	
	

}//class Rombo
