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
      
      int nbPaires = input.nextInt();
      for (int loop = 1; loop <= nbPaires; loop = loop + 1)
      {
         int xMin1 = input.nextInt();
         int xMax1 = input.nextInt();
         int yMin1 = input.nextInt();
         int yMax1 = input.nextInt();
         int xMin2 = input.nextInt();
         int xMax2 = input.nextInt();
         int yMin2 = input.nextInt();
         int yMax2 = input.nextInt();
       
         if((xMax2 <= xMin1) || (xMax1 <= xMin2) || (yMax2 <= yMin1) || (yMax1 <= yMin2))
         {
            System.out.println("NON");
         }
         else
         {
            System.out.println("OUI");
         }
      }
   }
}