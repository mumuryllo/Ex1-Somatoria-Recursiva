
public class View {

	public static void main(String[] args) {
        Controller control = new Controller();
        
        int [] array = {1,2,3,4,5,6,7,8};
        int size = array.length;
        int somavetor = control.soma(array, size);
        System.out.println(somavetor);
	}

}
