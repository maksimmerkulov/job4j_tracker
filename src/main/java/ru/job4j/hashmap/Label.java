package ru.job4j.hashmap;

/**
 * Класс {@code Label} представляет собой пару "имя — значение" для
 * хранения результатов оценок или суммарных баллов.
 *
 * <p>Используется в анализе успеваемости учеников и предметов,
 * где {@code name} может быть именем ученика или названием предмета,
 * а {@code score} — соответствующим средним или суммарным баллом.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Label pupilAverage = new Label("Ivanov", 80D);
 * Label subjectTotal = new Label("Math", 250D);
 * int comparison = pupilAverage.compareTo(subjectTotal);
 * System.out.println(pupilAverage);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Label[name=Ivanov, score=80.0]
 * }</pre>
 *
 * <p>Сортировка осуществляется по полю {@code score} в порядке возрастания.</p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public record Label(String name, double score) implements Comparable<Label> {

    /**
     * Сравнивает текущий объект с другим {@code Label} по значению {@code score}.
     *
     * @param o объект {@code Label} для сравнения
     * @return отрицательное число, если текущий {@code score} меньше {@code o.score};
     *         ноль, если они равны;
     *         положительное число, если текущий {@code score} больше {@code o.score}
     */
    @Override
    public int compareTo(Label o) {
        return Double.compare(this.score, o.score);
    }
}
