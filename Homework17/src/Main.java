import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String ip = "^(([0-9]{3}(\\.|$)){4})";
        String s;
        System.out.println("Введите IP");
        Scanner scanner = new Scanner(System.in);
        s = scanner.next();
        Pattern pattern = Pattern.compile(ip);
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()) {
            System.out.println("ip адрес [" + s + "] подходит");
        } else {
            System.out.println("ip адрес [" + s + "] не подходит");
        }
    }
}