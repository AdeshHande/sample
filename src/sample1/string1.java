package sample1;

public class string1 {
	public static void main(String[] args) {
		String a="adesh";
		/*String[] parts = a.split(" ");
	for(int i=0;i<=parts.length-1;i++) {
			char[] ch = parts[i].toCharArray();
			for(int j=0;j<=ch.length-1;j++) {
				ch[0]=Character.toUpperCase(ch[0]);
				System.out.print(ch[j]+"");
			}
			System.out.println(" ");
		}*/
		String b=a.substring(0, 1).toUpperCase()+a.substring(1);
	    System.out.println(b);
		
		
		
		
		
	}
	

}
