package ru.ribenjyeo.test_task.repo;

import ru.ribenjyeo.test_task.dto.FileDto;

import java.io.IOException;

public interface FileRepo {
    void createFile (FileDto file) throws IOException;
    void sortFile(FileDto file) throws IOException;
}
