import java.util.Arrays;
import java.util.Scanner;
public class hello
{

    /* 
    public static boolean twosum(int arr[], int target)
    {
        int n=arr.length;
     for (int i = 0; i <n; i++)
         {
        for (int j = i+1; j <n; j++) 
        {
            if(arr[i] +arr[j] ==target)
                return true;
        }
        return false;
     }
     public static void reverse(int arr [],int i,int j)
        {
            while(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
      
return false;
    } 
public static int q1(int arr[])
{
    
     int a=0;
    int n=arr.length;
    int max= Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) 
    {
        if(arr[i]<max) max=arr[i];
        // a=a+arr[i];
        System.out.println(max);
    }
    return  max;

      int min =Integer.MAX_VALUE;
	  for (int i=0;i<arr.length;i++)
	  {
		  if(arr[i]<min ) min =arr[i];
	  }
	  System.out.println(min);

	  return min;
}
*/
// public static void main(String[] args)
 
   
      /*   int arr[]={4,34,35,767,};
        q1(arr);
        int result=q1(arr);
        System.out.println(result);
     twosum(arr,38) ;
    int d=2;
    int n=arr.length;
    d =d% n;
    reverse(arr,0,d-1);
    reverse(arr,d,n-1);
    reverse(arr,0,n-1);
for (int i : arr) {
     System.out.println(i+"");
}
        
  */ 

// public class hello
// {
//     public static int Q1(int a)
//     {
     

//      return 0;





//      }
// public static void main(String[] args)
// {


//    Scanner scanner =new Scanner(System.in);
//    System.out.println("enter a saIlry");
//    double sailry= scanner.nextInt();

//    System.out.println("ENTER YEAR OF SERVICE");
//    int YearOfservice= scanner.nextInt();
//    double Bonusprcentage;

//    if(sailry>50000)
//     if(YearOfservice>5)
//     {
//      System.out.println("the bonus is 10");
//     }
//     else
//    {
//        System.out.println("7/ eligibal");
//     }
//    else
//    {
//     if(YearOfservice>5)
//     {
//      System.out.println("bonus is 5");
//     }
//     else
//     {
//      System.out.println("bonus is 3");
//     }
//    }
/* 
Scanner scanner =new Scanner(System.in);

System.out.println("ageOfathelete");
int athleteage = scanner.nextInt();


System.out.println("experience");
int experience=scanner.nextInt();

if(athleteage>30)

    if(experience>10)
    {
    System.out.println("veteren");
    }
    else
    {
 System.out.println("Experience11");
    }
else
    {
    if(experience<5)
        {
System.out.println("experienced");
        }
      else
  {
System.out.println("novice");
   }
}


Scanner scanner =new Scanner(System.in);

System.out.println("enter number");
int limit = scanner.nextInt();

System.out.println(limit+" tables");
for (int i = 0; i <=10; i++)
     {
    if(5 %i==0)
    {
        System.out.println(limit+i+limit*i);
    }
    
}
System.out.println();
}
 
} 
*/



    import java.util.*;



    public static void rotateSell(int [][]arr,int sn,int step)
    {
        int oneD[] = Fillselltonedarray(arr,sn);

        onerotate(oneD,step);

        fillsellfromonedarray(arr,oneD,sn);

        Display(arr);
    }

    public static void onerotate(int[] oneD,int step)
    {
        step = step % oneD.length;

        if(step < 0)
        {
            step = step + oneD.length;
        }

        int s = 0;
        int e = oneD.length - 1;
        int p = e - step;

        rotate(oneD, s , p);
        rotate(oneD, p+1 , e);
        rotate(oneD, s , e);
    }

    public static void rotate(int []oneD,int li,int ri)
    {
        while(li < ri)
        {
            int temp = oneD[li];
            oneD[li] = oneD[ri];
            oneD[ri] = temp;
            li++;
            ri--;
        }
    }

    public static void fillsellfromonedarray(int arr[][],int []oneD,int sn)
    {
        int minr=sn-1;
        int minc=sn-1;
        int maxr=arr.length-sn;
        int maxc=arr[0].length-sn;

        int index=0;

        for(int i=minr,j=minc;j<maxc;j++)
            arr[i][j]=oneD[index++];

        minr++;

        for(int i=minr,j=maxc;i<maxr;i++)
            arr[i][j]=oneD[index++];

        maxc--;

        for(int i=maxr,j=maxc;j>minc;j--)
            arr[i][j]=oneD[index++];

        maxr--;

        for(int i=maxr,j=minc;i>minr;i--)
            arr[i][j]=oneD[index++];
    }

    public static int []Fillselltonedarray(int[][]arr,int sn )
    {
        int minr=sn-1;
        int minc=sn-1;
        int maxr=arr.length-sn;
        int maxc=arr[0].length-sn;

        int size=2*(maxr-minr+maxc-minc);
        int oneD[]=new int [size];

        int index=0;

        for(int i=minr,j=minc;j<maxc;j++)
            oneD[index++]=arr[i][j];

        minr++;

        for(int i=minr,j=maxc;i<maxr;i++)
            oneD[index++]=arr[i][j];

        maxc--;

        for(int i=maxr,j=maxc;j>minc;j--)
            oneD[index++]=arr[i][j];

        maxr--;

        for(int i=maxr,j=minc;i>minr;i--)
            oneD[index++]=arr[i][j];

        return oneD;
    }

    public static void Display(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
        rotateSell(arr,1,2);
    }
}