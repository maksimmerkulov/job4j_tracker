package ru.job4j.oop;

/**
 * Класс {@code Tamagotchi} представляет виртуального питомца.
 *
 * <p>Используется для демонстрации передачи объектов по ссылке
 * и изменения их состояния через методы.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Tamagotchi pet = new Tamagotchi();
 * System.out.println(pet.info());
 * Tamagotchi.feedPet(pet);
 * System.out.println(pet.info());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * weight: 100
 * weight: 110
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Tamagotchi {

    /**
     * Текущий вес питомца.
     */
    private int weight = 100;

    /**
     * Увеличивает вес питомца на 10 единиц.
     *
     * <p>Символизирует процесс кормления.</p>
     */
    public void feed() {
        weight += 10;
    }

    /**
     * Возвращает строку с текущим весом питомца.
     *
     * @return строка с текущим весом питомца
     */
    public String info() {
        return "weight: " + weight;
    }

    /**
     * Кормит переданного питомца.
     *
     * <p>Принимает объект {@code Tamagotchi} и вызывает у него метод {@link #feed()}.</p>
     *
     * @param petCopy объект питомца, которого нужно накормить
     */
    public static void feedPet(Tamagotchi petCopy) {
        petCopy.feed();
    }

    /**
     * Демонстрация изменения состояния объекта через метод {@link #feedPet}.
     *
     * <p>Создает экземпляр питомца, выводит его вес, кормит его
     * и снова выводит вес.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Tamagotchi pet = new Tamagotchi();
        System.out.println(pet.info());
        feedPet(pet);
        System.out.println(pet.info());
    }
}
