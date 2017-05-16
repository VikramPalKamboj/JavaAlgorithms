package leetCode1stMay2017;

public class Solutions {

	public static int a=0;
	public static void main(String[] args) {
		
		int[] S = {-1, 0, 1, 2, -1, -4};
		
		for(int i=0;i<S.length;i++){
			for(int j=i+1;j<S.length;j++){
				for(int k=j+1;k<S.length;k++){
					int result=S[i]+S[j]+S[k];
					if(result==0){
						a++;
					}
				}
				
			}
		}
		System.out.println(a);
	}

}
