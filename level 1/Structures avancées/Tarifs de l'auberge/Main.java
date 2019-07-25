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
      int age = input.nextInt();
      int poids = input.nextInt();
      int prix = 0;
      
      if(age >= 10 && age != 60){
         prix = 30;
         if(poids >= 20)
            prix = 40;
      }
      else{
         if(age < 10)
            prix = 5;
      }
      System.out.println(prix);
    }
}
