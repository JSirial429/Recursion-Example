//Name: Jorge Sirias
//Class: COP 3337 Programing II
//Professor: Greg Shaw
//Section: U07
//Date: 12/4/17
//
//I affirm that this program is entirely my own work and none of it is the work of any other person.
//  ______Jorge Siras_________
//	(your signature)

public class ArrayRecursionTest 
{

     public static void main(String[] args)
   {
      ArrayRecursion list = new ArrayRecursion();

      System.out.println("\nOriginal:  " + list);
      list.reverse();
      System.out.println("\nReversed:    " + list);
      System.out.println("Largest value is at index: "
              + list.getIndexOfLargest());
      list.sort();
      System.out.println("\nSorted:    " + list);
   }
    
}
