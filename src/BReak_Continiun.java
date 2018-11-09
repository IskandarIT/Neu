public class BReak_Continiun {
   /** public static void main(String[] args){
        int i=0;
        while(true){
            if(i==20){
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Вы вышли из цикла");
    }**/
    public static void main(String[] args){
        for (int i=0; i<=20; i++){
            if(i%2==0){
                continue;
            }
            System.out.println("это нечетный число"+i);
        }
    }

}
