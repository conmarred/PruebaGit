package ejercicio1;

public class Resta {

	public Integer resta(Integer num1, Integer num2) {
		Integer sumaTotal = num1-num2;
		
		return sumaTotal;
	}
	
	
	public Integer restaAcumulada(Integer a) {
		Integer acum = 0;
		
		return acum-=a;
 	}
	
	public static void main(String[] args) {
		Resta s = new Resta();
		
		Integer res = s.resta(10, 6);
		Integer res2= s.restaAcumulada(2);
		
		System.out.println("Resta de los numeros 10 y 6 es: "  + res);
		System.out.println("La resta acumulada es: " + res2);

	}

}
