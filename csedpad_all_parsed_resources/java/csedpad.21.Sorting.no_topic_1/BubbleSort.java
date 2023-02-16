@goalDescription(Sort a given unsorted array using bubble sort in ascending order.)
**/
public class BubbleSort {
    public static void sorting(int[] list) {
//Declare a static method sorting() which will sort a given unsorted array in ascending order.
        int n = list.length;
        int temp = 0;
/**@helpDescription(for each element of the list, it compares with the rest of the values in the array and swap their position when list[j - 1] > list[j].)**/
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
/**@helpDescription(comparing each element with the next element. If the previous element is bigger then it gets swapped with each other.)**/
                if (list[j - 1] > list[j]) { 
/**@helpDescription(swapping elements using a temp variable.)**/
                    temp = list[j - 1]; 
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
    
//Declare an integer array that stores unsorted books with numbers items in a shelf.
/**@helpDescription(We define the unsorted list and its values.)**/
        int UnsortedList[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        System.out.println("Array Before Bubble Sort");
//Print the unsorted array using a for-loop.
/**@helpDescription(Print the unsorted list as given.)**/
        for (int i = 0; i < UnsortedList.length; i++) {
            System.out.print(UnsortedList[i] + " ");
        }
        System.out.print('\n' + "Array after Bubble Sort" + '\n');
//Call the sorting method and pass the array as a parameter.
        sorting(UnsortedList); 
/**@helpDescription(Print the sorted list after bubble sort)**/
        for (int i = 0; i < UnsortedList.length; i++) {
            System.out.print(UnsortedList[i] + " ");
        }
    }
}
