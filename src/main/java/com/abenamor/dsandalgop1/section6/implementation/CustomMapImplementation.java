package com.abenamor.dsandalgop1.section6.implementation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringJoiner;

/**
 * @author abenamor on 12/04/2020
 */
public class CustomMapImplementation {
    private class  CustomEntry {
        Integer key;
        String value;

        public CustomEntry(Integer keyInp, String valueInp){
            this.key = keyInp;
            this.value = valueInp;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", CustomEntry.class.getSimpleName() + "[", "]")
                    .add("key=" + key)
                    .add("value='" + value + "'")
                    .toString();
        }
    }

    private LinkedList<CustomEntry>[] keysEntries;

    public CustomMapImplementation( int capacity) {
        keysEntries = new LinkedList[capacity];
    }

    public String put(Integer key, String value) {
        Integer hIndex = hash(key);

        if (keysEntries[hIndex] == null)
            keysEntries[hIndex] = new LinkedList<>();

        LinkedList<CustomEntry> buckets = keysEntries[hIndex];
        for (CustomEntry elem: buckets) {
            if (elem.key.equals(key)) {
                elem.value = value;
                return value;
            }
        }
        buckets.addLast(new CustomEntry(key, value));

        return value;
    }

    public String get(Integer key) {
        String result = null;
        Integer hIndex = hash(key);
        LinkedList<CustomEntry> hIndexEntry = keysEntries[hIndex];
        if (hIndexEntry == null) {
            return null;
        }
        for (CustomEntry curElem: hIndexEntry) {
            if (curElem.key.equals(key)) {
                result = curElem.value;
                break;
            }
        }
        return result;
    }

    public String remove(Integer key) {
        String result = null;
        Integer hIndex = hash(key);
        LinkedList<CustomEntry> hIndexEntry = keysEntries[hIndex];
        if (hIndexEntry == null) {
            return null;
        }

        for (CustomEntry curElem: hIndexEntry) {
            if (curElem.key.equals(key)) {
                result = curElem.value;
                hIndexEntry.remove(curElem);
            }
        }

        return result;
    }

    private Integer hash(Integer key) {
        return key % (keysEntries.length);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomMapImplementation.class.getSimpleName() + "[", "]")
                .add("keysEntries=" + Arrays.toString(keysEntries))
                .toString();
    }
}


