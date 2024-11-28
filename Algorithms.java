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
        double mean = mean();
        System.out.println(odds);
      
        System.out.println(evens);
      
        System.out.println(twodigits);
        
        System.out.println(morethan500);
        
        System.out.println(greatestnum);
        
        System.out.println(leastnum);

        System.out.println(sum);

        System.out.println(mean);
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
    public static double mean() throws FileNotFoundException{
        s = new Scanner(f);
        double c = 0.0; 
        int count=0;
        while (s.hasNext()) {
            c+=s.nextInt();
                count ++;
        }
        double result = c/count;
        return result;
       
    }
    public static double mode() throws FileNotFoundException{
        s = new Scanner(f);
        int [] [] nums ={};
        int i = 0;
        while (s.hasNext()) {
        i=s.nextnum();
        if (nextnum>nums[i]){
            nums[i+1]=nextnum;
        }
        }
        int mode= 0;
        int great = 0;
        int num= 0;
        for (int h= 0; h< nums[].length()-1;h++){
            int mcount=0;
            if (nums[h]==nums[h+1]){
                mcount++;
                if (mcount>great){
                    great= mcount ;
                    mode= nums[h];
                }
            }
            

        }
        return num;
       
    }

 
}