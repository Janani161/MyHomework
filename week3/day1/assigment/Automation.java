package week3.day1.assigment;

public class Automation extends MultipleLangauge implements TestTool,Language {

	public static void main(String[] args) {
		
		Automation auto = new Automation();
		auto.python();
		auto.ruby();
		auto.Selenium();
		auto.Java();

	}

	public void Java() {
		
		System.out.println("Java is a high-level, class-based, object-oriented programming language" + "is designed to have as few implementation dependencies as possible");
	}

	public void Selenium() {

System.out.println("Selenium automates browsers");		
	}

	@Override
	public void ruby() {

		System.out.println("A dynamic, open source programming language with a focus on simplicity and productivity");
	}

}
