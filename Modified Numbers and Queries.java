class Solution

{

   

  public static int sumOfAll(int l, int r)

     {

         int sum;

         if(l==1)

          sum=1;

         else

          sum=0;

         int x;

         int temp;

         HashSet<Integer> set=new HashSet<Integer>();

         for( x=l;x<=r;x++)

         {

             set.clear();

             for(int i=2;i<=x;i++)

             {

              temp=x;

                 while(temp%i==0)

                 {

                  int check=prime(i);

                     set.add(check);

                     temp=temp/i;

                     

                 }

             }

            

             for(int e:set)

             {

                 sum=sum+e;

             }

         }

         return sum;

     }

 

 public static int prime(int n)

 {

 int i;

 int t = 0;

 for(i=2;i<n;i++)

 {

 if(n%i==0)

 {

 t=0;

 break;

 }

 }

 if(i==n)

 t=n;

 return t;

 }

 

}