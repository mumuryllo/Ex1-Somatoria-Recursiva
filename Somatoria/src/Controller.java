
public class Controller {
	public int soma(int array[], int size) {
		int result = 0;
		if (size == 0) {
			return result;
		}else {
			int ultima = size - 1;
			result = array[ultima]; 
			size = size - 1;
		return result + soma(array , size);	
		}
			
		}

}
