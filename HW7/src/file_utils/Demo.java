package file_utils;

public class Demo {

	public static void main(String[] args) {
			FileFactory.makeStudentFile(2000, "outputData/Students.txt");
			FileFactory.makeTextbookFile(250, "outputData/Textbooks.txt");
			FileFactory.makeFacultyFile(300, "outputData/Faculty.txt");
			FileFactory.makeClassroomFile(100, "outputData/Classroom.txt");
			FileFactory.completeCourseFile("outputData/Courses.txt");
//			FileFactory.makeStudentFile(2000, "outputData/Students.txt");
	}

}
