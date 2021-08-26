package example;

import com.google.common.base.Joiner;

public class Example {

    private static String join(String... args) {
        System.out.println("Hey");
        return Joiner.on(' ').join(args);
    }

}
