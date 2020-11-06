import java.lang.reflect.Array;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inpt;
        String [] dat = new String[2];
        float res= 0 ;
        do {
            inpt = sc.nextLine().toLowerCase();
            dat = inpt.split(" ");
            if (!dat[0].equals("exit")) {
                if ((dat.length) == 2) {
                    if (dat[0].equals("add")) {
                        res += Integer.parseInt(dat[1]);
                    } else if (dat[0].equals("substract")) {
                        res -= Integer.parseInt(dat[1]);
                    } else if (dat[0].equals("multiply")) {
                        res *= Integer.parseInt(dat[1]);
                    } else if (dat[0].equals("divide")) {
                        if (dat[1].equals('0')) {
                            res = 0;
                        } else {
                            res /= Integer.parseInt(dat[1]);
                        }
                    }
                }
            else if(dat[0].equals("cancle")){
                res = 0;
            }
                System.out.printf("%,.1f", res);
                System.out.println("");
            }
        }while((!dat[0].equals("exit")));
    }
}
