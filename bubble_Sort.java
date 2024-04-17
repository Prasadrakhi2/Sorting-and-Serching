import java.util.*;
public class bubble_Sort {

    //print function
    public static void print(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    // Optamize bubble Sort
    public static void optmzbubbleSort(int a[]){
        for(int i=0; i<a.length; i++){
            boolean swaped = false;
            for(int j=0; j<a.length-1-i; j++){
                //compair
                if(a[j]>a[j+1]){
                    //swap
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    swaped = true;
                }
            }
            if(swaped == false){
                break;
            }
        }
    }

    //bubblie Sort
    public static void bubbleSort(int a[]){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length-1-i; j++){
                //compair
                if(a[j]>a[j+1]){
                    //swap
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3,4,5};
        //bubbleSort(a);
        optmzbubbleSort(a);
        print(a);
    }
    
}
