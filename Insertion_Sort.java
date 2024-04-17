import java.util.*;
public class Insertion_Sort{

    //print function
    public static void print(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    //insertion sort
    public static void selectionSort(int a[]){
        for(int i=1; i<a.length; i++){
            int current = a[i];
            int prev = i-1;

            //shifting
            while(prev >=0 && a[prev] > current){
                a[prev+1] = a[prev];
                prev--;
            }

            //placing in the corect position
            a[prev+1] = current;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = {5,9,3,4,7,6,2,1,8,5,6};
        selectionSort(a);
        print(a);
    }
}