package java_regular.data.type.arrays.operation.invert;

public class ArrayInvertor {
    public static void invert(int[] arr) {
        if (arr.length > 0) {
            for(int k=arr.length/2; k>=0; k--) {
                if(k == (arr.length-k-1)) 
                    continue;                
                else {
                    if(k < 0) break;

                    int temp = arr[k];
                    arr[k] = arr[arr.length-k-1];
                    arr[arr.length-k-1] = temp;

                    if(k == (arr.length-k)) 
                        k--;
                }
            }
        }
    }
}
