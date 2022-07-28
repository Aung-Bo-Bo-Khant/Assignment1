package demo;

public class ArrayMin {
    public static void main(String[] args) {
        int[] arrayOfInts={ 2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};

        min(arrayOfInts);
        System.out.println("Min: "+min(arrayOfInts));

    }

    public static int min(int[] arrayOfInts){
        int min=arrayOfInts[0];
        int i=1;

        while(i< arrayOfInts.length) {
            if (arrayOfInts[i] < min) {
                min = arrayOfInts[i];
            }
            i++;
        }
        return min;
    }
}



