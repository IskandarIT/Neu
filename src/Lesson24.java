public class Lesson24 {
    public static void main(String[] args) {
        Human h1=new Human("Boby",15);
        System.out.println(h1);
    }
}
class  Human{
    private String name;
    private int alt;
    public Human(String name,int alt){
        this.name=name;
        this.alt=alt;
    }
    public String toString(){
        return name+","+alt;
    }

}