package Interface;

public class Animal implements Info {
    public int id;
    public Animal(int id){
        this.id=id;
    }
    public void sleep(){
        System.out.println("Ich habe geschlafen");
    }
    public void show(){
        System.out.println("ID ist:"+ id);
    }
}
