import java.util.Scanner;

public class Main {
    public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);


        Banana banana=new Banana("Banana",scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),
                new VitaminBanana("   Vitamin A\n" +
                "    Vitamin B1\n" +
                "    Vitamin B2\n" +
                "    Vitamin B6\n" +
                "    Vitamin C"));
        System.out.println(banana);
        Apple apple=new Apple("Apple",scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),
                new VitaminApples("  Vitamin A\n" +
                        "    Vitamin B1\n" +
                        "    Vitamin B2\n" +
                        "    Vitamin B6\n" +
                        "    Vitamin C"));
        System.out.println();
        System.out.println(apple);
        Orange orange=new Orange("orange",scanner.nextLine(),scanner.nextLine(), scanner.nextLine(),
                new VitaminOranges(" Vitamin B1\n" +
                        "        Vitamin B2\n" +
                        "        Vitamin B6\n" +
                        "        Vitamin C\n"+
                        "        Vitamin A\n"));
        System.out.println(orange);
    }
}