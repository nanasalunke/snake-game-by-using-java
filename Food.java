import java.util.*;
import java.io.*;
class Food
{
    public static void main(String args[])throws IOException
    {
        ArrayList ar=new ArrayList();
        System.out.println("how many interger you want to enter :\n");
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Integer :");
            int a=Integer.parseInt(br.readLine());
            if(!ar.contains(a))
            {
                ar.add(a);

            }
        }
        System.out.println("unsorted Integer:" +ar);
        Collections.sort(ar);
        System.out.println("sorted Integer:" +ar);
        }
}