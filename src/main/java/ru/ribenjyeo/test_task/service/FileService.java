package ru.ribenjyeo.test_task.service;

import com.github.davidmoten.bigsorter.Sorter;
import org.apache.commons.lang3.RandomStringUtils;
import ru.ribenjyeo.test_task.dto.FileDto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileService{

    public void createFile(long stringCount, int maxLength, int minLength ) throws IOException {
        //Создание файла
        FileDto file = new FileDto (stringCount, maxLength, minLength);
        // Запись файла
        try (BufferedWriter br = new BufferedWriter (new FileWriter ("inputFile.txt"))) {
            for (int i = 0; i < file.getCount_string (); i++) {
                // Заполняем строку рандомными символами c помощью библиотеки Apache.Commons
                String s = RandomStringUtils.randomAlphanumeric (file.getMinLength (), file.getMaxLength ());
                br.write (s);
                br.newLine ();
            }
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }

    // Сортировка файла
    public void sortFile() throws IOException {
        File input = new File ("inputFile.txt");
        File output = new File ("outputFile.txt");
        // Сортировка файла с помощью библиотеки big-sorter
        Sorter
                .serializerLinesUtf8 ()
                .comparator (String::compareTo)
                .input (input)
                .output (output)
                .sort ();
    }

}
