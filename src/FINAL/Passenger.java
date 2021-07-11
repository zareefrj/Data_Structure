package FINAL;

public class Passenger implements Comparable<Passenger> {
    Double workplace;
    String name;

    public Passenger(String name, String workplaceData) {
        String data[] = workplaceData.split(" ");
        this.workplace = Double.parseDouble(data[1]);
        this.name = name;
    }
    
    public Double getWorkplace(){
        return this.workplace;
    }
    
    public int compareTo(Passenger e){
        return this.getWorkplace().compareTo(e.getWorkplace());
    }
    
    @Override
    public String toString(){
        return this.name;
    }
    
    
}
