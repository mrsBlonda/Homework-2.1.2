import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] arsg) {

        Scanner scan = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        List<Integer> list = new ArrayList<>();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");
        int size = scan.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int maxValue = scan.nextInt();
        logger.log("Создаём и наполняем список");
        Random random = new Random();


        while (list.size() != size) {
            list.add(random.nextInt(maxValue));
        }
        System.out.print("Вот случайный список: ");
        System.out.println(list.toString());
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        int threshold = scan.nextInt();
        logger.log("Запускаем фильтрацию");

        Filter filter = new Filter(threshold);
        filter.filterOut(list);
        logger.log("Завершаем программу");










    }
}
