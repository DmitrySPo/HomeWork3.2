import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Тестируем метод addAll
        List<Integer> source = Arrays.asList(1, 2, 3);
        List<Number> destination = new ArrayList<>();
        CollectionsUtils.addAll(source, destination);
        System.out.println("addAll: " + destination);

        // Тестируем метод newArrayList
        List<String> emptyList = CollectionsUtils.newArrayList();
        System.out.println("newArrayList: " + emptyList);

        // Тестируем метод indexOf
        List<String> names = Arrays.asList("Иван", "Сергей", "Семен");
        int index = CollectionsUtils.indexOf(names, "Семен");
        System.out.println("indexOf: " + index);

        // Тестируем метод limit
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> limitedNumbers = CollectionsUtils.limit(numbers, 3);
        System.out.println("limit: " + limitedNumbers);

        // Тестируем метод add
        List<Object> objects = new ArrayList<>();
        CollectionsUtils.add(objects, "Тест");
        System.out.println("add: " + objects);

        // Тестируем метод removeAll
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = Arrays.asList(2, 4);
        CollectionsUtils.removeAll(list1, list2);
        System.out.println("removeAll: " + list1);

        // Тестируем метод containsAll
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list4 = Arrays.asList(2, 4);
        boolean containsAllResult = CollectionsUtils.containsAll(list3, list4);
        System.out.println("containsAll: " + containsAllResult);

        // Тестируем метод containsAny
        List<Integer> list5 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list6 = Arrays.asList(6, 7);
        boolean containsAnyResult = CollectionsUtils.containsAny(list5, list6);
        System.out.println("containsAny: " + containsAnyResult);

        // Тестируем метод range с Comparable
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> rangedList = CollectionsUtils.range(integerList, 2, 4);
        System.out.println("range(Comparable): " + rangedList);

    }
}
