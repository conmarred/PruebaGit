package ejercicio1;

public class Suma {
	
	

	public Integer suma(Integer num1, Integer num2) {
		Integer sumaTotal = num1+num2;
		
		return sumaTotal;
	}
	
	
	public Integer sumaAcumulada(Integer a) {
		Integer acum = 0;
		
		return acum+=a;
 	}
	
	public static void main(String[] args) {
		Suma s = new Suma();
		
		Integer res = s.suma(3, 6);
		Integer res2= s.sumaAcumulada(2);
		
		//Test oara probar los metodos
		System.out.println("Suma de los numeros 3 y 6 es: "  + res);
		System.out.println("La suma acumulada es: " + res2);

	}
	
	//Estoy a�adiendo un comentario para realizar un cambio y poder hacer un commit en la ramaA

}
