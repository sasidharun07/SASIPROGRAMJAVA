package sasijava;

	class head
	{
		String sub = "all subject";
	}
	class tec1 extends head
	{
		String sub="JAVA";
		void show()
		{
			System.out.println("teacher learning "+super.sub+" from HM");
		}
	}
	class st1 extends tec1
	{
		void show()
		{
			super.show();
			System.out.println("student 1 reference "+sub+"from teacher");
		}
	}
	class st2 extends tec1
	{
		void show()
		{
			super.show();
			System.out.println("Student 2 reference "+sub);
		}
	}

	public class hybridnew_inheritance {

		public static void main(String[] args) {
			hybridnew_inheritance sc = new hybridnew_inheritance();
			

		}

	}
