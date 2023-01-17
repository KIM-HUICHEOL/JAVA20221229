package Ch10;

import java.util.Arrays;

public class C02ArrayCopy {

	public static void main(String[] args) {
		int [] arr1 = {10,20,30};
		//얕은복사(위치값 복사)
		//int [] arr2 = arr1;
		//arr2[0]=300;
		
		//깊은복사(공간형성후 데이터값 복사)
//		int [] arr2 = new int[3];
//		for(int i=0;i<arr1.length;i++) {
//			arr2[i] = arr1[i];
//		}

		//깊은복사
		int [] arr2 = Arrays.copyOf(arr1,arr1.length);
		System.out.println("arr1 : " +arr1);
		System.out.println("arr2 : " +arr2);
		for(int n:arr2) {
			System.out.println(n);
		}
		
		
		for(int n : arr1) {
			System.out.print(n + " ");
		}
		System.out.println();
		

	}

}
