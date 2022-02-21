import java.util.Arrays;
class Exercise1
{
public static void main(String[]args)
{
int arr[]={5,7,2,9,1,4,7};
int result=Exercise1.getSecondSmallest(arr);
System.out.println("the second smallest number in array is"+result);

}
static int getSecondSmallest(int[] arr)
{


Arrays.sort(arr);
return arr[1];

}
}