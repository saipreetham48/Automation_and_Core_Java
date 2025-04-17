import java.time.Instant;
import java.time.LocalDateTime;

import accessModifiers.Student;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s=new Student();
//		System.out.println(s.id);
//		s.getId();
		Instant time=Instant.now();
		System.out.println(time.toString());
		
		LocalDateTime t=LocalDateTime.now();
		System.out.println(t.toString());

	}

}
