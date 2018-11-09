public class Lesson19 {
    public static void main(String[] args) {
         Huwan huwan1=new Huwan();
         huwan1.setName("Tom");
         huwan1.setAge(5);
         huwan1.getInfo();

    }
}
class  Huwan{
     private String name;
     private int age;
     public void setName(String name){
         this.name = name;
              }
public void setAge(int age){
         this.age= age;
         }
public String getName(){
         return name;
}
public int getAge(){
         return age;

} public void getInfo(){
        System.out.println("Mne zovut"+" "+name+" "+ age);
    }
}