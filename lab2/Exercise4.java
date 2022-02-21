class Exercise4
{
public static void main(String[]args)
{
int []arr={4,4,2,7,1,9,};
int []arr1=Exercise4.modifyArray(arr);
for(int i=0;i<arr1.length;i++)
{
System.out.println(arr1[i]);
}
//remove dublicate elements
int []dub=new int[arr1.length];
int k=0;
for(int i=0;i<arr1.length-1;i++)
{
if(arr1[i]!=arr[i+1])
{
dub[k]=arr1[i];
k++;
}
}
//storing removed elements
System.out.println("remove dublicte array");
for(int i=0;i<dub.length;i++)
{
System.out.println(dub[i]);
}




int []rev=new int[dub.length];

int j=0;
for(int i=arr1.length-1;i>=0;i--)
{

rev[j]=dub[i];
j++;
}
System.out.println("in ascending order");
for(int i=0;i<arr1.length;i++)
{
System.out.println(rev[i]);
}
}
 public static int[]  modifyArray(int []arr)
{
int temp;
System.out.println("sort array");
for(int i=0;i<arr.length;i++)
{
for(int j=i;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}

//int [] dub=new int[arr.length];
//int j=0;
//for(int i=0;i<arr.length-1;i++)
//{
//if(arr[i]!=arr[i+1]);
//{
//dub[j]=arr[i];
//j++;
//}
//}
//for(int i=0;i<dub.length-1;i++)
//{
//System.out.println(dub[i]);
//}
return arr;
}
}








