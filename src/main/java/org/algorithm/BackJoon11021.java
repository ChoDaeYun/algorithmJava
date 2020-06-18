package org.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 1 ; i <= number ; i++){
            st = new StringTokenizer(br.readLine()," ");
            System.out.println("Case #"+i+": " +
                    (Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())));
        }
        br.close();
    }
}
