package com.example.collection.list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MyArrayListTest {

    private MyArrayList<String> stringList;
    private MyArrayList<Integer> intList;

    @BeforeEach
    void seUp() {
        stringList = new MyArrayList<>();
        intList = new MyArrayList<>();
    }

    @Test
    void add_size_get() {
        assertThat(stringList.add("test")).isTrue();
        assertThat(stringList.size()).isEqualTo(1);
        assertThat(stringList.get(0)).isEqualTo("test");
    }


    @Test
    void add_x_3() {
        stringList.add("test1");
        stringList.add("test2");
        stringList.add("test3");

        assertThat(stringList.size()).isEqualTo(3);
        assertThat(stringList.get(0)).isEqualTo("test1");
        assertThat(stringList.get(1)).isEqualTo("test2");
        assertThat(stringList.get(2)).isEqualTo("test3");
    }

    @Test
    void remove() {
        stringList.add("test0");
        stringList.add("test1");
        stringList.add("test2");
        stringList.add("test3");
        stringList.add("test4");
        stringList.add("test5");

        assertThat(stringList.get(4)).isEqualTo("test4");

        assertThat(stringList.remove(4)).isEqualTo("test4");
        assertThat(stringList.size()).isEqualTo(5);

        assertThat(stringList.get(4)).isEqualTo("test5");
    }

    @Test
    void contains() {
        stringList.add("test0");
        stringList.add("test1");
        stringList.add("test2");
        stringList.add("test3");
        stringList.add("test4");

        assertThat(stringList.contains("test3")).isTrue();
        assertThat(stringList.contains("test100")).isFalse();

        intList.add(1);
        intList.add(2);
        intList.add(3);

        assertThat(intList.contains(3)).isTrue();
    }

    @Test
    void indexOf() {
        stringList.add("test0");
        stringList.add("test1");
        stringList.add("test2");

        assertThat(stringList.indexOf("test0")).isEqualTo(0);
        assertThat(stringList.indexOf("test1")).isEqualTo(1);
        assertThat(stringList.indexOf("test2")).isEqualTo(2);
        assertThat(stringList.indexOf("test100")).isEqualTo(-1);
    }

    @Test
    void clear() {

    }
}