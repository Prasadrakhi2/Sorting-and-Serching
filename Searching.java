import java.util.*;
public class Searching{

    //Linear Search
    public static int linearSearch(int a[] , int key){
        for(int i=0; i<=a.length-1; i++){
            if(a[i] == key){
                return i;
            }
        }
        return -1;
    }

    //Binary Search
    public static int binarySearch(int a[], int key, int si, int ei){

        while(si<=ei){
            int mid = (si+ei)/2;
            if(key == a[mid]){
                return mid;
            }
            else if(key < a[mid]){
                ei = mid-1;
            }
            else{
                si = mid+1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = {5,8,3,9,7,1,4,2,6};
        int key = 7;
        //System.out.println(linearSearch(a,key));
        System.out.println(binarySearch(a, key, 0,a.length-1));
    }
}