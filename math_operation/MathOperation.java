
public class MathOperation {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println("Hasil penjumlahan: " + c);
        int d = a - b;
        System.out.println("Hasil pengurangan: " + d);
        int e = a * b;
        System.out.println("Hasil perkalian: " + e);
        int f = a / b;
        System.out.println("Hasil pembagian: " + f);
        int g = a % b;
        System.out.println("Hasil modulus: " + g);

        // augmented assignment
        int h = 10;
        h += 5;
        System.out.println("Hasil augmented assignment: " + h);
        // unary operator
        int i = 10;
        i++;
        System.out.println("Hasil unary operator: " + i);
        // relational operator
        int j = 10;
        int k = 5;
        boolean l = j > k;
        System.out.println("Hasil relational operator: " + !l);
        System.out.println("Hasil relational operator: " + l);
    }
}
