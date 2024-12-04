
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Algorithms {
    private static File f;
    private static Scanner s;

    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twodigits = twodigits();
        int morethan500 = morethan500();
        int greatestnum = greatestnum();
        int leastnum = leastnum();
        int sum = sum();
        double mean = mean();
        int mode = mode();
        System.out.println(odds);

        System.out.println(evens);

        System.out.println(twodigits);

        System.out.println(morethan500);

        System.out.println(greatestnum);

        System.out.println(leastnum);

        System.out.println(sum);

        System.out.println(mean);

        System.out.println(mode);
        s.close();

    }

    public static int odds() throws FileNotFoundException {
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }

    public static int evens() throws FileNotFoundException {
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }

    public static int twodigits() throws FileNotFoundException {
        s = new Scanner(f);
        int twodigits = 0;
        while (s.hasNext()) {
            int next = s.nextInt();
            if ((next < 100) && (next >= 10))
                twodigits++;
        }
        return twodigits;
    }

    public static int morethan500() throws FileNotFoundException {
        s = new Scanner(f);
        int morethan500 = 0;
        while (s.hasNext()) {
            if (s.nextInt() > 500)
                morethan500++;
        }
        return morethan500;
    }

    public static int greatestnum() throws FileNotFoundException {
        s = new Scanner(f);
        int greatestnum = 0;
        while (s.hasNext()) {
            if (s.nextInt() > greatestnum)
                greatestnum = s.nextInt();
        }
        return greatestnum;
    }

    public static int leastnum() throws FileNotFoundException {
        s = new Scanner(f);
        int leastnum = 999999999;
        while (s.hasNext()) {
            if (s.nextInt() < leastnum)
                leastnum = s.nextInt();
        }
        return leastnum;
    }

    public static int sum() throws FileNotFoundException {
        s = new Scanner(f);
        int sum = 0;
        while (s.hasNext()) {
            sum += s.nextInt();
        }
        return sum;
    }

    public static double mean() throws FileNotFoundException {
        s = new Scanner(f);
        double c = 0.0;
        int count = 0;
        while (s.hasNext()) {
            c += s.nextInt();
            count++;
        }
        double result = c / count;
        return result;

    }

    public static int mode() throws FileNotFoundException {
        s = new Scanner(f);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int maxcount = 0;
        int mode = 0;
        int finalcount = 0;
        int j = 0;
        while (s.hasNext()) {
            int num = s.nextInt();
            nums.add(num);
        }
        for (int k = 0; k < nums.size(); k++) {
            j = 0;
            while (j < nums.size()) {
                if (nums.get(k) == nums.get(j)) {
                    maxcount++;
                }
                j++;
            }
            if (finalcount <= maxcount) {
                finalcount = maxcount;
                mode = nums.get(k);
                //System.out.println(mode);
            }
            
        }
        return mode;
    }
}