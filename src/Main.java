import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		
		alien a1 = new alien();
		a1.name = "Bob";
		a1.age = 20;
		a1.color = "red";
		
		alien a2 = new alien();
		a2.name = "Joe";
		a2.age = 30;
		a2.color = "blue";
		
		out.println(a1);
		out.println(a2);
		
		player p1 = new player(19, "Joe", "expert");
		out.println(p1);
		
		if (p1.getAge() < 18) {
			out.println("You are too young to play this game.");
		} else {
			out.println("You are old enough to play this game.");
		}
		
		p1.setName("Jackie");
		out.println("Player 1 name is now: " + p1.getName());
		}
	}
