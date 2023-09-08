import Buildings.*;
import DataStructures.DSCheck;
import DataStructures.qPack.*;
import DataStructures.sPack.*;
import TwoDShapes.*;
import Vehicle.*;

class Test {
    public static void animalDescriptionAndToStringCheck() {
        System.out.println(Animal.description);
        Animal[] animals = new Animal[3];

        animals[0] = new Animal("bee", "Mike");
        animals[1] = new Animal("tree", "Trike");
        animals[2] = new Animal("lee", "Like");
        for (Animal ob : animals) {
            System.out.println(ob + "\n");
        }

    }


    public static int sum(int... array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    static void bWordsCheck() {
        String str = "Kowalski";
        Backwards line = new Backwards(str);
        line.backward(0);
    }


    public static void innerClassEx5_3() {

        // Inner class
        class ShowBits {
            int numbits;

            //Constructors
            ShowBits(int n) {
                numbits = n;
            }

            //Methods
            void show(long val) {
                long mask = 1;
                mask <<= numbits - 1;

                int spacer = 0;
                for (; mask != 0; mask >>>= 1) {
                    System.out.print((mask & val) != 0 ? "1" : "0");
                    spacer++;
                    if (spacer % 8 == 0) {
                        System.out.print(" ");
                        spacer = 0;
                    }
                }
                System.out.println();
            }
        }

        //Printing binary numbers
        for (byte b = 0; b < 10; b++) {
            ShowBits byteval = new ShowBits(8);
            System.out.print(b + " as a binary number is: ");
            byteval.show(b);
        }
    }


    public static void qSortCheckEx6_3() {
        // QuickSort check
        char[] symbols = {'g', 'f', 'e', 'd', 'c', 'b', 'a', 'f'};
        QuickSort.qsort(symbols);
        for (char i : symbols) {
            System.out.print(i);
        }
    }
}