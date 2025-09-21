package Problem2;

public class PrimesRewritten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nvalues = 50;
		outerloop:
			for (int i = 2; i <= nvalues; i++)	{ 
				for (int j = 2; j * j <= i; j++) {
					if(i % j == 0) {
						continue outerloop;
					}
				}
				System.out.println(i);
			}
	}

}
