import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter(System.out);

        int j = 1, i = 1, aux;
        long sum = 0;
        while(i<=4000000){
            if(i%2 == 0){
                sum += i;
            }
            aux = i;
            i += j;
            j = aux;
        }
        out.println(sum);

        out.close();
    }
}
