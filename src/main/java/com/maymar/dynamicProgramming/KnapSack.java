package com.maymar.dynamicProgramming;

import java.util.ArrayList;

public class KnapSack {

  public ArrayList<ArrayList<Integer>> knapsackMaximizeProfit(int[] weight, int[] price,
                                                              int knapsackWeight){

    ArrayList<ArrayList<Integer>> result = null;
    ArrayList<ArrayList<Integer>> tempResult = null;

    for (int i = 0; i < weight.length; i++){

      if (result == null){
        result = new ArrayList<ArrayList<Integer>>();
        if (knapsackWeight >= weight[i]){
          ArrayList<Integer> subResult1 = new ArrayList<>();
          subResult1.add(price[i]);
          subResult1.add(weight[i]);
          result.add(subResult1);
        }
        ArrayList<Integer> subResult2 = new ArrayList<>();
        subResult2.add(0);
        subResult2.add(0);
        result.add(subResult2);
      }else{
        tempResult = new ArrayList<ArrayList<Integer>>();
        for (int j = 0; j < result.size(); j++){
          if (knapsackWeight >= (weight[i] + result.get(j).get(1))){
            ArrayList<Integer> subResult1 = new ArrayList<>();
            subResult1.add(price[i] + result.get(j).get(0));
            subResult1.add(weight[i] + result.get(j).get(1));
            tempResult.add(subResult1);
          }
          ArrayList<Integer> subResult2 = new ArrayList<>();
          subResult2.add(result.get(j).get(0));
          subResult2.add(result.get(j).get(1));
          tempResult.add(subResult2);
        }
        result = tempResult;
        tempResult = null;
      }
    }

    return result;
  }

  public Integer knapsackMaximizeProfitRecursive(int[] weight, int[] price, int knapsackWeight, int weightIndex,
                                                 int priceIndex){

    if (knapsackWeight == 0 || weightIndex == 0 || priceIndex == 0){
      return 0;
    }

    if (knapsackWeight >= weight[weightIndex]){
      return Math.max(price[priceIndex] + knapsackMaximizeProfitRecursive(weight, price,
          knapsackWeight - weight[weightIndex], weightIndex - 1, priceIndex - 1),
          knapsackMaximizeProfitRecursive(weight, price, knapsackWeight, weightIndex - 1,
              priceIndex - 1));
    }else{
      return knapsackMaximizeProfitRecursive(weight, price, knapsackWeight, weightIndex - 1,
          priceIndex - 1);
    }
  }

  public Integer knapsackMaximizeProfitDP(){

    return null;
  }
}
