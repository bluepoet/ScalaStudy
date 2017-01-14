package net.bluepoet.exercise.ext;

/**
 * Created by Mac on 2017. 1. 14..
 */
public class FooImpl {
    public static void main(String[] args) {
        System.out.println(Foo.a);
        System.out.println(new FooClass().getA());
    }
}

class FooClass implements Foo {
    private int a = 2;

    public int getA() {
        return a;
    }
}