/*** implementazione del crivello di Eratostene ed altri algoritmi
 *   sui numeri primi
 *   
 * @author Marco Pedicini
 **/

import primes.quadratic.Sieve ;

public class lezione {
	
	public static void main(String[] args) {
		Sieve lista ;
		
		lista = new Sieve(args) ;
		
		lista.printmatrix();
		
		return ;
	}
	
}

