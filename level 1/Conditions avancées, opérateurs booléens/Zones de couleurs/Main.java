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
      int nbJetons = input.nextInt();

      for(int i = 0; i < nbJetons ; i++)
      {
         int x = input.nextInt();
         int y = input.nextInt();

         if (x < 0 || x > 90 || y < 0 || y > 70) {
            System.out.println("En dehors de la feuille");
         } else if (y > 60 && ((x > 15 && x < 45) || (x > 60 && x < 85))) {
            System.out.println("Dans une zone rouge");
         } else if (x > 10 && x < 85 && y > 10 && y < 55 && !(x > 25 && x < 50 && y > 20 && y < 45)) {
            System.out.println("Dans une zone bleue");
         } else {
            System.out.println("Dans une zone jaune");
         }
      }
   }
}