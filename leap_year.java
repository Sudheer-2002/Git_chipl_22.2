class Leapyear{
	public static void main(String[] args){
		int year = 2023;
		//int month = 5;
		int days;
		if(year%4==0 || year%400==0 && year%100==0){
				days = 29;
				System.out.println("Leap year");
				System.out.println("Number of the days in the given month are " +days);
}
				else{
					days = 28;
					System.out.println("Not a Leap year");
					System.out.println("Number of the days in the given month are " +days);

}
}
}		