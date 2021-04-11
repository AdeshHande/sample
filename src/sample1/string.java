package sample1;

public class string {
	public static void main(String[] args) {
		int ar[]= {15,62,83,18,10,49};
		for(int i=0;i<=ar.length-1;i++) {
			for(int j=i+1;j<=ar.length-1;j++) {
				if(ar[i]>ar[j]) {
					int k=ar[i];
					ar[i]=ar[j];
					ar[j]=k;
				}
			}
		}
		System.out.println(ar[ar.length-3]);
		
		
		
		
		
		
		
	}
	}