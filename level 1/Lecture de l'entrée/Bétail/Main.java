import algorea.Scanner;
/**
 *
 * @author thomas (lamford sur France-IOI)
 */
public class Main {
   static Scanner input = new Scanner(System.in);
   /**
     * 
     */
    public static void main(String[] args) {
      int res = 0;
      
      for(int i = 1; i <= 20; i++){
         res = res + input.nextInt();
      }

      System.out.println(res);
    }
}
