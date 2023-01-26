import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        List list = Arrays.asList(array);

        //traditional for 문
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }


        //enhanced for 문
        for(int each : array){
            System.out.println(each);
        }

        //lambda
        list.forEach(System.out::println);


        int a = 0;

        while(a<10){
            if(a%3==0){
                System.out.println("나머지 0");
            }else if (a%3==1) {
                System.out.println("나머지 1");
            }else{
                System.out.println("나머지 2");

            }

            a++;
        }


        switch (a){
            case 9:
                System.out.println("9");
                break;
            case 10:
                System.out.println("10");
                break;
            default:
                System.out.println("둘다 아니더라");
                break;
        }


        a = a > 10 ? 500 : a %2==0 ? 1000 : 300;
        System.out.println(a);







    }
}
