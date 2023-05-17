
public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=50;
		int y=100;
		String país= "Francia";
		
		for(int i=0;i<=100;i++) {
			System.out.println("Estoy dentro del for, "+x);
			x++;
		}
		System.out.println(país);
		while(x>100) {
			System.out.println("Estoy dentro del while, "+x);
			x--;
		}
		System.out.println(país);
		if(x==y) {
			país="Italia";
		}
		if(x<y) {
			país="Grecia";
		}else {
			país="Alemania";
		}
		
		

	}

}
