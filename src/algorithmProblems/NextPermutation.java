package algorithmProblems;

import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] a) {
        int ind =-1,n=a.length;
        for(int i = n-2;i>=0;i--){
            if(a[i]<a[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            int j = a.length-1;
            for(int i=0;i<a.length/2;i++){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                j--;
            }
        }
        else{
            for(int i=n-1;i>=ind;i--){
                if(a[i]>a[ind]){
                    int t= a[i];
                    a[i]=a[ind];
                    a[ind]=t;
                    break;
                }
            }
            Arrays.sort(a,ind+1,n);
        }
    }
}
