
public class SwitchStatetment {

    public static void main(String[] args) {

        char nilai = 'A';
        // old version -> below java 14
        switch (nilai) {
            case 'A':
                System.out.println("Wow, Anda lulus dengan baik!");
                break;
            case 'B':
            case 'C':
                System.out.println("Anda lulus");
                break;
            case 'D':
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin Anda salah jurusan");
                break;
        }

        // new version -> switch lambda
        var nilai2 = 'B';
        switch (nilai2) {
            case 'A' ->
                System.out.println("Wow, Anda lulus dengan baik!");
            case 'B', 'C' ->
                System.out.println("Anda lulus");
            case 'D' ->
                System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Mungkin Anda salah jurusan");
            }
        }

        // yield
        var nilai3 = 'A';
        String message = switch (nilai3) {
            case 'A':
                yield "Wow, Anda lulus dengan baik!";
            case 'B', 'C':
                yield "Anda lulus";
            case 'D':
                yield "Anda tidak lulus";
            default: {
                yield "Mungkin Anda salah jurusan";
            }
        };
        System.out.println(message);
    }
}
