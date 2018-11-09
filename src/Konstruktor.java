public class Konstruktor {
    public static void main(String[] args) {
     Podclass podclass1=new Podclass("Iso",5);
     podclass1.setName("AAA");
     podclass1.setAge(5);
        podclass1.getInfo();
    }

}
class Podclass{
    private String name;
    private int alt;
    public Podclass(){

        System.out.println("Guten Tag erste konstruktor");

    }
    public Podclass(String name){
        System.out.println("Guten Tag zweite konstruktor");
        this.name=name;
    }
    public Podclass(String name, int alt){
        System.out.println("Guten Tag dreite konstruktor");
        this.name=name;
        this.alt=alt;

    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int alt){
        this.alt= alt;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return alt;

    } public void getInfo(){
        System.out.println("Mne zovut"+" "+name+" "+ alt);
    }
}
