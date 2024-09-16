import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {

        Scanner reader = new Scanner(System.in);

        System.out.print("Magasság:" );
        String magstr = reader.nextLine();
        Double mag = Double.parseDouble(magstr);

        System.out.print("Az egyik oldal:" );
        String egystr = reader.nextLine();
        Double egy = Double.parseDouble(egystr);

        Double Eredmenyter = 1/3 * (Math.pow(egy, 2) * mag);
        System.out.println("A négyzet területe:" + Eredmenyter);
        Double Eredmenyterfog = 1/3 * (Eredmenyter * mag);
        System.out.println("A gúla térfogata: " + Eredmenyterfog );

        reader.close();
    } 
}
