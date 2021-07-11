package SinglyLinkedList;
import java.util.Scanner;

public class SchoolAdmin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MyLinkedList schoollist=new MyLinkedList();
        String name;
        System.out.println("Enter ur students name list. Enter 'n' to end");
        do{
            name=scanner.nextLine();
            if(!name.equalsIgnoreCase("n"))
            schoollist.add(name);

        }while (!name.equalsIgnoreCase("n"));

        System.out.println("You have entered the following names:");
        schoollist.print();

        System.out.println("All names entered correct? Enter 'r' to rename, 'n' to proceed");
        name=scanner.nextLine();
        if(name.equalsIgnoreCase("r")){
            System.out.println("Enter existing name to rename:");
            name=scanner.nextLine();
            System.out.println("Enter new name:");
            String rename=scanner.nextLine();

            schoollist.set(schoollist.indexOf(name),rename);
            schoollist.print();
        }

        System.out.println("Want to remove any students? Enter 'y' for yes, 'n' to proceed.");
        name=scanner.nextLine();
        if(name.equalsIgnoreCase("y")){
            System.out.println("Enter student to remove:");
            name= scanner.nextLine();
            schoollist.remove(schoollist.indexOf(name));
            schoollist.print();
        }

        System.out.println("All student data captured. Thank you!");
    }
}