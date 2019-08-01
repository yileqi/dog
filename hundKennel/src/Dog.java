

//Yileqi Alfredsson yial6761//

public class Dog {

	private String name;
	private String breed;
	private int age;
	private double weight;

	public Dog(String name, String breed, int age, double weight) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;

	}

	public String getBreed() {
		return breed;

	}

	public int getAge() {
		return age;

	}

	public void increaseAge(int numberOfYears) {
		age += numberOfYears;

	}

	public double getWeight() {
		return weight;
	}

	public double getTailLength() {
		return calculatorTailLength();

	}

	private double calculatorTailLength() {
		double tailLength;
		if (breed.equalsIgnoreCase("dachshund") || breed.equalsIgnoreCase("tax")) {
			tailLength = 3.7;
		} else {
			tailLength = ((double) age * (double) weight)/ 10;
		}
		return tailLength;
	}

	public String toString() {
		return name +" "+ breed+ " " + Integer.toString(age)+" år " + Double.toString(weight)+" kg" + " svans ="+ Double.toString(calculatorTailLength());
	}

}