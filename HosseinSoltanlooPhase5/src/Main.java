import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import entities.CourseService;
import entities.HouseService;
import entities.PersonService;
import entities.ProfessorService;
import entities.SchoolService;
import entities.StudentService;
import entityTests.*;

public class Main {
	
	
	public static void main(String args[]) throws IOException
	{

/*********************			COURSE TESTS			*********************/
		
		//Creating an instance of course test in order to use the methods
		CourseTest ctest = new CourseTest();
		System.out.println(
				"********************************** COURSE TEST ***************************************"
				);
		ctest.runTests();
		//////////*~~~~~ END OF COURSE TESTS
		

/*********************			FINISHED COURSE TESTS			*********************/
		
		//Creating an instance of finished course test in order to use the methods
		FinishedCourseTest ftest = new FinishedCourseTest();
		System.out.println(
				"************************** FINISHED COURSE TEST ***************************************"
				);
		ftest.runTests();
		//////////*~~~~~ END OF FINISHED COURSE TESTS
		

		
/*********************			HOUSE TESTS			*********************/
		
		//Creating an instance of HOUSE test in order to use the methods
		HouseTest htest = new HouseTest();
		System.out.println(
				"***************************** HOUSE TEST ***************************************"
				);
		htest.runTests();
		//////////*~~~~~ END OF HOUSE TESTS
		
		
/*********************			PERSON TESTS			*********************/
		
		//Creating an instance of PERSON test in order to use the methods
		PersonTest ptest = new PersonTest();
		System.out.println(
				"**************************** PERSON TEST ***************************************"
				);
		ptest.runTests();
		//////////*~~~~~ END OF PERSON TESTS	
	}
	

}
