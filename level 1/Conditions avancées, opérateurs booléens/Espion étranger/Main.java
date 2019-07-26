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
      
      int dateDébut = input.nextInt();
      int dateFin = input.nextInt();
      int nbEntrees = input.nextInt();
      int nbPersonnes = 0;
      for (int loop = 1; loop <= nbEntrees; loop = loop + 1)
      {
         int date = input.nextInt();
         if( (dateDébut <= date) && (date <= dateFin) )
         {
            nbPersonnes = nbPersonnes + 1;
         }
      }
      System.out.println(nbPersonnes);
   }
}
