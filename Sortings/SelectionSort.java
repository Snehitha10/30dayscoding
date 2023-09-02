import java.util.Scanner;
class SelectionSort
{
	static int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int min_idx = i;
        for(int j =i;j<arr.length;j++){
            if(arr[j]<arr[min_idx]){
                min_idx=j;
            }
            
        }
        return min_idx;
	}
	
	static void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i =0;i<n;i++){
	        int minIndex = select(arr,i);
	        int temp = arr[minIndex];
	        arr[minIndex]= arr[i];
	        arr[i]=temp;
	    }
	    
	}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        selectionSort(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
