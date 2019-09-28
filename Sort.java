import java.util.Scanner;

class Sort {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=kb.nextInt();
        System.out.println("Enter "+n+" values in the array:");
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=kb.nextInt();
        }
        System.out.println("The sorted Array is as follows:");
        for(int i=0;i<=(arr.length-2);i++)
        {
            for(int j=i+1;j<=(arr.length-1);j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int x:arr)
        {
            System.out.println(x);
        }
    }
}
