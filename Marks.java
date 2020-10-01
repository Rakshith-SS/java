class Marks{
	public static void main(String args[]){
		int sub1,sub2,sub3,sub4,sub5;

		sub1 = Integer.parseInt(args[0]);
		sub2 = Integer.parseInt(args[1]);
		sub3 = Integer.parseInt(args[2]);
		sub4 = Integer.parseInt(args[3]);
		sub5 = Integer.parseInt(args[1]);

		double average = (sub1 + sub2 + sub3 + sub4 + sub5)/5;

		if (average <= 50 ){
			System.out.println("C Grade");
		}
		else if (average >50  && average <=75){
			System.out.println("B Grade");
		}
		else {
			System.out.println("A Grade");
		}
	}

}
