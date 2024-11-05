class Insurance{
	public static void main(String[] args){
		String health = "excellent", lives = "city", gender = "male";
		int age = 30;
		double policy = 300000;
		if(health == "excellent" && lives == "city" && age<=35 && age>=25){
			if(gender == "male" && policy <= 200000){
				double premium = (policy/1000)*4;
				System.out.println("Person is insured. Premium is 4 rupees per thousand and max insurance money is 2 lacs per a policy year.");
				System.out.println("The premium is " +premium);
				}
			else if(gender == "female" && policy <= 100000){
				double premium = (policy/1000)*3;
				System.out.println("Person is insured. Premium is 3 rupees per thousand and max insurance money is 1 lacs per a policy year.");
				System.out.println("The premium is " +premium);
				}
			else{
				System.out.println("Give correct gender or correct policy money.");
			}}
		else if(health == "poor" && lives == "village" && age<=35 && age>=25 && gender == "male" && policy <= 10000){
				double premium = (policy/1000)*6;
				System.out.println("Person is insured. Premium is 6 rupees per thousand and max insurance money is 10,000 per a policy year.");
				System.out.println("The premium is " +premium);
				}
		else{
				System.out.println("Person not insured");
		}
	
}
}