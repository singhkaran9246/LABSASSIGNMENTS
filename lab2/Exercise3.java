import java.util.Arrays;
import java.util.Scanner;
class Exercise3
{
public static void main(String[]args)
{
int []arr=new int[6];
int[]arr1=Exercise3.getSorted(arr);
System.out.println("the reverse array");
for(int i=0;i<arr1.length;i++)
{
System.out.println(arr1[i]);
}

System.out.println("the sorted arrray is");
Arrays.sort(arr1);
System.out.println(Arrays.toString(arr1));

}

public static int[] getSorted(int[]arr)
{
int j=0;
Scanner sc=new Scanner(System.in);
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
int []rev=new int[arr.length];
for(int i=arr.length-1;i>=0;i--)
{
rev[j]=arr[i];
j++;
}
return rev;
}
}