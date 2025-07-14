
public class Main {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo("Bermudas", 20, 10, 15);
		
		Cuadrado cuadrado = new Cuadrado("Caudrado", 20);
		Rectangulo rectangulo = new Rectangulo("Rectangulo", 10, 20);
		Rombo rombo = new Rombo("Rombo", 10, 10, 6);
		Romboide romboide = new Romboide ("Romboide", 10, 5);
		Trapecio trapecio = new Trapecio ("Trapecio", 6, 10, 4, 5);
		
		Main.imprimirCalculos(t1);
		
		Main.imprimirCalculos(cuadrado);
		Main.imprimirCalculos(rectangulo);
		Main.imprimirCalculos(rombo);
		Main.imprimirCalculos(romboide);
		Main.imprimirCalculos(trapecio);
		

	}//main
	
    //interfas figuraGeometrica
	//metodo
	public static void imprimirCalculos(FigurasGeometricas figura) {
		System.out.println(figura);
		System.out.println("+-----------------------------------------------------------------------+");
		System.out.println("| El AREA DE [" + figura.getNombre() + "]");
		
		System.out.println("| es " + figura.calcularArea());
		System.out.println("| El perimetro de [" + figura.getNombre() + "]");
		
		System.out.println("| es " + figura.calcularPerimetro());
		System.out.println("+------------------------------------------------------------------------+");
		
	}
	
}//classMain
