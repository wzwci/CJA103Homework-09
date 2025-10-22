package hw2;

public class hw2 {
	public static void main(String[]args) {
		int sum=0;
		for(int i=1;i<=1000;i++) {
			if(i%2==0) {
//				記得+if
				sum+= i;
			}
		}
		System.out.println(sum);
		
		System.out.println("===");
        int sum2=1;
		for(int j=1;j<=10;j++) {
			sum2*= j;
		}
		System.out.println(sum2);
		
		System.out.println("===");
		int sum3=1;
		int q=1;
		while(q<=10) {
			sum3*= q;
			q++;
		}
		System.out.println(sum3);
		
		System.out.println("===");
		
		for(int a=1;a<=10;a++) {
			System.out.print(a*a);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("===");
		
		int sum4=1;
		for(int z=1;z<=49;z++) {
			int b=z/10;
			int f=z%10;
			if(b==4||f==4) {
				continue;
			}
			System.out.print(z+" ");
			sum4++;
		}
		System.out.println();
		System.out.println("總共有"+sum4+'個');
		System.out.println("===");
		
		for(int w=10;w>=1;w--) {
			for(int s=1;s<=w;s++) {
				System.out.print(s+" ");
			}
			System.out.println();
		}
			System.out.println("===");
	
			for(int e=1;e<=6;e++) {
				char ch=(char)('A'+e-1);
					for(int d=1;d<=e;d++) {
						System.out.print(ch);
					}
				System.out.println();
			}
	}

}
