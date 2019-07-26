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
      
      int xMin = input.nextInt();
      int xMax = input.nextInt();
      int yMin = input.nextInt();
      int yMax = input.nextInt();
      int nbMaisons = input.nextInt();
      int nbAFouiller = 0;
      
      for (int loop = 1; loop <= nbMaisons; loop = loop + 1)
      {
         int x = input.nextInt();
         int y = input.nextInt();
         if( (xMin <= x) && (x <= xMax) && (yMin <= y) && (y <= yMax))
         {
            nbAFouiller = nbAFouiller + 1;
         }
      }
      System.out.println(nbAFouiller);
   }
}
