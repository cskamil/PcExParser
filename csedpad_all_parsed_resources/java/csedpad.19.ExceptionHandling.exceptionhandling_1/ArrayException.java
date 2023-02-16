@goalDescription(This program demonstrates how arrays are initalized and how an ArrayIndexOutOfBoundsException can occur.)
**/
public class ArrayException {
  public static void main(String[] args) {
//Initalize an array variable called num of type integer, and of size 4.
    int[] num = new int[4];

//Assign integer values 1, 3, and 4 to indexes 0, 1, and 3 of the array.
    num[0] = 1;
    num[1] = 3;
    num[3] = 4;

//Within a try block, loop through array num outputing the item at each index.
    try {
      for (int i = 0; i <= num.length; i++) {
        System.out.println(num[i]);
      }
//Catch exceptions thrown by the previous loop, printing out the name of the exception.
    }catch (ArrayIndexOutOfBoundsException exception) {
      System.out.println("ArrayIndexOutOfBoundsException");
    }
  }
}
