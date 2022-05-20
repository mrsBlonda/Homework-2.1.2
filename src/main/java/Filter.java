import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;

    }

    public List<Integer> filterOut(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        Logger logger = Logger.getInstance();
        for (int i : list) {
            if (i > threshold) {
                result.add(i);
                logger.log("Элемент " + i + " проходит");
            } else {
                logger.log("Элемент " + i + " не проходит");
            }
        }
        logger.log("Прошло через фильтр " + result.size() + " элемента из " + list.size());
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список:" + result);
        return result;
    }
}
