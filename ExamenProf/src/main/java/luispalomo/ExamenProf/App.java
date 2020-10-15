package luispalomo.ExamenProf;

/**
 * Hello world!
 *
 */
public class App 
{

	private int notaExamen (int a, int b) {
		int result = 0;
		
		// nodo 1
		while (a>b) {
			a--;
		}
		
		// nodo 2
		if(a<=b) {
			// nodo 3
			result = b;
		}else {
			// nodo 4
			b = 0;
		}
		
		return result;
	}
}
