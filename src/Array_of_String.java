public class Array_of_String {
    public static void main(String [] args){
        int[] chisl= new int[5];
        String[] stroka = new String[3];
        stroka [0]="Hallo";
        stroka[1]="Danke";
        stroka [2]="gut";
        System.out.println( stroka[0]  );
        System.out.println(stroka[1]);
        System.out.println(stroka[2]);
        for(String strochka: stroka){
            System.out.println(strochka);
        }
        int [] nummers={1,2,3};
        int sum=0;
       for(int t:nummers){
           sum=sum+t;
       }
        System.out.println(sum);
       int value =0;
       String s= null;
        System.out.println(s);




    }
}
