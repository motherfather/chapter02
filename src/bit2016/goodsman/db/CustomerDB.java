package bit2016.goodsman.db;

import bit2016.goodsman.data.Customer;

public class CustomerDB {
	void insert() {
		Customer c = new Customer();
		// public은 다른 패키지에서 접근 O
		c.name = "안대혁";
		// protected는 다른 패키지에서 접근 X
		// c.phone = "010-4761-6934"; // 강사님 폰번
		// private은 다른 패키지에서 접근 X
		// c.email = "father@mail.com";
	}
}