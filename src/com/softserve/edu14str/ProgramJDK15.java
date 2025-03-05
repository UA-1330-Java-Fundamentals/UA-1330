package com.softserve.edu14str;

public class ProgramJDK15 {
    public static void main(String[] args) {
        String s = "ABCD";
        String text = """
                    <Html>
                        <body>
                            <p>Hello, world %s</p>
                        </body>
                    </Html>
                """.formatted(s);
        System.out.println("Result:\n" + text);
    }
}