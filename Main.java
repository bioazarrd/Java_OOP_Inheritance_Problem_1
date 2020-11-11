package D_JavaAdvancedOOP.Lecture2_Inheritances.ExProblem1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        //package-a - person trqbva da e v .src papkata za da mine v judge 100/100

        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        Child child = new Child(name, age);

        System.out.println(child.getName());
        System.out.println(child.getAge());
    }
}