public class slovostatic {
    public static void main(String[] args) {
    Personen p1=new Personen("Ivan",45);
    p1.printOffpeople();
        System.out.println();
    }
}
class Personen{
    private String name;
    private int alt;
private static  int Countepeople;
public Personen(String name, int alt){
    this.name=name;
    this.alt=alt;
    Countepeople++;

}
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int alt){
        this.alt= alt;
    }
   public void printOffpeople(){
       System.out.println("Nimber people ist:"+ Countepeople);
   }


}