import algorea.Scanner;
/**
 *
 * @author thomas (lamford sur France-IOI)
 */
public class Main {
   static Scanner start = new Scanner(System.in);
   /**
     * 
     */
    public static void main(String[] args) {
      int longeur = start.nextInt();
      int aire = longeur * longeur;
      int masse = aire * 23;
      
      System.out.println(masse);
   }
    }
}
