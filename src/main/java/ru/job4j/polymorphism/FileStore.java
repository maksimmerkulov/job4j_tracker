package ru.job4j.polymorphism;

/**
 * Класс {@code FileStore} представляет реализацию интерфейса {@link Store},
 * которая работает с файловой системой.
 *
 * <p>Позволяет сохранять и считывать данные из файла, путь к которому задается
 * в поле {@code path}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * FileStore store = new FileStore("data.txt");
 * store.save("Hello, file!");
 * String content = store.read();
 * System.out.println(content);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Hello, file!
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-25
 */
public class FileStore implements Store {

    /**
     * Поле {@code path} содержит путь к файлу,
     * в котором будет производиться сохранение и чтение данных.
     */
    private String path;

    /**
     * Конструктор {@code FileStore()}.
     *
     * <p>Используется, если путь будет установлен позднее вручную.</p>
     */
    public FileStore() { }

    /**
     * Конструктор {@code FileStore(String path)}.
     *
     * <p>Создает экземпляр {@code FileStore} с заданным путем к файлу.</p>
     *
     * @param path Путь к файлу для сохранения и чтения данных.
     */
    public FileStore(String path) {
        this.path = path;
    }

    /**
     * Метод {@code save(String data)} сохраняет переданные данные в файл по указанному пути.
     *
     * <p>Если файл не существует, он будет создан. При повторном вызове данные могут быть перезаписаны.</p>
     *
     * @param data Строка данных, которую необходимо сохранить.
     */
    public void save(String data) {
    }

    /**
     * Метод {@code read()} считывает данные из файла по пути {@code path}.
     *
     * <p>Если файл существует и доступен для чтения, возвращает его содержимое.</p>
     *
     * @return Строка, содержащая данные из файла, либо {@code null}, если произошла ошибка чтения.
     */
    public String read() {
        return null;
    }
}