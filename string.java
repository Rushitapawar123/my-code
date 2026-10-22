import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



public class string 
{
/* 


    public static void Q1()
{
    String  s= "rushita girhare";

    int count=0;

    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(ch=='a' || ch=='i'||ch=='e'||ch=='u')
        {
            count++;
        }
        System.out.println(count);
    }
}
public static boolean Q2()
{

    String s="malayalam";

    int i=0;
    int j=s.length()-1;

    while (i<=j)
 {
    if(s.charAt(i)!= s.charAt(j) )return false;
    i++;
    j--;        
 }
 return true;

}
 
    public static void main(String[] args) {
        
        char[] s={'a','b','c',};
        for(char ele:s)
        {
            System.out.println(ele);
        }
String x="my name is rushita and i am lernning";

System.out.println(x);

Scanner sc= new Scanner(System.in);
String s=sc.nextLine();
System.out.println(s);
String t=sc.next();
System.out.println(t);

Q1();
Q2();

String s= "rushita";

for(int j=0;j<=7;j++)
{
    for (int i = j+1; i < s.length(); i++) {
        
    
    System.out.println(s.substring(j,i+1));
    }
}
String s="rushita";
s ="pawar";
System.out.println(s);

StringBuilder s= new StringBuilder(10);

System.out.println(s.length()+" "+s.capacity());
s.append("girhare");
System.out.println(s.length()+" "+s.capacity());

s.setCharAt(1, 'o');
System.out.println(s);

String s="Deveshsvdfdrr";
StringBuilder sb=new StringBuilder(s);
sb.reverse();
System.out.println(sb);

int i=0,j=sb.length()-1;
while (i<=j)
 {
    int temp1=sb.charAt(i);
    char temp2= sb.charAt(j);
    sb.setCharAt(i,temp2);
    sb.setCharAt(j,temp1);
    i++;
    j--;
    
}
sb.deleteCharAt(1);
sb.insert(1, 'e');
System.out.println(sb);
int 
n=s.length();
int maxfrec=-1;
char ans=s.charAt(0);
for (int i = 0; i < n; i++) 
    {
     int freq=1;
     char ch=s.charAt(i);
     for(int j=0+1;j<n;j++)
     {
        if(s.charAt(j)==ch) freq++;
     }
     if(freq>maxfrec)
     {
        maxfrec=freq;
        ans=ch;
     }
     else if(freq==maxfrec && ch<ans)
     {
        ans=ch;
     }
}
System.out.println(ans);

public void display()
{
    System.out.println("-----------");
    node temp=this.head;

    while(temp!=null){
        System.out.println(temp.dat+" ");
        temp=temp.next;
    }
System.out.println();
System.out.println("---------");
}

public  void addFirst(int data)
{
    Node nn= new Node(data);
    nn.next=this.head;
    this.head=nn;
}
 public static void main(String[] args) {

    int c=20;
    ArrayList<Integer> list= new ArrayList<>();
    list.add(12);
    list.add(13);

    list.add(14);
    list.add(15);
System.out.println(list);

LinkedList l1= new LinkedList();
l1.addFirst(20);
l1.display();

l1.addFirst(30);
l1.display();

l1.addFirst(40);
l1.display();

l1.addFirst(50);
l1.display();

l1.addFirst(60);
l1.display();

l1.addFirst(70);
l1.display();

*/

// class Node
// {
//     int val;
//     Node next;

//     Node(int val)
//     {
//         this.val=val;
//     }
// }

// public class Displaylist
// {
// }
//     public static void Display(Node head)
//     {
//         Node temp=head;
//         while(temp !=null)
//         {
//             System.out.println(temp.val+" ");
//             temp=temp.next;
//         }
//     }

// public static void  pushAtBOttom(int data,Stack<Integer>s)
// {
//    if(s.isEmpty())
//    {
//     s.push(data);
//     return;

//    }

//    int top = s.pop();
//    pushAtBOttom(data, s);
//    s.push(top);

// }
// public static void  reverse(Stack<Integer>s)
// {
//     if(s.isEmpty())
//     {
//         int top=s.pop();
//         reverse(s);
//         pushAtBOttom(top, s);
//     }
// }
// public static void main(String[] args)
// {
    // Node a= new Node(10);
    // Node b= new Node(200);
    // Node c= new Node(30);
    // Node d= new Node(40);
    // Node e= new Node(50);
    // a.next=b; b.next=c;
    // c.next=d; d.next=e;
    // // e.next=f;
    // Displaylist.Display(a);
//  Stack<Integer>s=new Stack();
//  s.push(1);
//  s.push(2);
//  s.push(3);

// //  pushAtBOttom(4,s);
// reverse(s);
//  while(!s.isEmpty())
//  {
//     System.out.println(s.peek());
//     s.pop();
//  }

// Queue <Integer>q=new ArrayDeque<>();
    // q.add(1);
    // q.add(2);
    // q.add(3);
    // q.add(4);

    // while (!q.isEmpty()) {
    //     System.out.println(q.peek());
    // 
// public static int f(int n)
// {
//     if(n==1)
//         return 1;
//     return n*f(n-1);
// }

// public static int f(int a ,int b)
// {
//     if(b==0)return 1;
//     {
//         return a*f(a, b-1);
//     }
// }
// public static void f(int n)

// {
//     if(n==0)
//     {
//         return ;
//     }
//      f(n-2);
//     System.out.println(n);
   
// }
// public static int  f(int n)
// {
//     if(n==0||n==1)return n;
//     return f(n-1)+f(n-2);  
// }

// public static void f(int arr[],int idx)
// {
// if(idx>=arr.length)return;

// System.out.println(arr[idx]);
// f(arr, idx);



// public static int  f(int [] arr,int idx)
// {
//     if(idx==arr.length-1) return  arr[idx];
//     return Math.max(arr[idx],f(arr, idx+1));

//     System.out.println(arr[idx]);
// f(arr,++idx);
// }

// public static int f(int[] arr,int idx,int x)
// {
//     if(idx==arr.length)return -1;
//     return(arr[idx]==x) ?idx:f(arr, idx=1, x);
// }

// static class Node
// {
//     int data;
//     Node leftNode;
//     NOde rightNOde;

//     public Node(int data)
//     {
//         this.data=data;
//         leftNode=null;
//         rightNOde=null;
//     }

// }

// public static void printpatternforgivenrow(int n)
// {
// for(int i=0; i<n;i++)
// {
// System.out.print("*");
// }
// System.out.println();
// }

// public static void g(int n)
// {
    

// }
// public static void  f(int n, int totalstarse)
// {
//   if(n<=0) return ;
// // printpatternforgivenrow(totalstarse);
// g(totalstarse);
//  f(n-1, totalstarse);
// }

// public static void f(int row, int col,int n)
// {
    // if(row>n) return;

    // if(col>n-row +1)
    // {
    //     System.out.println();

    //     f(row+1,1,n);
    //     return;
    // }
    // System.out.print("*");
    // f(row, col+1, n);
// }

// public static void f(String str,int idx,String output)
// {
// if(idx>=str.length())
// {
//     System.out.println(output);
//     return;
// }

// if(str.charAt(idx)!='x')
// {
   
//     f(str, idx+1,output+str.charAt(idx));

// }
// else
// {
//     f(str, idx+1, output);
// }
// }

// public static void f(String str,int idx,String output)
// {
//     if(idx==str.length())
//     {
//         System.out.println("["+output+"]");
//         return;
//     }
//     f(str,idx+1,output+str.charAt(idx));
//     f(str,idx+1,output);
// }

public static int count=0;

public static void f(int i,int j,int m,int n,String output)
{
if(i==m-1 && j==n-1)
{
    System.out.println(output);
    count++;
    return;
}
if(i>=m || j>=n) return ;
f(i, j+1, m, n, output+"R");
f(i+1, j, m, n, output+"D");

}
public static void main(String[] args)
{
    //   System.out.println(f(4)); 
    // System.out.println(f(2,3));
        // f(10);
    // System.out.println(f(6));

    // int arr[]={31,22,12,4,2,1,6};
    // int x=90;
    // System.out.println(f(arr,0));
    
    // int arr[]={31,22,12,4,2,1,6};
    // int x=90;
    // System.out.println(f(arr,0,x));

    // NOde rootNode=new Node(10);
    // NOde rootleft=new NOde(20);
    // Node rootRighte=new Node(30);

    // rootNode.leftNode=rootleft;
    // rootNode.rightNOde=rootNode;
    // f(5,5);
//    f(1,1,5);
   
// f("absxxdexcsde", 0, " ");

// f("abc", 0, "");

// int m=3,n=3;
// // count=0;
// f(0,0,m,n,"");
// System.out.println(count);

int a=10;
int b=20;


}



}
