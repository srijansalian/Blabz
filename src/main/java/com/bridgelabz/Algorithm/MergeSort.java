package com.bridgelabz.Algorithm;

import com.bridgelabz.util.util;

public class MergeSort {
	static void merge(String arr[], int l, int m, int r) 
    { 
        int n1 = m - l + 1; 
        int n2 = r - m;     
        String L[] = new String [n1]; 
        String R[] = new String [n2]; 
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
        int i = 0, j = 0; 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i].compareTo(R[j])<0) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
   static  void sort(String arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        }util.printArraystring(arr);
    } 
public static void main(String[] args) {
	String a[]=util.inputString();
	sort(a,0,a.length);
	
	
}
}
