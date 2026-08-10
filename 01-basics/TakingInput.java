import java.util.Scanner;
class TakingInput{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hi what is your name ? ");
		String name = scanner.nextLine();
		System.out.println("What do you do for living  ? ");
		String job = scanner.nextLine();
		System.out.println("Here is the story : ");
		System.out.println("Once upoun a time there was "+name+" who was a "+job+". On the way to work,"+name+" reflected on life. Perhaps "+name+" will not be a "+job+" forever.");
		System.out.println("Have a great life Mr."+name+" ^~^");
	}
}
 
