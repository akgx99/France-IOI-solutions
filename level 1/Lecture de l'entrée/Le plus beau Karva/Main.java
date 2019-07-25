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
      
      for(int i = 1; i <= nb; i++){
         int poids = input.nextInt();
         int age = input.nextInt();
         int longC = input.nextInt();
         int hauteur = input.nextInt();
         
         int note = (longC * hauteur) + poids;
         
         System.out.println(note);
      }
    }
}
