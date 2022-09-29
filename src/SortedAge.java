import java.util.Arrays;

public class SortedAge {
    public int[] getSortedAge(int[] ageArray) {
        int n = ageArray.length;
        int temp;
        System.out.println(Arrays.toString(ageArray));
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (ageArray[j] < ageArray[j + 1]) {
                    temp = ageArray[j];
                    ageArray[j] = ageArray[j + 1];
                    ageArray[j + 1] = temp;

                }
            }
        }

        return ageArray;
    }

    public static void main(String[] args) {
int [] ageArray={22,34,33,32,36,27,28};
        SortedAge obj=new SortedAge();
        obj.getSortedAge(ageArray);
        System.out.println(Arrays.toString(ageArray));
    }

}