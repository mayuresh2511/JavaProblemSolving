package com.maymar.sortAndSearchAlgos;

public class SortingAlgorithms {

  public static void selectionSort(int[] unsortedArray){

    Integer minValue;
    Integer tempVar;
    Integer minValIndex;

    for (int i = 0; i < unsortedArray.length - 1; i++){

      minValue = Integer.MAX_VALUE;
      minValIndex = -1;

      for (int j = i; j < unsortedArray.length; j++){

        if (unsortedArray[j] < minValue){
          minValue = unsortedArray[j];
          minValIndex = j;
        }

      }

      if (i != minValIndex){
        tempVar = unsortedArray[i];
        unsortedArray[i] = minValue;
        unsortedArray[minValIndex] = tempVar;
      }

    }
  }

  public static void bubbleSort(int[] unsortedArray){

    Integer tempVar;

    for (int i = 0; i < unsortedArray.length; i++){

      for (int j = 0; j < unsortedArray.length - i - 1; j++){

        if (unsortedArray[j] > unsortedArray[j+1]){

          tempVar = unsortedArray[j+1];
          unsortedArray[j+1] = unsortedArray[j];
          unsortedArray[j] = tempVar;

        }
      }
    }
  }

  public static void insertSort(int[] unsortedArray){

    Integer index;
    Integer tempVar;

    for (int i = 1; i < unsortedArray.length; i++){

      if (unsortedArray[i] < unsortedArray[i-1]){
        index = i;
        while (index > 0 && (unsortedArray[index] < unsortedArray[index - 1])){

          tempVar = unsortedArray[index];
          unsortedArray[index] = unsortedArray[index - 1];
          unsortedArray[index - 1] = tempVar;

          index--;
        }
      }
    }
  }
}
