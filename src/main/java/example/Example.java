package example;

import com.google.common.base.Joiner;

private class Example {

    public static String join(String... args) {
        System.out.println("Hey");
        return Joiner.on(' ').join(args);
    }

}
