import java.util.Scanner;
public class Switch {
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите возраст");
        int alt= scanner.nextInt();
        switch (alt){
            case 0:
                System.out.println("Ты родилься");
                break;
            case 15:
                System.out.println("Ты учишся 9 классе");
                break;
                case 18:
            System.out.println("Ты поступил универ");
            break;
            default:
                System.out.println("не какое условия не совпадает");

        }
    }
}
