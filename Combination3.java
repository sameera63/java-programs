import java.util.*;
class Combination3
{
 static void combination(int []a,int index,int k,int target,String p)
 {
 if(target==0&&k==0)
 {
  System.out.println(p);
  return;
 }
 if(target<0)
   return;
for(int i=index;i<9;i++)
{
 combination(a,index+1,k-1,target-a[i],p+a[i]+",");
  }
 }
  public static void main(String args[])
  {
  int []a={2,4,8,7,6,1};
  Arrays.sort(a);
  combination(a,0,2,9," ");
  }
  }
  