package p1;

import java.util.List;

public class UserInterface {

	public static void main(String[] args)  {
		
		DatabaseOperations db = new DatabaseOperations();
		try
		{
		//	boolean flag = db.createCourse("Node.js", "UI Technology", 30, 4);
		//	System.out.println(flag);
		
			
			
			List<Courses> list = db.getAllCourses();
			System.out.println(list.size());
			
			for (Courses course : list) {
				System.out.println(course);
			}
			
			/*
			boolean d = db.deleteCourseByName("Node.js");
			System.out.println(d);
			*/
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
}
