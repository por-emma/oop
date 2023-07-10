package bai02;

public class StringData {
    private String data;
    private int noChar = 0;

    public StringData(String data, int noChar) {
        this.data = data;
        this.noChar = noChar;
    }

    public String getData() {
        return data;
    }

    public int getNoChar() {
        return noChar;
    }
}
