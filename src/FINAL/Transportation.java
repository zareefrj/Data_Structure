package FINAL;

import java.util.PriorityQueue;

public class Transportation {
    Passenger[] passenger;
    PriorityQueue<Passenger> sortedPass = new PriorityQueue<>();

    public Transportation(Passenger[] passenger) {
        this.passenger = passenger;
        for(int i = 0; i < passenger.length ;i++){
            sortedPass.offer(passenger[i]);
        }
    }
    
    public void display(){
        PriorityQueue<Passenger> q = sortedPass;
        System.out.println("Passenger Drop-off List");
        while(!q.isEmpty()){
            Passenger e = q.poll();
            if(e.workplace > 0.2){
                if(e.workplace < 1.7)
                    System.out.println("Stop A: " + e.toString());
                else if(e.workplace < 2.7)
                    System.out.println("Stop B: " + e.toString());
                else if(e.workplace < 3.7)
                    System.out.println("Stop C: " + e.toString());
                else if(e.workplace < 4.7)
                    System.out.println("Stop D: " + e.toString());
                else
                    System.out.println("Stop E: " + e.toString());
            }
        }
    }
    
}
