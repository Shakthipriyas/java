import java.util.Scanner;
class name
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        String empty="";
        int len=name.length();
        for(int i=len-1;i>=0;i--)
        {
            empty=empty+name.charAt(i);
        }
        System.out.print(empty);
        
    }
}
