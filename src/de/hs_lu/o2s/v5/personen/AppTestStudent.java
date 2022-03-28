package de.hs_lu.o2s.v5.personen;

public class AppTestStudent {

	public static void main(String[] args) {
		
		Student stud6 = new Student("Karola Fleißig", "654321");
		Person pers6 = stud6;
		
		if(AppTestStudent.isStudent(pers6)) {
			Student stud7 = (Student) pers6;
			System.out.println("Matrikelnummer von stud7: " + stud7.getMatrNr());
		}
		
		AppTestStudent ats = new AppTestStudent();
		ats.doSomething();
		new AppTestStudent().doSomething();
	}
	
	/**
	 * Statische Methode, die prüft, ob die übergebene Person ein Student ist
	 * @param pers
	 * @return true, wenn das übergebene Objekt eine Instanz vom Typ Student ist
	 */
	public static boolean isStudent(Person pers){
		return (pers instanceof Student);
	}
	
	/**
	 * statische Methode, die nur eine Ausgabe auf der Konsole vornimmt
	 */
	public void doSomething(){
		System.out.println("doSomething() wurde gestartet");
	}
}
