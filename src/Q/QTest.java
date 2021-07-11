package Q;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QTest {
    public static void main(String[] args) {
        /*//a
        MyQueue fruitQ=new MyQueue(new String[] {"Durian","Blueberry"});
        System.out.println("a: "+fruitQ.toString());

        //b
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");
        System.out.println("b: "+fruitQ.toString());
        //c

        //d
        System.out.println(fruitQ.peek());
        //e
        System.out.println("Queue size: "+fruitQ.getSize());
        //f
        System.out.println("Deleted item: "+fruitQ.dequeue());
        //g
        System.out.println("Get index 2: "+fruitQ.getElement(2));
        //h i
        System.out.println("Got Cherry? "+fruitQ.contains("Cherry"));
        System.out.println("Got Durian? "+fruitQ.contains("Durian"));

        //j
        while (!fruitQ.isEmpty())
            System.out.print(fruitQ.dequeue()+" ");
        System.out.println();
        */

        /*//palindrome
        String p="boyob",result="";
        char[] c=p.toCharArray();
        MyQueue q=new MyQueue();

        for(int i=c.length-1;i>=0;i--)
            q.enqueue(c[i]);

        System.out.println(q.toString());

        while (!q.isEmpty())
            result+=q.dequeue();

        if(result.equals(p))
            System.out.println(p+" is palindrome");
        else
            System.out.println(p+" NOT palindrome");*/

        //Stock
       Scanner sc = new Scanner(System.in);
        MyQueue<Integer> queueShare = new MyQueue<>();
        MyQueue<Integer> queuePrice = new MyQueue<>();

        int capitalGainLoss = 0;
        do {
            System.out.print("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
            String query = sc.nextLine();
            if(query.isEmpty()) { // check to exit
                break;
            }
            else {
                String[] parts = query.split(" ");
                String type = parts[0];
                int shareNum = Integer.parseInt(parts[1]);
                int sharePrice = Integer.parseInt(parts[4].replace("$", ""));
                // if sell
                if(type.equals("Sell")) {
                    System.out.println("Selling the shares now...");
                    do {
                        // if has share in queue to sell
                        if(!queueShare.isEmpty()) {
                            int oldestShareNum = queueShare.dequeue();
                            int oldestPrice = queuePrice.dequeue();
                            // if sufficient to sell
                            if(oldestShareNum >= shareNum) {

                                capitalGainLoss += shareNum * (sharePrice - oldestPrice);
                                oldestShareNum -= shareNum;
                                // if there are some left
                                if(oldestShareNum > 0) {
                                    queueShare = addFirst(queueShare,
                                                          oldestShareNum);
                                    queuePrice = addFirst(queuePrice,
                                                          oldestPrice);
                                }
                            }
                            else //insufficient
                            {
                                capitalGainLoss += oldestShareNum * (sharePrice - oldestPrice);
                            }
                            System.out.println("Total Capital Gain / Loss: " + capitalGainLoss);
                            //left over
                            shareNum -= oldestShareNum;
                        }
                        else {
                            System.out.println("No shares to sell!");
                            shareNum = 0;
                            sharePrice = 0;
                        }
                    }
                    while(shareNum > 0);
                }
                else { // Buy
                    System.out.println("Buying now...");
                    queueShare.enqueue(shareNum);
                    queuePrice.enqueue(sharePrice);
                }
                //display for checking purposes
                System.out.println("Queue for Share: " + queueShare);
                System.out.println("Queue for Price: " + queuePrice);
            }
        }
        while(true);
        System.out.println("Final Capital Gain / Loss: " + capitalGainLoss);
    }

    public static MyQueue<Integer> addFirst(MyQueue<Integer> queue, int newTop) {
        MyQueue<Integer> newQueue = new MyQueue<>();
        newQueue.enqueue(newTop);
        while(!queue.isEmpty()) {
            newQueue.enqueue(queue.dequeue());
        }
        return newQueue;
    }

        /*MyQueue q=new MyQueue();
        q.enqueue(0);
        q.enqueue(1);
        for(int i=0;i<5;i++){
            int a= (int) q.dequeue();
            int b= (int) q.dequeue();
            q.enqueue(b);
            q.enqueue(a+b);
            System.out.println(a+" ");

        }*/
/*
        MyQueue<Integer> q=new MyQueue<>();
        Stack<Integer> s=new Stack<Integer>();
         q.enqueue(1);q.enqueue(2);q.enqueue(3);

         while(!q.isEmpty())
             s.push(q.dequeue());

         while(!s.isEmpty())
             q.enqueue(s.pop());

        System.out.println(q.toString());
        System.out.println(s.toString()); }*/

}