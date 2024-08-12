// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    int[] arr = {2, 3, 4, 10, 40};
    System.out.println("Iterative BS: \n");
    System.out.println("Binary Search: " + BinarySearch(arr, 2));
    System.out.println("Binary Search: " + BinarySearch(arr, 3));
    System.out.println("Binary Search: " + BinarySearch(arr, 4));
    System.out.println("Binary Search: " + BinarySearch(arr, 10));
    System.out.println("Binary Search: " + BinarySearch(arr, 40));
    System.out.println("\nRecursive BS: \n");
    System.out.println("Binary Search: " + BinarySearchRecurs(arr, 2, 0, arr.length - 1));
    System.out.println("Binary Search: " + BinarySearchRecurs(arr, 3, 0, arr.length - 1));
    System.out.println("Binary Search: " + BinarySearchRecurs(arr, 4, 0, arr.length - 1));
    System.out.println("Binary Search: " + BinarySearchRecurs(arr, 10, 0, arr.length - 1));
    System.out.println("Binary Search: " + BinarySearchRecurs(arr, 40, 0, arr.length - 1));
    
  } // main

  // returns the index at which the target value is found (iterative solution)
  private static int BinarySearch(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;
    int mid;
    while (high >= low) {
      mid = (low + high) / 2;
      if (arr[mid] == target) { // target is found
        return mid;
      } else if (arr[mid] < target) { // target not in left half
        low = mid + 1;
      } else if (arr[mid] > target) {
        high = mid - 1;
      } // if
    } // while
    // if value not found
    return -1;
  } // BinarySearch

  // returns the index at which the target value is found (recursive solution)
  private static int BinarySearchRecurs(int[] arr, int target, int low, int high) {
    int mid = low + (high - low) / 2;
    if (arr[mid] == target) {
      return mid;
    } else if (arr[mid] < target) {
      return BinarySearchRecurs(arr, target, mid + 1, high);
    } else if (arr[mid] > target) {
       return BinarySearchRecurs(arr, target, low, mid - 1); 
    } // if
    return -1;
  } // BinarySearchRecurs
  
  
  
} // Main