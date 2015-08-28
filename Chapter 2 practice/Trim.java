public class Trim
{
    public static void main(String[] args)
    {
      String sentence1 = "      abc   ";
      String sentence2 = "   def";
      String sentence3 = "ghi         ";
      
      String nsentence1 = sentence1.trim();
      String nsentence2 = sentence2.trim();
      String nsentence3 = sentence3.trim();
      
      
      String connor = nsentence1+nsentence2+nsentence3;
      
      System.out.println(connor);
      

      
    }
}
