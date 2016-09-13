package bit2016.goodsman.data;

public class Customer {
	public String name;
	protected String phone;
	private String email;
	
	void setName() {
//		public은 자기 안에서 접근 O
		name = "도우넛";
//		protected은 자기 안에서 접근 O
		phone = "010";
//		private은 자기 안에서 접근 O
		email = "father@mail.com";
		
	
	}
}
