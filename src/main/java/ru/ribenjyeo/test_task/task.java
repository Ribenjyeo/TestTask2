package ru.ribenjyeo.test_task;

import ru.ribenjyeo.test_task.dto.FileDto;
import ru.ribenjyeo.test_task.service.FileService;

import java.io.IOException;

public class task {
    // Константы
    private final static long count_string = Runtime.getRuntime ().freeMemory ();
    private final static int min_length = 1;
    private final static int max_length = 20;

    public static void main(String[] args) throws IOException {
        FileDto file = new FileDto (count_string, min_length,  max_length);
        FileService fileService = new FileService ();

        long start = System.currentTimeMillis ();

        fileService.createFile (file);

        long time = System.currentTimeMillis () - start;
        System.out.println ("Время выполнения записи файла = " + time / 1000 + " секунд");

        long start2 = System.currentTimeMillis ();

        fileService.sortFile (file);

        long time2 = System.currentTimeMillis () - start2;
        System.out.println ("Время выполнения сортировки файла = " + time2 / 1000 + " секунд");
    }

}
