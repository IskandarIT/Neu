package Interface;

public class Person implements Info{
    private String name;
    public Person(String name){
        this.name=name;
    }
    public void say(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Name ist"+name);
    }

}
