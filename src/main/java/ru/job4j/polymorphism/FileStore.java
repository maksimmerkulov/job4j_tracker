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
 * Store store = new FileStore("data.txt");
 * store.save("Hello, world!");
 * String result = store.read();
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Hello, world!
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class FileStore implements Store {

    /**
     * Путь к файлу, в котором будет производиться сохранение и чтение данных.
     */
    private String path;

    /**
     * Создает экземпляр {@code FileStore} без указания пути к файлу.
     *
     * <p>Перед использованием необходимо установить путь к файлу через соответствующий
     * сеттер или напрямую изменить поле {@code path}, если он доступен.</p>
     *
     * @apiNote Использование этого конструктора требует ручной установки пути
     * перед вызовом {@link #save(String)} или {@link #read()}.
     */
    public FileStore() { }

    /**
     * Создает экземпляр {@code FileStore} с заданным путем к файлу.
     *
     * @param path Путь к файлу для сохранения и чтения данных.
     */
    public FileStore(String path) {
        this.path = path;
    }

    /**
     * Сохраняет переданные данные в файл по указанному пути.
     *
     * <p>Если файл не существует, он будет создан. При повторном вызове данные могут быть перезаписаны.</p>
     *
     * @param data Строка данных, которую необходимо сохранить.
     */
    @Override
    public void save(String data) {
    }

    /**
     * Считывает данные из файла по пути {@code path}.
     *
     * <p>Если файл существует и доступен для чтения, возвращает его содержимое.</p>
     *
     * @return Строка, содержащая данные из файла, либо {@code null}, если произошла ошибка чтения.
     */
    @Override
    public String read() {
        return null;
    }
}