import lombok.val;

import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		
		alien a1 = alien
				.builder()
				.name("Bob")
				.age(20)
				.color("red")
				.build();
		
		alien a2 = alien
				.builder()
				.name("Joe")
				.age(30)
				.color("blue")
				.build();
		
		alien a3 = new alien("Jake", 34, "green");
		
		alien a4 = alien
				.builder()
				.name("Jane")
				.age(26)
				.color("purple")
				.build();
		
		// This is dev1 branch
		
		out.println("\n" + a1);
		out.println("\n" + a2);
		out.println("\n" + a3);
		out.println("\n" + a4);
		
		a3.setName("Jill");
		out.println("\n" + a3);
		
		player p1 = player.builder()
				.name("Bob")
				.age(20)
				.skillLevel("expert")
				.build();
		out.println("\n"+p1.toString());
		
		//out.println("\nPlayer Name: " + p1.getName() + " Age: " + p1.getAge() + " Skill Level: " + p1.getSkillLevel());
		//out.println(p1);
		
		if (p1.getAge() < 18) {
			out.println("\n" + p1.getName() + " is too young to play this game.");
		} else {
			out.println("\n" + p1.getName()+ " is old enough to play this game.");
		}
		
		p1.setName("Jackie");
		out.println("\nPlayer 1 name is now: " + p1.getName());
		
		valExample v1 = new valExample();
		out.println(v1.example());
		
		val any2 = 7.44f;
		val any1 = 1;
		
		out.println("\n" + any1 + " + " + any2 + " = " + (any1 + any2));
	}
}
