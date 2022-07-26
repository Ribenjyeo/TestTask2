package ru.ribenjyeo.test_task;

import ru.ribenjyeo.test_task.service.FileService;

import java.io.IOException;

public class Task {
    // Константы
    private final static long STRING_COUNT = Runtime.getRuntime ().freeMemory ();
    private final static int MIN_LENGTH = 1;
    private final static int MAX_LENGTH = 20;

    public static void main(String[] args) throws IOException {
        FileService fileService = new FileService ();

        long start = System.currentTimeMillis ();

        fileService.createFile (STRING_COUNT, MIN_LENGTH, MAX_LENGTH);

        long time = System.currentTimeMillis () - start;
        System.out.println ("Время выполнения записи файла = " + time / 1000 + " секунд");

        long start2 = System.currentTimeMillis ();

        fileService.sortFile ();

        long time2 = System.currentTimeMillis () - start2;
        System.out.println ("Время выполнения сортировки файла = " + time2 / 1000 + " секунд");
    }

}
