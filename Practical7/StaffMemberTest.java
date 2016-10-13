public class StaffMemberTest{
	public static void main(String[] args){
		StaffMember[] workers = new StaffMember[8]; 
		workers[0] = new Executive ("Sam", "123 Main Line", "555-0469",
"123-45-6789", 2423.07);
		workers[1] = new Employee ("Carla", "456 Off Line", "555-0101",
"987-65-4321", 1246.15);
		workers[2] = new Employee ("Woody", "789 Off Rocker", "555-0000",
"010-20-3040", 1169.23);
		workers[3] = new Hourly ("Diane", "678 Fifth Ave.", "555-0690",
"958-47-3625", 10.55);
		workers[4] = new Volunteer ("Norm", "987 Suds Blvd.", "555-8374");
		workers[5] = new Volunteer ("Cliff", "321 Duds Lane", "555-7282");
		((Executive)workers[0]).awardBonus(500.00);
		((Hourly)workers[3]).addHours(40);
		workers[6] = new Commission("Amy", "35 Ninth Str.","555-5241","694-45-3845",6.25,0.2);
		workers[7] = new Commission("Jon", "46th Ave.","555-4652","334-43-8526",9.75,0.15);
		System.out.print(workers[0].pay());
	}
}