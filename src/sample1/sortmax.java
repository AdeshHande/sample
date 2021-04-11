package sample1;

public class sortmax {
	public static void main(String[] args) {
		int ar[]= {50,55,93,11,3,55,73,15};
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int max3=Integer.MIN_VALUE;
		for(int i:ar) {
			if(i>max1) {
				max3=max2;
				max2=max1;
				max1=i;
			}
			else if(i>max2) {
				max3=max2;
				max2=i;
			}
			else if(i>max3) {
				max3=i;
			}
		}
		System.out.println(max3);
		
		
		
	}

}
