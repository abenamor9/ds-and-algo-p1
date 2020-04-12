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
        var backet = getOrCreateBucket(key);
       var entry = getEntry(key);
       if (entry != null) {
           entry.value = value;
           return value;
       }


       backet.addLast(new CustomEntry(key, value));

        return value;
    }

    public String get(Integer key) {
        var entry = getEntry(key);
        return entry == null ? null : entry.value;
    }

    public String remove(Integer key) {
        var entry = getEntry(key);
        if (entry == null)
            return null;

        getBucket(key).remove(entry);

        return entry.value;
    }

    private CustomEntry getEntry(Integer key) {
        var buckets = getBucket(key);
        if (buckets != null) {
            for (var entry: buckets) {
                if(entry.key.equals(key))
                    return entry;
            }
        }

        return null;
    }

    private LinkedList<CustomEntry> getBucket(Integer key) {
        return keysEntries[hash(key)];
    }

    private LinkedList<CustomEntry> getOrCreateBucket(Integer key) {
        var hIndex = hash(key);
        var bucket = keysEntries[hIndex];
        if (bucket == null ) {
            keysEntries[hIndex] = new LinkedList<>();
        }

        return bucket;
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


