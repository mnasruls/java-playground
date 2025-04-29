
public class IfStatement {

    public static void main(String[] args) {
        byte nilai = 79;
        if (nilai >= 80) {
            System.out.println("Selamat anda lulus");
        } else if (nilai >= 75) {
            System.out.println("Selamat anda lulus dengan nilai pas - pasan wkwkwkwkk");
        } else {
            System.out.println("Maaf anda tidak lulus");
        }

        // ternary operator
        String hasil = nilai >= 80 ? "Selamat anda lulus" : "Maaf anda tidak lulus";
        System.out.println(hasil);
    }
}
