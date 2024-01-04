package for문;

public class Ex06곱셈누적77 {

	public static void main(String[] args) {

		// (77*1)+(76*2)+(75*3)...+(1*77)을 계산하여 결과 출력
		int sum = 0;
		int num = 1;
		for(int i = 77; i > 0; i--) { // i : 77 --> 1
			sum += (i*num); // num : 1 -->77
			num++;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
	}

}
