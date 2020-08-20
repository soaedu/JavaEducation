package java_regular.syntax.loops.while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileLoopMain {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);

        System.out.println("Type 'exit' to exit");
        while(!bufferedReader.readLine().contains("exit"));
    }
}
