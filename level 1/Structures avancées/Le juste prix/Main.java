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
      int nbMarchands = input.nextInt();
      
      int infini = 1000 * 1000;
      int minPrix = infini, posMinPrix = -1;
      for (int pos = 1; pos <= nbMarchands; pos++)
      {
         int prix = input.nextInt();
         if (prix <= minPrix)
         {
            minPrix = prix;
            posMinPrix = pos;
         }
      }
      System.out.println(posMinPrix);
    }
}
