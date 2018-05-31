/*
 * Este es el ejercicio de ejemplo
 * 
 * @author ALFREDO
 */

public class Ejemplo {
	private int aux; // esta variable guarda un valor entero
	
	public Ejemplo(){
		aux=0; // Variable comun
	}
	/*
	 * Este metodo suma a + b
	 * 
	 * @param a entero introducido por el usuario
	 * @param b entero introducido por el usuario
	 */
	public int suma(int a, int b){
		aux=a+b;
		return aux;
	}
	/*
	 * Este metodo resta a - b
	 * 
	 * @param a entero introducido por el usuario
	 * @param b entero introducido por el usuario
	 */
	public int resta(int a, int b){
		aux=a-b;
		return aux;
	}
	/*
	 * Este metodo suma a + aux
	 * 
	 * @param a entero introducido por el usuario
	 */
	public int añadir(int a){
		aux+=a;
		return aux;
	}
	/*
	 * Este metodo resta aux - a
	 * 
	 * @param a entero introducido por el usuario
	 */
	
	public int reducir(int a){
		aux-=a;
		return aux;
	}
	/*
	 * Este metodo muestra el contenido de aux
	 */
	
	public int aux(){
		return aux;
	}
	/*
	 * Este metodo espera 2 segundos
	 */
	public void espera(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
