package dogoop;

public class Doginfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog1 = new Dog("Bulldog","large", "light gray", 5);
		
		Dog dog2 = new Dog("Beagle","large", "orange", 6 );
		
		Dog dog3 = new Dog("German Shepherd", "large", "white & orange", 6);


        System.out.println("Data for the first dog is :");

		System.out.println(dog1.Breed.toUpperCase());
		System.out.println(dog1.size.toUpperCase());
		System.out.println(dog1.colour.toUpperCase());
		System.out.println(dog1.Age);
		
		System.out.println("---------------------------------------------------------------------------");
	
		System.out.println("Data for the second dog is :");

		System.out.println(dog2.Breed.toUpperCase());
		System.out.println(dog2.size.toUpperCase());
		System.out.println(dog2.colour.toUpperCase());
		System.out.println(dog2.Age);
		
		System.out.println("---------------------------------------------------------------------------");
		
		System.out.println("The third dog's data is :");

		System.out.println(dog3.Breed.toUpperCase());
		System.out.println(dog3.size.toUpperCase());
		System.out.println(dog3.colour.toUpperCase());
		System.out.println(dog3.Age);

			
		
	}

}
