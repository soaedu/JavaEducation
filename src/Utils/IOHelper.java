package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOHelper {
    public static String requestDataFromUser(String message) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(input);

        String userResponse = null;
        while(userResponse == null || userResponse.isEmpty()) {
            System.out.print(message);

            try {
                userResponse = buf.readLine();
            } catch (IOException e) {
                System.out.println("Ошибочный ввод. Попробуйте еще раз.");
            }
        }

        return userResponse;
    }

    public static <T> int parseToInt(T data) {
        int result = -1;

        try {
            result = Integer.parseInt(data.toString());
        } catch (NumberFormatException ex) {
            System.out.println("Не удалось определить число.");
        }

        return result;
    }


}
