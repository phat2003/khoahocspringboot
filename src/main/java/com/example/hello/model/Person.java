package com.example.hello.model;

public class Person {
	
	private String firstName;
	private String lastName;
	
	public Person() {//khai báo đối tượng Person
		
	}
	
	public Person(String firstName, String lastName) { //cũng khai báo đối tượng Person nhưng truyền vào cho đối tượng Person 2 biến firstName, lastName (2 biến này là của đối tượng Person)
		this.firstName = firstName;//chỉ định biến private firstName khai báo ở lên  = biến firstName của Person( điều này có nghĩa là chỉ cần ghi firstName thì đều sẽ là biến của đối tượng này lẫn biến khai báo ở trên) 
		this.lastName = lastName;//tương tự như firstName.
	}
	
	public String getFirstName() {//khai báo 1 biến getFirstName(lấy firstname)
		return firstName;//biến này sẽ trả về firstName
	}
	
	public void setFirstName(String firstName) {//khai báo 1 biến setFirstName(đặt firstname)
		this.firstName = firstName;//cho biến private khai báo ở bên và biến bên method này là như nhau khi gọi
	}
	
	public String getLastName() {//tương tự như getFirstName
		return lastName;
	}
	
	public void setLastName(String lastName) {//tương tự như setFirstName
		this.lastName = lastName;
	}

}
