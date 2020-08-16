import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int j=0;
        while(j ++ < t)
        {
            System.out.println("Case #"+j+":");
            String s[]= br.readLine().split(" ");
            String s1=s[0];
            String s2=s[1];
            int resi=s1.length()+s2.length();
            char arr[]= new char[resi];
            l=new ArrayList<>();
            generate(s1, s2, 0, 0, arr, 0);
            Collections.sort(l);
            for(String k:l)
            {
            System.out.println(k);
            }
        }
    }
    public static List<String> l;
    public static void generate(String s1, String s2, int i1, int i2, char arr[], int resi)
    {
        if(resi==arr.length)
        {
           l.add(new String(arr));
            return;
        }
        if(i2<s2.length())
        {
         arr[resi]=s2.charAt(i2);
        generate(s1, s2, i1, i2+1, arr, resi+1);  
        }
        if(i1<s1.length())
        {
        arr[resi]=s1.charAt(i1);
        generate(s1, s2, i1+1, i2, arr, resi+1);
        }
        
    }
}
