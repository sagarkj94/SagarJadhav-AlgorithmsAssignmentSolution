package com.sortingassignment.model;

public class Binarysearch {
	public int binarySearch(double arr[], int l, int r, double x)
    {
        if (r >= l) {
            int pivot = l + (r - l) / 2;
 
            // If the element is present at the
            // middle itself
            if (arr[pivot] == x)
                return pivot;
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[pivot] > x)
                return binarySearch(arr, l, pivot - 1, x);
 
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, pivot + 1, r, x);
        }
 
        // We reach here when element is not present
        // in array
        return -1;
    }
}
