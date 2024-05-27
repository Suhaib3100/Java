public class looping
{
    public static void main(String [] args)
    {
        String a="atif";
        int b=4;
        // i=row; j=column;
       for(int i=0; i<=b;i++){
           for(int j=i;j<=b;j++){
               System.out.print("     ");

               }
           for( int j=0;j<=i;j++){
               System.out.print(a+ " ");
           }
           System.out.println();
       }
    }
}
