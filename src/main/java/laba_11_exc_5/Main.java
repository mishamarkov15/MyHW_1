package laba_11_exc_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static long measureArrayListAppend(long size) {
        ArrayList<Integer> data = new ArrayList<Integer>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; ++i) {
            data.add(i);
        }
        return System.currentTimeMillis() - start;
    }

    public static long measureLinkedListAppend(long size) {
        LinkedList<Integer> data = new LinkedList<Integer>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; ++i) {
            data.add(i);
        }
        return System.currentTimeMillis() - start;
    }

    public static long measureArrayListInsert(long size) {
        ArrayList<Integer> data = new ArrayList<Integer>();
        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; ++i) {
            if (i == 0) {
                data.add(i);
            } else {
                data.add(Math.abs(random.nextInt() % i), i);
            }
        }
        return System.currentTimeMillis() - start;
    }

    public static long measureLinkedListInsert(long size) {
        LinkedList<Integer> data = new LinkedList<Integer>();
        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; ++i) {
            if (i == 0) {
                data.add(i);
            } else {
                data.add(Math.abs(random.nextInt() % i), i);
            }
        }
        return System.currentTimeMillis() - start;
    }

    public static long measureArrayListRemove(int size) {
        ArrayList<Integer> data = new ArrayList<Integer>(Collections.nCopies(size, 0));
        Random random = new Random();
        long start = System.currentTimeMillis();
        while (data.size() > 0) {
            data.remove(Math.abs(random.nextInt() % data.size()));
        }
        return System.currentTimeMillis() - start;
    }

    public static long measureLinkedListRemove(int size) {
        LinkedList<Integer> data = new LinkedList<Integer>(Collections.nCopies(size, 0));
        Random random = new Random();
        long start = System.currentTimeMillis();
        while (data.size() > 0) {
            data.remove(Math.abs(random.nextInt() % data.size()));
        }
        return System.currentTimeMillis() - start;
    }

    public static long measureArrayListFind(int size) {
        Random random = new Random();
        ArrayList<Integer> data = new ArrayList<Integer>(Collections.nCopies(size, random.nextInt() % 50));
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; ++i) {
            data.indexOf(random.nextInt() % 100);
        }
        return System.currentTimeMillis() - start;
    }

    public static long measureLinkedListFind(int size) {
        Random random = new Random();
        LinkedList<Integer> data = new LinkedList<Integer>(Collections.nCopies(size, random.nextInt() % 50));
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; ++i) {
            data.indexOf(random.nextInt() % 100);
        }
        return System.currentTimeMillis() - start;
    }

    public static void main(String[] args) {
        int n = 100000;
        System.out.printf("ArrayList<> append: %d ms\n", measureArrayListAppend(n));
        System.out.printf("LinkedList<> append: %d ms\n\n", measureLinkedListAppend(n));

        System.out.printf("ArrayList<> insert: %d ms\n", measureArrayListInsert(n));
        System.out.printf("LinkedList<> insert: %d ms\n\n", measureLinkedListInsert(n));

        System.out.printf("ArrayList<> remove: %d ms\n", measureArrayListInsert(n));
        System.out.printf("LinkedList<> remove: %d ms\n\n", measureLinkedListInsert(n));

        System.out.printf("ArrayList<> find: %d ms\n", measureArrayListFind(n));
        System.out.printf("LinkedList<> find: %d ms\n\n", measureLinkedListFind(n));
    }

}
