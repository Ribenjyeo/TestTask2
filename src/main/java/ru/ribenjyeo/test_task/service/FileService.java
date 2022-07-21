package ru.ribenjyeo.test_task.service;

import com.github.davidmoten.bigsorter.Sorter;
import org.apache.commons.lang3.RandomStringUtils;
import ru.ribenjyeo.test_task.dto.FileDto;
import ru.ribenjyeo.test_task.repo.FileRepo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileService implements FileRepo {

    @Override
    public void createFile(FileDto file) throws IOException {
        // Запись файла
        try (BufferedWriter br = new BufferedWriter (new FileWriter ("inputFile.txt"))) {
            for (int i = 0; i < file.getCount_string (); i++) {
                // Заполняем строку рандомными символами
                String s = RandomStringUtils.randomAlphanumeric (file.getMin_length (), file.getMax_length ());
                br.write (s);
                br.newLine ();
            }
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }

    @Override
    public void sortFile(FileDto file) throws IOException {
        File input = new File ("inputFile.txt");
        File output = new File ("outputFile.txt");

        Sorter
                .serializerLinesUtf8 ()
                .comparator (String::compareTo)
                .input (input)
                .output (output)
                .sort ();
    }

}
