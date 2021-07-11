package FINAL;
public class Main {
    public static void main(String[] args) {

        /*Passenger a = new Passenger("Susan", "Road 0.9");
        Passenger b = new Passenger("Jack", "Road 5.5");
        Passenger c = new Passenger("Benjamin", "Road 1.6");
        Passenger d = new Passenger("Rachel", "Road 3.8");
        Passenger e = new Passenger("Samuel", "Road 4.1");
        Passenger f = new Passenger("Kenneth", "Road 2.6");

        Passenger[] pass= {a,b,c,d,e,f};
        Transportation dropOff = new Transportation(pass);
        dropOff.display();*/

        int s=permut(3,2);
        System.out.println(s);
    }

    public static int permut(int n, int r){
        if (n<=0 && r<0)
            return -1;
        if(n-1>r)
            return n*permut(n-1,r);
        else
            return 1;
    }
}
