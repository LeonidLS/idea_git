import java.util.ArrayList;

public class ArTest {

    String brand;

    ArTest(String b){
        this.brand=b;
    }

    ArrayList<ArTest> cats = new ArrayList<ArTest>();

    public static void main(String[] args) {
        ArTest at = new ArTest("BMW");
        ArTest at1 = new ArTest("Audi");
        ArTest at2 = new ArTest("Mercedes");

        at.cats.add(at);
        at.cats.add(at1);
        at.cats.add(at2);

        at.cats.forEach(n->
        {
            System.out.println(n.brand);
        });

    }
}

