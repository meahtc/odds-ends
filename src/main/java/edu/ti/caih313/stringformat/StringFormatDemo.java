package edu.ti.caih313.stringformat;

public class StringFormatDemo {
    public static void main(String... argv) {
        String hello = "Hello, world.";

        System.out.printf("Plain: '%s'%n", hello);
        System.out.printf("Upper case: '%S'%n", hello);
        System.out.printf("Right justified in 30 char field: '%30s'%n", hello);
        System.out.printf("Left justified in 30 char field: '%-30s'%n", hello);
        System.out.printf("Max of 5 chars: '%.5s'%n", hello);
        System.out.printf("Max of 5 chars in 20 wide: '%20.5s'%n", hello);

        int positiveMillion = 1000000;
        int negativeMillion = -1000000;
        System.out.printf("Plain '%d' '%d'%n", positiveMillion, negativeMillion);
        System.out.printf("Fancy '%,d' '%,d'%n", positiveMillion, negativeMillion);
        System.out.printf("With sign '%+,d' '%+,d'%n", positiveMillion, negativeMillion);

        int positiveTen = 10;
        int negativeTen = -10;
        System.out.printf("Plain '%d' '%d'%n", positiveTen, negativeTen);
        System.out.printf("Five chars wide '%5d' '%5d'%n", positiveTen, negativeTen);
        System.out.printf("With zero fill '%05d' '%05d'%n", positiveTen, negativeTen);
        System.out.printf("Padded and signed '%+05d' '%+05d'%n", positiveTen, negativeTen);

        double thousandPi = Math.PI * 1000.0;
        System.out.printf("Plain '%f'%n", thousandPi);
        System.out.printf("Ten wide '%10f'%n", thousandPi);
        System.out.printf("Five decimal places '%.5f'%n", thousandPi);
        System.out.printf("Ten wide and three decimal places '%10.3f'%n", thousandPi);
    }
}
