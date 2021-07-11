package DoublyLinkedList;

import java.util.Scanner;

public class TestDoubly {
    public static void main(String[] args) {
        /*//1 add 1st node '1'
        DoublyLinkedList list=new DoublyLinkedList();
        list.addFirst(1);

        //2 add last '100'
        list.addLast(100);

        //3 add 2@2
        list.add(2,2);
        list.add(3,6);

        //4 remove @ 3
        System.out.println(list.remove(3));

        //5 traverse forward
        list.iterateForward();
        //6 backward
        list.iterateBackward();

        //7 print size
        System.out.println("current list size: "+list.getSize());

        //8
        list.clear();
        //9
        System.out.println("current list size: "+list.getSize());*/

        //Volume Challenge
        /*DoublyLinkedList volume=new DoublyLinkedList();
        for(int i=1;i<6;i++)
            volume.addLast(i);

        System.out.println("Volume Simulation: + -\n"+volume.Volume("a"));
        String button;
        Scanner scanner=new Scanner(System.in);

        do{
            System.out.print("Enter input: ");
            button= scanner.next();
            System.out.println(volume.Volume(button));

        }while (button.equals("+")||button.equals("-"));*/


         //Channel Challenge

          DoublyLinkedList channel=new DoublyLinkedList();
          for(int i=1;i<6;i++)
            channel.addLast(i);

        System.out.println("Volume Simulation: + -\n"+channel.Channel(" "));
        String button;
        Scanner scanner=new Scanner(System.in);

        do{
            System.out.print("Enter input: ");
            button= scanner.next();
            System.out.println(channel.Channel(button));

        }while (button.equals("+")||button.equals("-"));

    }
}
