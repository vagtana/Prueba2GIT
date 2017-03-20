package principal;
/**
 * Esta clase suma, resta, multiplica y divide
 * @author vero
 * @version 1.0 10/02/2017
 */

public class Calculadora {
/**
 * 
 * @param x primer sumando
 * @param y segundo sumando
 * @return x+y
 */
	public static float suma(float x, float y){
		return (x + y);

	}
/**
 * 
 * @param x
 * @param y
 * @return
 */
	public static float resta(float x, float y){
		return (x - y);

	}
	
/**
 * 
 * @param x
 * @param y
 * @return
 */
	
	public static float multiplicar(float x, float y){
		return (x * y);

	}
/**
 * Divide x entre y
 * @param x dividendo
 * @param y divisor
 * @return cociente
 */
	public static float dividir(float x, float y){
		return (x / y);

	}
	
}