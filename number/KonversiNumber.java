
public class KonversiNumber {

    public static void main(String[] args) {
        byte iniByte = 127;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        System.out.println("byte: " + iniByte);
        System.out.println("short: " + iniShort);
        System.out.println("int: " + iniInt);
        System.out.println("long: " + iniLong);

        byte iniByte2 = (byte) iniByte;
        System.out.println("byte: " + iniByte2);
    }
}
