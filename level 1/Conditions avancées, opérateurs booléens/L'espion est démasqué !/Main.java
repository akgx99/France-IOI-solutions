import algorea.Scanner;
/**
 *
 * @author thomas (lamford sur France-IOI)
 */
class Main
{
   public static void main(String[] args)
   {
     Scanner input = new Scanner(System.in);
     int nbPers = input.nextInt();

      for (int i = 0; i < nbPers; i++) {
          int count = 0;
          int taille = input.nextInt();
          int age = input.nextInt();
          int poids = input.nextInt();
          int cheval = input.nextInt();
          int brun = input.nextInt();
        
          if (taille >= 178 && taille <= 182) {
              count++;
          }

          if(age >= 34){
              count++;
          }

          if (poids < 70) {
              count++;
          }

          if(cheval == 0){
              count++;
          }

          if (brun == 1) {
             count++; 
          }

          if (count == 5)
            System.out.println("Très probable");
          else if(count >= 3)
            System.out.println("Probable");
          else if(count == 0)
            System.out.println("Impossible");
          else
            System.out.println("Peu probable");
      } 
   }
}