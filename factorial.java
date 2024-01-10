import java.util.*;
import java.io.*;
class factorial
{
public static void main(String[] arg)
{
int n,i,fact;
fact=1;
Scanner number= new Scanner(System.in);
n=number.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("factorial = "+fact);
}
}