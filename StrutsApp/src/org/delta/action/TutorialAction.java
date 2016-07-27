/*Tutorila - 04 - part 2
 * http://localhost:8080/StrutsApp/getTutorial.action
 * New -->webproject-->simple project
-Added userlibrary with struts jar
-Added this user library to deployment assembly 
-In classpath(src),added new struts.xml file and define action class
-create new action class call TutorialAction.java, Inside this class create method execute()
-In webcontent folder create success.jsp
-Now, in struts.xml define <action> in default package

browser --> web.xml(struts filter) -->struts.xml(Action Mapping)-->Action class(ActionMethod and servlice logic)-->return .jsp file.
*/

package org.delta.action;

public class TutorialAction {
	
	public String execute(){
		
		System.out.println("Hellow from execute");
		
		return "success";
	}

}
