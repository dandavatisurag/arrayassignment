package day4;

import java.util.Arrays;

public class arrmerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};

        int aLen = a1.length;
        int bLen = a2.length;
        int result[] = new int[aLen + bLen];

        System.arraycopy(a1, 0, result, 0, aLen);
        System.arraycopy(a2, 0, result, aLen, bLen);

        System.out.println("Merged array" + Arrays.toString(result));
	}

}
