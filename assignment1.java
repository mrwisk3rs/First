
public class assignment1 {

	public static void main(String[] args) {
		
		System.out.println("1)");
		String item = "";
		
		for(int i = 0; i < 3; i++) {
			item += "*";
			System.out.println(item);
		}
		
		System.out.println("...............");
		System.out.println("2)");
		System.out.println("...............");
		
		for(int i = 3; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("3)");
		
		int rows = 4;
		for(int i = 1; i <= rows; i++) {
			for(int j = i; j <= rows; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j < i*2; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println("...............");
		System.out.println("4)");
		System.out.println("...............");
		for(int i = rows; i > 0; i--) {
			for(int j = i; j <= rows ; j++) {
				System.out.print(" ");
			}			
			for(int j = 1; j < i*2; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
