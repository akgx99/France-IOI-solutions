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
      int nb = input.nextInt();
      int temp = 0;
      int pos = 0;
      int neg = 0;
      
      for(int i = 1; i <= nb; i++){
         temp = input.nextInt();
         if(temp > 0)
            pos = pos + temp;
         else
            neg = neg + temp;
      }
      
      System.out.println(pos);
      System.out.println(neg*-1);
    }
}
