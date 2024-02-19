package Task2;

public class Complex {
    private int real;
    private int imaginary;

    // Primul constructor care primește două valori int pentru partea reală și partea imaginară
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {
        this(0, 0);

    // Copy constructor pentru a crea un nou obiect Task2.Complex bazat pe un alt obiect Task2.Complex dat ca parametru
    public Complex(Complex other) {
        this.real = other.real;
        this.imaginary = other.imaginary;
    }

    // Getter și setter pentru partea reală
    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    // Getter și setter pentru partea imaginară
    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    // Metoda pentru adunarea cu un alt număr complex
    public void addWithComplex(Complex other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
    }

    // Metoda pentru afișarea numărului complex
    public void showNumber() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        // Exemplu de utilizare
        Complex number1 = new Complex(3, 4);
        Complex number2 = new Complex(2, 5);

        System.out.print("Numărul 1: ");
        number1.showNumber(); // Afiseaza: 3 + 4i

        System.out.print("Numărul 2: ");
        number2.showNumber(); // Afiseaza: 2 + 5i

        number1.addWithComplex(number2); // Adunarea numerelor complexe
        System.out.print("Suma numerelor: ");
        number1.showNumber(); // Afiseaza: 5 + 9i
    }
}
