package com.example.collection.list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MyArrayListTest {

    private MyArrayList<String> list;

    @BeforeEach
    void seUp() {
        list = new MyArrayList<>();
    }

    @Test
    void add_size_get() {
        assertThat(list.add("test")).isTrue();
        assertThat(list.size()).isEqualTo(1);
        assertThat(list.get(0)).isEqualTo("test");
    }


    @Test
    void add_x_3() {
        list.add("test1");
        list.add("test2");
        list.add("test3");

        assertThat(list.size()).isEqualTo(3);
        assertThat(list.get(0)).isEqualTo("test1");
        assertThat(list.get(1)).isEqualTo("test2");
        assertThat(list.get(2)).isEqualTo("test3");
    }

    @Test
    void remove() {
        list.add("test0");
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        list.add("test5");

        assertThat(list.remove(4)).isEqualTo("test4");
        assertThat(list.size()).isEqualTo(5);
    }
}