package Controller;

public class ConsoleHelper {
    private String blank = " ";

    public static void clearScreen() {
        for (int i = 0; i < 80; i++)
          System.out.println("");
        
      }
    
    public static void blankPrink(int num) {
    	for (int i = 1; i<= num; i++) {
    		System.out.print(" ");
    	}
    }
    
    
    
}