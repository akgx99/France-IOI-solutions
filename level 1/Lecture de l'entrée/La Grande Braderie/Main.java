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
      int posD = input.nextInt();
      int larg = input.nextInt();
      int nbVend = input.nextInt();
      int temp = posD;
      
      System.out.println(temp);
      for(int i = 1; i <= nbVend; i++){
         temp = temp + larg;
         System.out.println(temp);
      }
    }
}
