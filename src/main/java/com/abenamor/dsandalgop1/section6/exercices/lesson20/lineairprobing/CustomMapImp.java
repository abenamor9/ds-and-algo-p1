package com.abenamor.dsandalgop1.section6.exercices.lesson20.lineairprobing;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author abenamor on 13/04/2020
 */
public class CustomMapImp {
    private class CustomEntry {
        private Integer key;
        private String value;

        public CustomEntry(Integer key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", CustomEntry.class.getSimpleName() + "[", "]")
                    .add("key=" + key)
                    .add("value='" + value + "'")
                    .toString();
        }
    }

    private CustomEntry[] entries;

    public CustomMapImp(int capacity) {
        entries = new CustomEntry[capacity];
    }

    public String put(Integer key, String value) {

        int hIndex = hash(key);
        Integer finalHIndex = null;

        if (entries[hIndex] == null) {
            entries[hIndex] = new CustomEntry(key, value);
        } else {
            if(existKey(key)){
                entries[hIndex].value = value;
            } else {
                finalHIndex = lineairProbing(hIndex);
                if (finalHIndex == null) {
                    throw new IllegalStateException("Array is full");
                }
                entries[finalHIndex] = new CustomEntry(key,value);
            }

        }
        return value;
    }



    public String get(Integer key) {
        for (CustomEntry curElem: entries) {
            if (curElem.key.equals(key)) {
                return curElem.value;
            }
        }
        return null;
    }

    public String remove(Integer key) {
        String result = null;
        String value = get(key);

        for (int i=0; i< entries.length; i++) {
            if (entries[i]!= null && entries[i].key == key && entries[i].value == value) {
                entries[i] = null;
            }
        }

        return value;
    }

    private boolean existKey(Integer key) {
        for (CustomEntry elem: entries) {
            if (elem != null && elem.key.equals(key)) {
                return true;
            }
        }
        return false;
    }
    private Integer lineairProbing(int hIndex) {
        for (int i=hIndex ; i<entries.length; i++) {
            if (entries[i] == null) {
                return i;
            }
        }
        return null;
    }


    private int hash(int key) {
        return key % entries.length;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomMapImp.class.getSimpleName() + "[", "]")
                .add("entries=" + Arrays.toString(entries))
                .toString();
    }
}
