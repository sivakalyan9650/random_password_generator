import java.util.HashMap;
import java.util.Random;

public class generate_randomstring {
    public static void main(String[] args) {


        int a=33;
        StringBuilder sb=new StringBuilder();
        Random r=new Random();

        for(int i=0;i<10;i++){
            int ran1=r.nextInt(93);
            char ch=(char)(a+ran1);
            sb.append(ch);
        }
        System.out.println(sb);

    }
}
