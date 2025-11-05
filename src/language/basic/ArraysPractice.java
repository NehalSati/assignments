package language.basic;

public class ArraysPractice {

	public static void main(String[] args) {
		
        // 4 semesters → [4]
        // 6 subjects per semester → [6]
        // 2 details (Subject Name + Status/Marks) → [2]
        String[][][] result = new String[5][6][2];

        // ---------- Semester 1 ----------
        result[0][0][0] = "Mathematics I";         result[0][0][1] = "Pass(78)";
        result[0][1][0] = "Physics";               result[0][1][1] = "Pass(85)";
        result[0][2][0] = "Chemistry";             result[0][2][1] = "Fail(21)";
        result[0][3][0] = "Computer Programming";  result[0][3][1] = "Pass(74)";
        result[0][4][0] = "Engineering Drawing";   result[0][4][1] = "Pass(88)";
        result[0][5][0] = "Basic Electrical Eng."; result[0][5][1] = "Pass(79)";

        // ---------- Semester 2 ----------
        result[1][0][0] = "Mathematics II";        result[1][0][1] = "Pass(82)";
        result[1][1][0] = "Mechanics";             result[1][1][1] = "Pass(77)";
        result[1][2][0] = "Environmental Sci.";    result[1][2][1] = "Pass(93)";
        result[1][3][0] = "Basic Electronics";     result[1][3][1] = "Fail(19)";   
        result[1][4][0] = "Engineering Physics";   result[1][4][1] = "Fail(24)";   
        result[1][5][0] = "Engineering Graphics";  result[1][5][1] = "Pass(90)";

        // ---------- Semester 3 ----------
        result[2][0][0] = "Data Structures";       result[2][0][1] = "Pass(88)";
        result[2][1][0] = "Discrete Mathematics";  result[2][1][1] = "Pass(81)";
        result[2][2][0] = "Digital Electronics";   result[2][2][1] = "Pass(76)";
        result[2][3][0] = "Operating Systems";     result[2][3][1] = "Fail(32)";
        result[2][4][0] = "Signals and Systems";   result[2][4][1] = "Pass(85)";
        result[2][5][0] = "Object-Oriented Prog."; result[2][5][1] = "Pass(78)";

        // ---------- Semester 4 ----------
        result[3][0][0] = "Algorithms";            result[3][0][1] = "Pass(91)";
        result[3][1][0] = "Computer Networks";     result[3][1][1] = "Pass(73)";
        result[3][2][0] = "Database Systems";      result[3][2][1] = "Fail(19)";  
        result[3][3][0] = "Microprocessors";       result[3][3][1] = "Pass(80)";
        result[3][4][0] = "Communication Eng.";    result[3][4][1] = "Pass(76)";
        result[3][5][0] = "Software Engineering";  result[3][5][1] = "Pass(87)";   
        
        // ---------- Semester 5 ----------
        result[4][0][0] = "Probability & Stats";   result[4][0][1] = "Pass(86)";
        result[4][1][0] = "Machine Learning";      result[4][1][1] = "Pass(88)";
        result[4][2][0] = "Compiler Designs";      result[4][2][1] = "Pass(84)";  
        result[4][3][0] = "Theory of Computation"; result[4][3][1] = "Pass(95)";
        result[4][4][0] = "Embedded Systmes";      result[4][4][1] = "Pass(73)";
        result[4][5][0] = "Computer Graphics";     result[4][5][1] = "Pass(90)";  
        


        System.out.println("Semester 2 - Subject 4 Name: " + result[1][3][0]); 
        System.out.println("Semester 2 - Subject 5 Name: " + result[1][4][0]); 

        System.out.println("Semester 4 - Subject 3 Status/Marks: " + result[3][2][1]);
        System.out.println("Semester 4 - Subject 6 Status/Marks: " + result[3][5][1]);

	}

}
