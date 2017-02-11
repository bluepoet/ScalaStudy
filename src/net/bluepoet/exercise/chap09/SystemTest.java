package net.bluepoet.exercise.chap09;

import java.io.IOException;

/**
 * Created by Mac on 2017. 2. 11..
 */
public class SystemTest {
    public static void main(String[] args) {
        int bt = 0;
        int cnt = 0;

        try {
            while((bt = System.in.read()) != -1) {
                cnt++;
                System.out.write(bt);

                if(cnt == 2) break;
            }
        }catch(IOException e) {
            System.err.print(e);
        }

        System.out.println();
        System.out.println("total bytes : " + bt);
    }
}
