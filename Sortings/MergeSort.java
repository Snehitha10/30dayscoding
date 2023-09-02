import java.util.Scanner;
class MergeSort
{
    static void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int n1,n2;
         n1=m-l+1;
         n2=r-m;
         int[] L=new int[n1];
         int[] R=new int[n2];
         for(int i=0;i<n1;i++){
             L[i]=arr[l+i];
         }
         for(int j=0;j<n2;j++){
             R[j]=arr[m+1+j];
         }
         int i=0,j=0,k=l;
         while(i<n1 && j<n2){
             if(L[i]<=R[j]){
                arr[k++]=L[i++];
               
             }
             else{
                 arr[k++]=R[j++];
                
             }
             
             
         }
         while(i<n1){
             arr[k++]=L[i++];
             
             
         }
         while(j<n2){
             arr[k++]=R[j++];
             
         }
    }
    static void mergeSort(int arr[], int l, int r)
    {
        //code here
        
        if(l==r)
            return;
        int mid;
        mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
            
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        for(int i=0;i<n;i++){
          System.out.print(arr[i]+" ");
        } 
    }
}
