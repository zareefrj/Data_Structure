package FINAL;

import java.util.Scanner;
import java.util.ArrayList;

public class PrintPages {
   public static void main(String[] args) {
      SpecialLL<Integer> bookPage = new SpecialLL<>();
      ArrayList<Integer> selectedList = new ArrayList<>();
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the starting page: ");
      int start = input.nextInt();
      System.out.print("Enter number of pages: ");
      int page = input.nextInt();
      //2c
      for(int i=0;i<page;i++)
         bookPage.addLast(start+i);

      selectedList=bookPage.getEven();

      // 2d
     bookPage.printOdd();
     System.out.println();
     for(int i= selectedList.size()-1;i>=0;i--)
        System.out.print(" "+selectedList.get(i));
   }
}