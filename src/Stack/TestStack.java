package Stack;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        /*//b
        MyStack stack1=new MyStack();
        //1
        stack1.push('a');
        stack1.push('b');
        stack1.push('c');

        //2
        System.out.println(stack1.toString());

        //3 4
        System.out.println("b?"+stack1.search('b'));
        System.out.println("k?"+stack1.search('k'));

        //c
        MyStack stack2=new MyStack();
        //1
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);

        //2
        System.out.println(stack2.toString());

        //3
        System.out.println("6?"+stack2.search(6));*/

        /*//Q2
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter no u want to push: ");
        Integer input=scanner.nextInt();

        MyStack stack3=new MyStack();
        stack3.push(input);
        stack3.push(1);
        System.out.println("size: "+stack3.getSize());

        //printing by popping
        while(!stack3.isEmpty())
            System.out.println(stack3.pop());*/
//by popping, the elements printed first is the element on top of the stack, instead of the first element pushed in the stack

        /*//Q3 adding sum of n positive int
        Random random=new Random();
        int num= random.nextInt(11)+1;
        MyStack sumstack=new MyStack();

        for(int i=0;i<num;i++)
            sumstack.push(random.nextInt(10));

        System.out.println(sumstack.toString()+"\nSum Process:");

        while(sumstack.getSize()!=1){
            int x= (int) sumstack.pop();
            int y= (int) sumstack.pop();
            sumstack.push(x+y);
        }

        System.out.println("Sum of "+num+" numbers: "+sumstack.peak());*/

        /*//Q4 palindrome checker with stacks
        String palindrome="red";int result=1;

        MyStack palin=new MyStack();
        int mid=palindrome.length()/2;

        for(int i=0;i<mid;i++)
            palin.push(palindrome.charAt(i));

        if(palindrome.length()%2!=0)
            mid++;

        System.out.println(palin.toString());

        while(mid<palindrome.length()){
            if(!palin.pop().equals(palindrome.charAt(mid)))
                result=0;
            mid++;
        }

        if(result==1)
            System.out.println(palindrome+" is a palindrome");
        else
            System.out.println(palindrome+" is NOT a palindrome");*/

        /*//TOWER OF HANOI STACK
        MyStack A=new MyStack();
        MyStack B=new MyStack();
        MyStack C=new MyStack();

        int n=3;

        for(int i=3;i>0;i--)
            A.push(i);

        System.out.println("-----------------------------------");

        TowerofHanoi(n,A,B,C);*/

       /* Stack s=new Stack();
        String str="tenet",result="";

        for(int i=0;i<str.length();i++)
            s.push(str.charAt(i));

        while(!s.isEmpty())
            result+=s.pop();

        if(result.equals(str))
            System.out.println("PALIN");
        else
            System.out.println("NOT");*/
    }

    /*public static void TowerofHanoi(int n,MyStack from, MyStack to, MyStack aux){
        if(n==1){
            to.push(from.pop());
            System.out.println("A:"+from.toString()+" B:"+aux.toString()+" C:"+to.toString());
            return;
        }

        TowerofHanoi(n-1,from,aux,to);
        to.push(from.pop());
        System.out.println("A:"+from.toString()+" B:"+aux.toString()+" C:"+to.toString());

        TowerofHanoi(n-1,aux,to,from);
    }*/
}
