public class Array{

	public static void main (String args[]){
	
		String[] s1,s = {"volvo","BMW","Mercedez"};
		System.out.print(s[1]+"\n");
		s1 = new String[9];
		s1[0] = "Volvo";
		s1[1] = "TATA";
		s1[2] = "Mahindra";
		// System.out.println(s1[0]+" "+s1[1]+" "+s1[2]);
		// System.out.println(s.length);
		// System.out.println(s1.length);
		//for (int i = 0 ;i < s.length ;i++)
			//System.out.println(s[i]);
		for (String car : s)
			System.out.println(car);
	}
}