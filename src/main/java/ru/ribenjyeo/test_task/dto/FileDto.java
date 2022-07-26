package ru.ribenjyeo.test_task.dto;

public class FileDto {
    private long stringCount;
    private int maxLength;
    private int minLength;

    public FileDto(long stringCount, int maxLength, int minLength) {
        this.stringCount = stringCount;
        this.maxLength = maxLength;
        this.minLength = minLength;
    }

    public Long getCount_string() {
        return stringCount;
    }

    public void setCount_string(Long count_string) {
        this.stringCount = count_string;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }
}
