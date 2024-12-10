import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        long sum = 0;
        for(long i = 0; i < 1000; i++){
            if(i%3 == 0 || i%5 == 0){
                sum += i;
            }
        }
        out.println(sum);

        out.close();
    }
}
