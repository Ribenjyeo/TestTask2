package ru.ribenjyeo.test_task.dto;

public class FileDto {
    private Long count_string;
    private int max_length;
    private int min_length;

    public FileDto(Long count_string, int min_length, int max_length) {
        this.count_string = count_string;
        this.min_length = min_length;
        this.max_length = max_length;
    }

    public Long getCount_string() {
        return count_string;
    }

    public void setCount_string(Long count_string) {
        this.count_string = count_string;
    }

    public int getMax_length() {
        return max_length;
    }

    public void setMax_length(int max_length) {
        this.max_length = max_length;
    }

    public int getMin_length() {
        return min_length;
    }

    public void setMin_length(int min_length) {
        this.min_length = min_length;
    }
}
