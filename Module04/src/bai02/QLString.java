package bai02;

import java.util.ArrayList;

public class QLString {
    ArrayList<StringData> ds = new ArrayList<>();

    public int count(String data) {
        for (StringData item : ds)
            if (item.getData().equals(data))
                return item.getNoChar();
        int noChar = 0;
        for (int i = 0; i < data.length(); i++)
            noChar++;
        ds.add(new StringData(data, noChar));
        return noChar;
    }
}
