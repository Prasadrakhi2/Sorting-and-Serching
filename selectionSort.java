import java.util.*;
public class selectionSort{

    //print function
    public static void print(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    //Selsection Sort
    public static void selectionSort(int a[]){
        for(int i=0; i<a.length-1; i++){
            int min = i;
            for(int j=i+1; j<a.length; j++){
                //finding the index of min
                if(a[min] > a[j]){
                    min = j;
                }
            }
            //placing
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = {4,6,3,8,5,1,2,7};
        selectionSort(a);
        print(a);
    }
}