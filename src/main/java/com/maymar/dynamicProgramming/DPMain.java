package com.maymar.dynamicProgramming;

import java.util.ArrayList;

public class DPMain {

  public static void main(String[] args) {

//    int[] weight = new int[]{1, 3, 4, 5};
//    int[] price = new int[]{1, 4, 5, 7};
    int[] weight = new int[]{1, 3, 4, 5};
    int[] price = new int[]{1, 4, 5, 7};
    int knapsackWeight = 7;

    KnapSack knapSack = new KnapSack();
//
//    ArrayList<ArrayList<Integer>> result = knapSack.knapsackMaximizeProfit(weight, price, knapsackWeight);
//
//    System.out.println(result.toString());
//
//    for (ArrayList<Integer> list : result){
//      System.out.println(list.toString());
//    }

    System.out.println(knapSack.knapsackMaximizeProfitRecursive(weight, price, knapsackWeight,
        weight.length - 1, price.length - 1));
  }

}
