public class Main{
	public static void main(String[] args) {
		//1) Գրել ծրագիր, որը կվերադարձնի 2 թվերից մեծի արժեքը։
		int sum1=48;
		int sum2=69;
		if(sum1>sum2) {
			System.out.println(sum1);
		}
		else {
			System.out.println(sum2);
			}
		
		
		//2) Գրել ծրագիր, որը կհաշվի զանգվածի էլեմենտների գումարը։
		int[] gumar= {5,4,4,8};
		int gum=0;
		for(int g=0;g <gumar.length; ++g) {
			gum=gum+gumar[g];
	
		} 
			System.out.println(gum);
		
		
	//3) Գրել ծրագիր, որը կվերադարձնի զանգվածի մեծագույն արժեքը
			int[] arr= {5,6,2,8,1,3,10};
			int max=arr[1];
			for(int i=1; i< arr.length;i++) {
				if(max<arr[i]) {
					max=arr[i];
					
				}
			}
			System.out.println(max);
			
	//4) Գրել ծրագիր, որը կվերադարձնի զանգվածի զույգ էլեմենտների գումարը։
			
			int[] arrtwo={2,9,3,5,6,8,16};
			for(int d=0;d<arrtwo.length;d++) {
				int two=arrtwo[d];
				if(two%2==0) {
					System.out.println(two);
				}
			}
			
			
			
			
	}
	
}
