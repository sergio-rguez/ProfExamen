package luispalomo.ExamenProf;

/**
 * Hello world!
 *
 */
public class App 
{

	private int notaExamen (int a, int b) {
		int result = 0;
		
		while (a>b) {
			a--;
		}
		
		if(a<=b) {
			result = b;
		}else {
			b = 0;
		}
		
		return result;
	}
}
