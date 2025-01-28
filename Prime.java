public class Prime{
	public static void main(String args[]){
		for(int i=2;i<=10;i++){
			boolean b = true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					b = false;
					break;
				}
			}
			if(b){
				System.out.println(i);
			}
		}
	}
}