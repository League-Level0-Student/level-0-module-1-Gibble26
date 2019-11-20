package _12_badgers;
//Badger, badger, badger, badger, badger, badger, badger, badger, badger, badger
//Mushroom, mushroom, a
//Badger, badger, badger, badger, badger, badger, badger, badger, badger, badger
//Mushroom, mushroom, a
//Badger, badger, badger, badger, badger, badger, badger, badger, badger, badger
//Mush-mushroom, a
//Badger, badger, badger, badger, badger, badger, badger, badger, badger, badger
//A snake, a snake
//Snake! A snake, ooh it's a snake
//It's a badger, badger, badger, badger, badger, badger, badger, badger, badger, badger
//Mushroom, mushroom, a
public class badgerbadgerbadgerbadger {
public static void main(String[] args) {
	String a = "badger";
	String b = "snake";
	String c = "mushroom,";
	for (int i = 0; i < 12; i++) {
		if(i < 10) {
			System.out.print(a);
		}
			
			if(i >= 10) {
				System.out.println(c);
				
			}
			
		
	}
}

}
