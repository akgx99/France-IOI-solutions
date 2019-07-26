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
      int nb = input.nextInt();
      int taille = input.nextInt();
      boolean sortie = false;

      for (int i = 0; i < taille; i++) {
         int liste = input.nextInt();
         if(nb == liste)
            sortie = true;
      }

      if (sortie) {
         System.out.println("Sorti de la ville");
      } else {
         System.out.println("Encore dans la ville");
      }
   }
}