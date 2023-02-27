package com.maymar.sortAndSearchAlgos;

public class SortingAlgosMain {

  public static void main(String[] args) {

    int[] unsortedArray = new int[]{5,4,1,0,5,95,4,-100,200,0};

//    SortingAlgorithms.selectionSort(unsortedArray);
//    SortingAlgorithms.bubbleSort(unsortedArray);
    SortingAlgorithms.insertSort(unsortedArray);

    for (int number : unsortedArray){
      System.out.println(number);
    }
  }

}
