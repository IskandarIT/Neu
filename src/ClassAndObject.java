public class ClassAndObject {
    public static void main(String[] args){
     Person person1= new Person();
     person1.setName("Ivan");
     person1.setAge(-5);
     person1.speak();

    }
}
class Person{
   private String name;
    private int age;
    public void setName(String userName){
        if(userName.isEmpty()){{
            System.out.println("Вы ввели пустой строку");}
        }
        name= userName;
    }
    public String getName(){
        return name;
    }
    public void setAge(int userAge){
        if(userAge<0){
            System.out.println("Возраст не может отрицательной ");
        }
        age=userAge;
    }
    public int getAge(){
        return age;
    }

    void speak(){

        for(int i=0; i<3; i++){
            System.out.println("Мне зовут"+"  " + name + "," + age + "лет" );}
    }
    void sayHello(){
        for(int j=0; j<2; j++ ){
        System.out.println("Привет");}

    }
    int calcelatorYearreturn(){
        int year =60- age;
        return year;
    }

}