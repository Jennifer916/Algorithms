import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twodigits= twodigits();
        int morethan500= morethan500();
        int greatestnum= greatestnum();
        int leastnum= leastnum();
        int sum = sum();
        System.out.println(odds);
      
        System.out.println(evens);
      
        System.out.println(twodigits);
        
        System.out.println(morethan500);
        
        System.out.println(greatestnum);
        
        System.out.println(leastnum);

        System.out.println(sum);
        s.close();
        
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }
     public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }
     public static int twodigits() throws FileNotFoundException{
        s = new Scanner(f);
        int twodigits = 0;
        while (s.hasNext()) {
            int next = s.nextInt(); 
            if ((next <100) && (next >= 10))
                twodigits++;
        }
        return twodigits;
    }
    public static int morethan500() throws FileNotFoundException{
        s = new Scanner(f);
        int morethan500 = 0;
        while (s.hasNext()) {
            if (s.nextInt() > 500)
                morethan500++;
        }
        return morethan500;
    }
    public static int greatestnum() throws FileNotFoundException{
        s = new Scanner(f);
        int greatestnum = 0;
        while (s.hasNext()) {
            if (s.nextInt() > greatestnum)
                greatestnum = s.nextInt();
        }
        return greatestnum;
    }
     public static int leastnum() throws FileNotFoundException{
        s = new Scanner(f);
        int leastnum = 999999999;
        while (s.hasNext()) {
            if (s.nextInt() < leastnum)
                leastnum = s.nextInt();
        }
        return leastnum;
    }
    public static int sum() throws FileNotFoundException{
        s = new Scanner(f);
        int sum= 0;
        while (s.hasNext()) {
                sum += s.nextInt();
        }
        return sum;
    }
 
}