
public class Number {

    public static void main(String[] args) {
        byte iniByte = 127;
        short iniShort = 32767;
        int iniInt = 2147483647;
        long iniLong = 9223372036854775807L;
        System.out.println("byte: " + iniByte);
        System.out.println("short: " + iniShort);
        System.out.println("int: " + iniInt);
        System.out.println("long: " + iniLong);

        float iniFloat = 3.14F;
        double iniDouble = 3.141592653589793;
        System.out.println("float: " + iniFloat);
        System.out.println("double: " + iniDouble);

        int decimal = 10;
        int binary = 0b1010;
        int octal = 012;
        int hexadecimal = 0x12;
        System.out.println("decimal: " + decimal);
        System.out.println("binary: " + binary);
        System.out.println("octal: " + octal);
        System.out.println("hexadecimal: " + hexadecimal);

        long balance = 1_000_000_000_000L;
        int sum = 100_000_000;
        System.out.println("balance: " + balance);
        System.out.println("sum: " + sum);

    }
}
