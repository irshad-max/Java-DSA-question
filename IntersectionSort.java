import java.util.*;
class IntersectionSort{
    public static void main(String[] args){
    ArrayList<Integer>intersection=new ArrayList<>();
    int arr1[]={1,2,3,4,5};
    int arr2[]={2,3,5,6};
    int n=arr1.length;
    int m=arr2.length;
    int i=0;
    int j=0;
    while(i<n && j<m){
        if(arr1[i]<arr2[j]){
            i++;
        }
        else if(arr1[i]>arr2[j]){
            j++;
        }
        else if(arr1[i]==arr2[j]){
           intersection.add(arr1[i]);
           i++;
           j++;
        }
    }
    System.out.print(intersection);
    }
}