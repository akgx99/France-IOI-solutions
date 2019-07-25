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
      int nbVillage = input.nextInt();
      int distance = 50;
      int temp = 0;
      int res = 0;
      
      for(int i = 1; i <= nbVillage; i++){
         temp = input.nextInt();
         if(nb >= temp - distance && nb <= temp + distance)
            res++;
      }
      
      System.out.println(res);
    }
}
