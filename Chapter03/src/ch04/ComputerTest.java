package ch04;

public class ComputerTest {
	public static void main(String[] args) {
		Computer computer = new Desktop();
		computer.display();
		computer.turnOn();
		
		Computer notebook = new MyNoteBook();
		notebook.turnOff();
		notebook.display();
		notebook.typing(); 
	}
}
