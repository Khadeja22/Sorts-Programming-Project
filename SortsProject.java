import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
//import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;


class SortsProject
  { 
    
    //1
    public static void selectionSort(int[] elements)
      {
        System.out.println("Printing Unsorted Array of Integers:\n" + Arrays.toString(elements));
        for (int j = 0; j < elements.length - 1; j++)
          {
            int minIndex = j;
            
            for (int k = j + 1; k < elements.length; k++)
              {
                if (elements[k] < elements[minIndex])
                  {
                    minIndex = k;
                  }
              }
            
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
            System.out.println("Repositioning:");
            System.out.println(Arrays.toString(elements));
          }
      }

      //2
      public static void selectionSortDecreasing(int[] elements)
      {
        System.out.println("Printing Unsorted Array of Integers:\n" + Arrays.toString(elements));
        for (int j=0; j<elements.length-1; j++)
          {
            int maxIndex = j;
            
            for (int k = j+1; k < elements.length; k++)
              {
                if (elements[k] > elements[maxIndex])
                  {
                    maxIndex = k;
                  }
              }
            
            int temp = elements[j];
            elements[j] = elements[maxIndex];
            elements[maxIndex] = temp;
            System.out.println("Repositioning:");
            System.out.println(Arrays.toString(elements));
          }
      }

      //3
      public static void selectionSortArrayList(ArrayList<Integer> elements)
      {
        System.out.println("Printing Unsorted Array of Integers:\n" + elements);
        for (int j = 0; j < elements.size() - 1; j++)
          {
            int minIndex = j;
            
            for (int k = j + 1; k < elements.size(); k++)
              {
                if (elements.get(k) < elements.get(minIndex))
                  {
                    minIndex = k;
                  }
              }
            
            int temp = elements.get(j);
            elements.set(j, elements.get(minIndex));
            elements.set(minIndex, temp);
            System.out.println("Repositioning:");
            System.out.println(elements);
          }
      }

      //4
      public static void selectionSortDecreasingArrayList(ArrayList<Integer> elements)
      {
        System.out.println("Printing Unsorted Array of Integers:\n" + elements);
        for (int j=0; j<elements.size()-1; j++)
          {
            int maxIndex = j;
            
            for (int k = j+1; k < elements.size(); k++)
              {
                if (elements.get(k) > elements.get(maxIndex))
                  {
                    maxIndex = k;
                  }
              }
            
            int temp = elements.get(j);
            elements.set(j, elements.get(maxIndex));
            elements.set(maxIndex, temp);
            System.out.println("Repositioning:");
            System.out.println(elements);
          }
      }

    //5
    public static void insertionSort(int[] elements)
    {
        System.out.println("Printing Unsorted Array of Integers:\n" + Arrays.toString(elements));
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
            System.out.println("Repositioning:");
            System.out.println(Arrays.toString(elements));
        }
    } 

    //6
      public static void insertionSortDecreasing(int[] elements)
      {
        System.out.println("Printing Unsorted Array of Integers:\n" + Arrays.toString(elements));
        for (int j = 1; j < elements.length; j++)
          {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && elements[possibleIndex - 1] < temp)
              {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
              }
            elements[possibleIndex] = temp;
            System.out.println("Repositioning:");
            System.out.println(Arrays.toString(elements));
          }
      }

      //7
      public static void insertionSortArrayList(ArrayList<Integer> elements)
      {
        System.out.println("Printing Unsorted Array of Integers:\n" + elements);
        for (int j = 1; j < elements.size(); j++)
          {
            int temp = elements.get(j);
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements.get(possibleIndex - 1))
              {
                elements.set(possibleIndex, elements.get(possibleIndex-1));
                possibleIndex--;
              }
            elements.set(possibleIndex, temp);
            System.out.println("Repositioning:");
            System.out.println(elements);
          }
      } 
      
      //8
      public static void insertionSortDecreasingArrayList(ArrayList<Integer> elements)
      {
        System.out.println("Printing Unsorted Array of Integers:\n" + elements);
        for (int j = 1; j < elements.size(); j++)
          {
            int temp = elements.get(j);
            int possibleIndex = j;
            while (possibleIndex > 0 && elements.get(possibleIndex - 1) < temp)
              {
                elements.set(possibleIndex, elements.get(possibleIndex-1));
                possibleIndex--;
              }
            elements.set(possibleIndex, temp);
            System.out.println("Repositioning:");
            System.out.println(elements);
          }
      }

      //9
    public static void selectionSortAlphabetical(String[] elements)
    {
        System.out.println("Printing Unsorted Array of Strings:\n" + Arrays.toString(elements));
        for (int j = 0; j < elements.length - 1; j++)
          {
            int firstLetterIndex = j;
            
            for (int k = j + 1; k < elements.length; k++)
              {
                if ((elements[k].compareTo(elements[firstLetterIndex])) < 0)
                  {
                    firstLetterIndex = k;
                  }
              }
            
            String temp = elements[j];
            elements[j] = elements[firstLetterIndex];
            elements[firstLetterIndex] = temp;
            System.out.println("Repositioning:");
            System.out.println(Arrays.toString(elements));
          }
    }

    //10
    public static void selectionSortAlphabeticalArrayList(ArrayList<String> elements)
    {
        System.out.println("Printing Unsorted Array of Strings:\n" + elements);
        for (int j = 0; j < elements.size() - 1; j++)
          {
            int firstLetterIndex = j;
            
            for (int k = j + 1; k < elements.size(); k++)
              {
                if ((elements.get(k).compareTo(elements.get(firstLetterIndex))) < 0)
                  {
                    firstLetterIndex = k;
                  }
              }
            
            String temp = elements.get(j);
            elements.set(j, elements.get(firstLetterIndex));
            elements.set(firstLetterIndex, temp);
            System.out.println("Repositioning:");
            System.out.println(elements);
          }
    }

    //11
    public static void selectionSortAlphabeticalDecreasing(String[] elements)
    {
        System.out.println("Printing Unsorted Array of Strings:\n" + Arrays.toString(elements));
        for (int j = 0; j < elements.length - 1; j++)
          {
            int firstLetterIndex = j;
            
            for (int k = j + 1; k < elements.length; k++)
              {
                if ((elements[k].compareTo(elements[firstLetterIndex])) > 0)
                  {
                    firstLetterIndex = k;
                  }
              }
            
            String temp = elements[j];
            elements[j] = elements[firstLetterIndex];
            elements[firstLetterIndex] = temp;
            System.out.println("Repositioning:");
            System.out.println(Arrays.toString(elements));
          }
    }

    //12
    public static void selectionSortAlphabeticalDecreasingArrayList(ArrayList<String> elements)
    {
        System.out.println("Printing Unsorted Array of Strings:\n" + elements);
        for (int j = 0; j < elements.size() - 1; j++)
          {
            int firstLetterIndex = j;
            
            for (int k = j + 1; k < elements.size(); k++)
              {
                if ((elements.get(k).compareTo(elements.get(firstLetterIndex))) > 0)
                  {
                    firstLetterIndex = k;
                  }
              }
            
            String temp = elements.get(j);
            elements.set(j, elements.get(firstLetterIndex));
            elements.set(firstLetterIndex, temp);
            System.out.println("Repositioning:");
            System.out.println(elements);
          }
    }

    //13
    public static void insertionSortAlphabetical(String[] elements)
    {
        System.out.println("Printing Unsorted Array of Strings:\n" + Arrays.toString(elements));
        for (int j = 1; j < elements.length; j++)
          {
            String temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp.compareTo(elements[possibleIndex - 1])<0)
              {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
              }
            elements[possibleIndex] = temp;
            System.out.println("Repositioning:");
            System.out.println(Arrays.toString(elements));
          }
    }

    //14
    public static void insertionSortAlphabeticalArrayList(ArrayList<String> elements)
    {
        System.out.println("Printing Unsorted Array of Strings:\n" + elements);
        for (int j = 1; j < elements.size(); j++)
          {
            String temp = elements.get(j);
            int possibleIndex = j;
            while (possibleIndex > 0 && temp.compareTo(elements.get(possibleIndex - 1))<0)
              {
                elements.set(possibleIndex, elements.get(possibleIndex-1));
                possibleIndex--;
              }
            elements.set(possibleIndex, temp);
            System.out.println("Repositioning:");
            System.out.println(elements);
          }
    }

    //15
    public static void insertionSortAlphabeticalDecreasing(String[] elements)
    {
        System.out.println("Printing Unsorted Array of Strings:\n" + Arrays.toString(elements));
        for (int j = 1; j < elements.length; j++)
          {
            String temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp.compareTo(elements[possibleIndex - 1])>0)
              {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
              }
            elements[possibleIndex] = temp;
            System.out.println("Repositioning:");
            System.out.println(Arrays.toString(elements));
          }
    }

    //16
    public static void insertionSortAlphabeticalDecreasingArrayList(ArrayList<String> elements)
    {
        System.out.println("Printing Unsorted Array of Strings:\n" + elements);
        for (int j = 1; j < elements.size(); j++)
          {
            String temp = elements.get(j);
            int possibleIndex = j;
            while (possibleIndex > 0 && temp.compareTo(elements.get(possibleIndex - 1))>0)
              {
                elements.set(possibleIndex, elements.get(possibleIndex-1));
                possibleIndex--;
              }
            elements.set(possibleIndex, temp);
            System.out.println("Repositioning:");
            System.out.println(elements);
          }
    }

    public static void main (String str[]) throws IOException
      {

        Scanner scan = new Scanner(System.in);
        
      
        int[] arrayA = new int[6];
        int[] arrayB = new int[6];
    
        System.out.println("Enter 6 integers to populate the first array:");
        for (int i=0; i<6; i++)
        {
            arrayA[i]=scan.nextInt();
        }
        System.out.println("\n\nSelection sort for increasing order:");
        int[] arrayACopy=arrayA.clone();
        selectionSort(arrayA);
        

        System.out.println("\nSelection sort for decreasing order:");
        selectionSortDecreasing(arrayACopy);



        System.out.println("\n\n\nEnter 6 integers to populate the second array:");
        for (int i=0; i<6; i++)
        {
            arrayB[i]=scan.nextInt();
        }
        System.out.println("\n\nInsertion sort for increasing order:");
        int[] arrayBCopy=arrayB.clone();
        insertionSort(arrayB);

        System.out.println("\nInsertion sort for decreasing order:");
        insertionSortDecreasing(arrayBCopy);



        //Create Two String Arrays with 5 Strings in it that are populated using user input
        Scanner scan2 = new Scanner(System.in);
        
        String[] stringArray1 = new String[5];
        String[] stringArray2 = new String[5];
        System.out.println("\n\nEnter 5 strings:");
        for (int i=0; i<5; i++)
        {
            stringArray1[i]=scan2.nextLine();
            stringArray2[i]=stringArray1[i];
        }
        
        System.out.println("\n\nSelection sort for first String Array in alphabetical order:");
        String[] stringArray1Copy=stringArray1.clone();
        selectionSortAlphabetical(stringArray1);
        System.out.println("\nSelection sort for first String Array in reverse alphabetical order:");
        selectionSortAlphabeticalDecreasing(stringArray1Copy);
        System.out.println("\n\nInsertion sort on the second String Array in alphabetical order: ");
        String[] stringArray2Copy=stringArray2.clone();
        insertionSortAlphabetical(stringArray2);
        System.out.println("\nInsertion sort on the second String Array in reverse alphabetical order:");
        insertionSortAlphabeticalDecreasing(stringArray2Copy);


        //ARRAYLIST PART ---------------------------------------------------------------------------------------------------------------------------------------------

        Scanner scanny = new Scanner(System.in);
        
        ArrayList<Integer> arrayListA = new ArrayList<Integer>();
        ArrayList<Integer> arrayListB = new ArrayList<Integer>();

        System.out.println("\n\n\nEnter 6 integers to populate the first ArrayList:");
        for (int i = 0; i<6; i++)
        {
            arrayListA.add(scanny.nextInt());
        }
        System.out.println("\n\nSelection sort for increasing order ArrayList:");
        ArrayList<Integer> arrayListACopy = (ArrayList<Integer>) arrayListA.clone();
        selectionSortArrayList(arrayListA);

        System.out.println("\nSelection sort for decreasing order ArrayList:");
        selectionSortDecreasingArrayList(arrayListACopy);



        System.out.println("\n\n\nEnter 6 integers to populate the second ArrayList:");
        for (int i = 0; i<6; i++)
        {
            arrayListB.add(scan.nextInt());
        }
        System.out.println("\n\nInsertion sort for increasing order ArrayList:");
        ArrayList<Integer> arrayListBCopy = (ArrayList<Integer>) arrayListB.clone();
        insertionSortArrayList(arrayListB);

        System.out.println("\nInsertion sort for decreasing order ArrayList:");
        insertionSortDecreasingArrayList(arrayListBCopy);



        Scanner finalScanner = new Scanner(System.in);

        ArrayList<String> stringArrayList1 = new ArrayList<String>();
        ArrayList<String> stringArrayList2 = new ArrayList<String>();

        System.out.println("\n\nEnter 5 strings for ArrayList:");
        String tempp = new String();
        for (int i=0; i<5; i++)
        {
            tempp=finalScanner.nextLine();
            stringArrayList1.add(tempp);
            stringArrayList2.add(tempp);
        }
        
        System.out.println("\n\nSelection for first String ArrayList in alphabetical order:");
        ArrayList<String> stringArrayList1Copy = (ArrayList<String>) stringArrayList1.clone();
        selectionSortAlphabeticalArrayList(stringArrayList1);
        System.out.println("\nSelection sort for first String ArrayList in reverse alphabetical order:");
        selectionSortAlphabeticalDecreasingArrayList(stringArrayList1Copy);
        System.out.println("\n\nInsertion sort on the second String ArrayList in alphabetical order: ");
        ArrayList<String> stringArrayList2Copy = (ArrayList<String>) stringArrayList2.clone();
        insertionSortAlphabeticalArrayList(stringArrayList2);
        System.out.println("\nInsertion sort on the second String ArrayList in reverse alphabetical order:");
        insertionSortAlphabeticalDecreasingArrayList(stringArrayList2Copy); 
        

       

      }

    
  }