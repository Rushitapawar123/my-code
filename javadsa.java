import java.util.ArrayList;
import java.util.Scanner;

public class javadsa
 {

    public static ArrayList<Integer> intersection(int arr[],int []arr2)
    {
        ArrayList<Integer>ans= new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr.length && i<arr2.length)
        {
            if(arr[i]<arr2[j]){
            i++;
            }
     
            else if(arr[i]>arr2[j])
            {
                j++;
            }
            else
            {
                ans.add(arr[i]);
                i++;
                j++;
            }
        }
        return ans;

    }
 public static void main(String[] args)
{
 
    int arr[]={1,2,3,4};
    int arr2[]={2,4,5,7};
    System.out.println( intersection(arr,arr2));

Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
double n= sc.nextDouble();
int  x=(int )n;
if(n-x==0)
    System.out.println("is sn integer");
else
    System.out.println("not an integer");


Scanner sc=new Scanner(System.in);
System.out.println("enter a cp");
int cp= sc.nextInt();

System.out.println("eneter a selling price");
int sp=sc.nextInt();

if(sp>cp)
{
    System.out.println("profit");
}
else
{
    System.out.println(" loss is");
}

Scanner sc= new Scanner(System.in);
System.out.println("enter a number");

int n=sc.nextInt();
if(n>99 && n<1000)
{
    System.out.println("$ digit number");

}
else{
    System.out.println( "not 4 digit number");
}
    
}
 }
int x=0;
boolean flag=true;
// int i;
for (int i = 2; i <= n-1; i++) 
 {
    if(n%i==0)
    {
        x=1;
       
        break;
    }
 }
 if(x==1)
  System.out.println("compo");
if(x==0)System.out.println("prim  number");

for (int i = 0; i<=n; i++) 
 {
   if(i%2==0)
    {
        System.out.println(i);
    } 
}

int i=0;
while (i<10) {
    System.out.println(i);
    i++;

 Scanner sc=new Scanner(System.in);
 System.out.println("enter number");
int n=sc.nextInt();

int count=0;
while (n >0) 
    {
    n/=10;
    count++;
}
System.out.println(count);

int sum=0;
while (n!=0)
 {
    sum+= n%10;
    n/=10;
    // sum++;
}
System.out.println(sum>0);//?sum:-sum);
int n=1283;
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int r=0;
while(n!=0)
{
    r*=10;
    r+=(n%10);
    n/=10;
}
System.out.println(r);

Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();

int fact=1;
for (int i = 1; i < n; i++)
     {
    fact *=i;
System.out.println(fact);
}
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a number");
 int a=sc.nextInt();

 System.out.println("enter a second number");
 int b=sc.nextInt();
 int pow=1;
 for (int i = 0; i < b; i++) 
{
pow*=a;
    
 }
//  System.out.println(a+"rised to the power"+b+"is"+pow);

int arr[][]= {{1,2,3,4},{1,3,4,4},{12,34,55,5}};//new int [3][4];

for (int i = 0; i < 3; i++) {
    for (int j = 0; j <4; j++) {
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
    
Scanner sc= new Scanner(System.in);
int [][] arr=new int [3][4];

for (int i = 0; i < arr.length; i++)
     {
    for (int j = 0; j < arr[0].length; j++)
 {
       arr[i][j]= sc.nextInt(); 
    }
    System.out.println();
}
int arr[][]= {{1,2,3,4},{1,3,4,4},{12,34,55,5}};

int sum=0;
for (int i = 0; i < arr.length; i++) 
    {
    for (int j = 0; j < arr[0].length; j++) 
        {
        
        sum+=arr[i][j];
    }
   
}
System.out.println(sum);

int arr[][]= {{1,2,3,4333},{1,3,433,4},{12,34,55,5}};

int maxsum=Integer.MIN_VALUE;
int row=-1;
for (int i = 0; i < arr.length; i++) 
{
    int sum=0;
    for (int j = 0; j < arr[0].length; j++) 
    {
      sum+=arr[i][j];  
    }
    if(sum>maxsum)
    {
maxsum=sum;
row=i;
    }
}
System.out.println(row+" "+maxsum);

int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,55,5}};


int min= Integer.MAX_VALUE;
for (int i = 0; i < arr.length; i++)
 {
  int maxsum=arr[i][0];
    for (int j = 0; j < arr.length; j++) 
    {
        if(arr[i][j]>maxsum)
        {
            maxsum=arr[i][j];
        for(int i=0;i<arr.length;i++)
    }
      
    }

    if(maxsum<min)
    {
        min=maxsum;
    }
}
System.out.println(min+" ");

for(int j=0;j<arr[0].length;j++)
{
    {
System.out.print(arr[i][j]+" ");
    }
}
System.out.println();

for (int i = 0; i < arr.length; i++) {
    for(int ele:arr[i])
    {
        System.out.println(ele+" ");
    }
}
  
int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,55,5}};


  for (int i = arr.length-1; i >=0; i--)
 {
    // if(i%2==0)
    {
    for (int j = arr.length-1; j >=0; j--) 
    {
     System.out.print(arr[i][j]+" ");  
    }
  }
  else
  {
    for(int j=arr.length-1;j>=0;j--)
    {
        System.out.print(arr[j][i]+" ");
    }
  }
  System.out.println();
}
for (int i = 0; i < arr.length; i++)
 {
    for (int j = 0; j < i; j++) 
    {
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
}
System.out.println(arr);

ArrayList<Integer>a=new ArrayList<>();
a.add(3);a.add(13);a.add(36);a.add(132);

ArrayList<Integer>b=new ArrayList<>();
b.add(1);b.add(22);b.add(23);

ArrayList<Integer>c=new ArrayList<>();
c.add(22);c.add(33);c.add(44);
ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
arr.add(a);arr.add(b);arr.add(c);

System.out.println(arr);

for (int i = 0; i < arr.size(); i++) 
{
    for(int j=0;j<arr.get(i).size();j++)
    {
        System.out.print(arr.get(i).get(j)+" ");
    }
    System.out.println();
    
}

arr.add(new ArrayList<>());
arr.get(arr.size()-1).add(10);arr .get(arr.size()-1).add(20);
for(ArrayList<Integer>list:arr)
{
    for(int ele:list)
    {
        System.out.print(ele+" ");
    }
    System.out.println();
}


 }
}

public static void main(String[] args) 
{
    int a[][]= {{1,2,3,4},{5,6,7,8}, {9,10,11,14}};

    System.out.println(a.length);
    System.out.println(a[0].length);
    System.out.println(a[1][2]);
   
    for(int []temp:a)
    {
        for(int val: temp)
        {
            System.out.print(val+" ");
        }
    }

    a[0]=new int [4];
    a[1]=new int [2];
    a[2]=new int [1];

    System.out.println(a.length);
    System.out.println(a[0].length);
    System.out.println(a[1].length);

   
    for(int c=0;c<a[0].length;c++)
    {
        if(c%2==0)
        {
            for(int r=0;r<a.length;r++)
            {
                System.out.print(a[r][c]+" ");
            }
        }
        else
        {
            for (int r = a.length-1; r >=0; r--)
             {
                System.out.print(a[r][c]+" ");
                
            }

        }
    }


 int a[][]= {{1,2,3,4},{5,6,7,8}, {9,10,11,14}};

 int  rows=a.length;
 int col=a[0].length;

 int [][] ans=new int [col][rows];

 for (int i = 0; i < rows; i++)
 {
    for (int j = 0; j < col; j++)
 {
        ans[j][i]=a[i][j];
        System.out.print(a[i][j]+" ");
    }
 }
    */
 

// String s= "rushita";
// StringBuilder sb=new StringBuilder(s);

// System.out.println(sb+"hello");
// System.out.println(sb.length());
// sb.append(" pawar");
// System.out.println(sb);
// sb.insert(2, 'c');
// System.out.println(sb);

String s= "RuShitaPawaR";
// StringBuilder sb= new StringBuilder(s);

// for (int i = 0; i < sb.length(); i++) 
// {
//     char ch= sb.charAt(i);

//     if(i%2==0)
//     {
//    ch=(char)(ch + 1);
//    sb.setCharAt(i, ch);
//     }
//     else
//     {
//    ch=(char)(ch - 1);
//    sb.setCharAt(i, ch);
//     }
    
// }
// System.out.println(sb.toString());

// for (int i = 0; i < s.length(); i++) {
    
//     for (int j = i+1; j < s.length(); j++) {
     
//         System.out.println(s.substring(i,j));
//     }
// }

int a=123;
int b=343;

int c=a;

//  a=b;
//  b=c;
// System.out.println(a);
System.out.println(b+" "+a);

// a=a+b;
// b=a-b;
// a=a-b;
System.out.println( a type());


}
 }