import java.util.*;

public class CollectionsUtils {

    // Метод addAll уже корректен согласно PECS
    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    // Создает новый пустой список
    public static <T> List<T> newArrayList() {
        return new ArrayList<>();
    }

    // Ищет первое вхождение указанного объекта
    public static <T> int indexOf(List<T> source, T o) {
        return source.indexOf(o);
    }

    // Возвращает новый список, содержащий первые size элементов из исходного списка source
    public static <T> List<T> limit(List<T> source, int size) {
        if (size > source.size()) {
            return new ArrayList<>(source);
        }
        return source.subList(0, size);
    }

    // Добавляет элемент в конец списка
    public static <T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    // Удаляет все элементы из первого списка, которые присутствуют во втором
    public static <T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    // Проверяет, содержит ли первый список все элементы второго
    public static <T> boolean containsAll(List<? super T> c1, List<? extends T> c2) {
        return c1.containsAll(c2);
    }

    // Проверяет, содержит ли первый список хотя бы один элемент из второго
    public static <T> boolean containsAny(List<? super T> c1, List<? extends T> c2) {
        for (T element : c2) {
            if (c1.contains(element)) {
                return true;
            }
        }
        return false;
    }

    // Возвращает список, содержащий элементы из входного списка в диапазоне от min до max,
    // сравнивая элементы через Comparable
    public static <T extends Comparable<? super T>> List<T> range(List<T> list, T min, T max) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (item.compareTo(min) >= 0 && item.compareTo(max) <= 0) {
                result.add(item);
            }
        }
        return result;
    }

    // Возвращает список, содержащий элементы из входного списка в диапазоне от min до max,
    // сравнивая элементы через Comparator
    public static <T> List<T> range(List<T> list, T min, T max, Comparator<? super T> comparator) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (comparator.compare(item, min) >= 0 && comparator.compare(item, max) <= 0) {
                result.add(item);
            }
        }
        return result;
    }
}
