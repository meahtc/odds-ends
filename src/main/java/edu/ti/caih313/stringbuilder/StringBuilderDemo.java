package edu.ti.caih313.stringbuilder;

public class StringBuilderDemo {
    public static void main(String... argv) {
        String helloString = "Hello";

        String name = "Shua";
        double age = 5.01;
        int numSiblings = 4;

        System.out.println("With just String manipulation:");
        helloString += ", " + name + "!\n";
        helloString += "I understand you are " + age + " years old.\n";
        helloString += "I also heard that you have " + numSiblings + ".\n";
        System.out.print(helloString);

        System.out.print("\n");
        System.out.println("With StringBuilder:");
        StringBuilder helloBuilder = new StringBuilder("Hello");
        helloBuilder.append(", ").append(name).append("!\n");
        helloBuilder.append("I understand you are ");
        helloBuilder.append(age).append(" years old.\n");
        helloBuilder.append("I also heard that you have ");
        helloBuilder.append(numSiblings).append(".\n");

        System.out.print(helloBuilder.toString());
    }
}
