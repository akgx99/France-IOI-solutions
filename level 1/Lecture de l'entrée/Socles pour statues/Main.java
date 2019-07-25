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
      int sol = input.nextInt();
      int sup = input.nextInt();
      int res = 0;
         
      for(int i = sup; i <= sol; i++){
          res = res + i*i;
      }
      
      System.out.println(res);
    }
}
