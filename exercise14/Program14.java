package exercise14;

	class Student{
		String name = "XYZ";
		int rollNo = 21;
	}

	class Exam extends Student{
		int subject1;
		int subject2;
		int subject3;
	}

	class Result extends Exam{
		int totalMark;
		public int  totalMark(int s1, int s2, int s3) {
			totalMark = 0;
			totalMark = s1 + s2 + s3;
			return totalMark;
		}
	}

