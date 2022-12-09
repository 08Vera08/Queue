import java.util.List;
import java.util.ArrayDeque;
import java.util.ArrayList;

class Person{
    private String name, lastName;
    private int countOfTickets;
    public Person(String name, String lastName, int countOfTickets){
        this.name = name;
        this.lastName = lastName;
        this.countOfTickets = countOfTickets;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public int getCount(){
        return countOfTickets;
    }
    public void decrease(){
        countOfTickets--;
    }
    public void show(){
        System.out.println('[' + name + ", " + lastName + ", "  + countOfTickets + ']');
    }
};
