import java.util.Random;

//Name: Jorge Sirias
//Class: COP 3337 Programing II
//Professor: Greg Shaw
//Section: U07
//Date: 12/4/17
//
//I affirm that this program is entirely my own work and none of it is the work of any other person.
//  ______Jorge Siras_________
//	(your signature)

public class ArrayRecursion 
{
    
    // instance var's

   private int[] list;		// array of ints
   private int count = 0;	// number of elements used

   /**
    * Create an ArrayRecursion object. Create an array with between 10 and 15
    * elements, and fill it with random positive 2-digit ints
    */
   public ArrayRecursion()
   {
      Random r = new Random();
      count = r.nextInt(6) + 10;
      list = new int[count];

      for (int i = 0; i < count; i++)
      {
         list[i] = r.nextInt(90) + 10;
      }
   }

   /*
    * Return the list as a string
    * @return a string containing all ints stored in list
    */
   public String toString()
   {
      String out = "";
      for (int i = 0; i < count; i++)
      {
         out += list[i] + "  ";
      }
      return out + "\n";
   }

   /**
    * Reverse the order of the values stored in the list. (called by client to
    * reverse list using first algorithm)
    */
   public void reverse()
   {
      reverseRecurse(list, 0, count);
   }

   // recursive "helper" method to reverse the values stored in the list 
   // (called by public method reverse1())
   private void reverseRecurse(int[] list, int start, int count)
   {
       //Stores the value of start index in the array
       int temp;
       
       if(start == count || start > count)
       {
       
           System.out.println("The array has been reversed!\n");
           
       }
       else
       {
           
           temp  = list[start];
           list[start] = list[count - 1];
           list [count - 1] = temp;  
           
           start++;
           count--;
           
           reverseRecurse(list, start, count);
           
       }
   }

   /*
    * Returns the index of the largest value in the array.
    * @return the index of the largest value in the array
    */
   public int getIndexOfLargest()
   {
      return recursiveGetIndexOfLargest(list, count);
   }

   // recursive "helper" method to return index of largest value
   // (called by public method getLargest())
   private int recursiveGetIndexOfLargest(int[] list, int count)
   {
       //System.out.println("Count is " + count);
       if(count==1)
       {
           return 0;
       }
       else
       {
           
           count--;
           int index = recursiveGetIndexOfLargest(list,count);
           
           if(list[index] >= list[count])
           {
               //System.out.println("list["+ index +"] >= list[" +count +"] = " + index);
               return index;
           }
           else
           {
               //System.out.println("list["+ index +"] >= list[" +count +"] = " + count);
               return count;
           }
       
       }
 
   }

   /*
    * Sort the array in ascending order using the selection sort
    */
   public void sort()
   {
      recursiveSort(list, count);
   }

   // recursive "helper" method to sort the array
   // (called by public method sort())
   private void recursiveSort(int[] list, int count)
   {
      
       //System.out.println("Count is " + count);
       if(count == 1){
           System.out.println("Sorting is done");
       }
       else{
       
       int index = recursiveGetIndexOfLargest(list, count);
       
       int temp = list[index];
       //System.out.println("The value of list[" +index +"] = " + temp);
       
       count --;
       ////Delete////
       list[index] = list[count];
       //System.out.println("list["+ index + "] = " + index);
       ///Delete////
       list[count] = temp;
       //System.out.println("list["+ count + "] = " + temp);
       recursiveSort(list,count);
       
       }
   }

    
}
