public class TwodArraay
{
public static void Q1(int [][]arr)
{
    for(int i=0;i<arr.length;i++)
    {
        for (int j = 0; j < i; j++) 
        {
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
            
        }

    }
    System.out.println(arr);

}
public static void Q2()
{
    
}
    public static void main(String[] args)
 {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12,},{13,14,15,16}};
        Q1(arr);

    Q2();

    }
}

