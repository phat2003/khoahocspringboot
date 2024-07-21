package com.example.hello.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.hello.model.Person;

@Controller //tạo 1 controller để chạy các file html,css
public class HomeController {
	
	private static List<Person> persons = new ArrayList<Person>();
	static {
		persons.add(new Person("Bill", "Gates"));
		persons.add(new Person("Steve", "Jobs"));
	}
	
	@RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
	public String personList(Model model) {
		
		model.addAttribute("persons", persons);
		
		return "personList";
	}
	
	@RequestMapping("/")//gửi yêu cầu load mapping funtion welcome và gọi(mapping) từ controller đến trang index.html
	public String welcome(final Model model) {//biến string welcome, final Model model là 1 cái model của spring cung cấp.
		model.addAttribute("message", "hello");//dòng này dùng để truyền dữ liệu data-model xuống trang html ở return, khởi tạo add thuộc tính(attribute) có tên là message và truyền vào đó giá trị hello và ở dưới là chữ return index => nó sẽ mapping tới thuộc tính message được khởi tạo $ ở trang html để convert(chuyển đổi, dịch ra) để render ra dữ liệu text ở bên html
		return "index";//trả về trang index(load trang index.html)
	}
	
	@RequestMapping("/hello/{param}")//param để truyền tên đường dẫn của người nhập vào,khi gõ url ở chỗ param điền tên của ai đó vào thì nó sẽ hiện tên của người đó.
	@ResponseBody //dòng này có tác dụng là báo cho springboot biết rằng funtion này không load từ file html nào cả mà sẽ trả về chuỗi text ở return.
	public String hello(@PathVariable("param") String param) {//truyền param đã nhập từ đường dẫn vào trong biến hello và @pathvariable(đường dẫn của biến param đó) khởi tạo thành giá trị của biến String param.
		return "Hello " + param ;//trả về ký tự Hello + biến param(hiện ra kết quả là giá trị của biến param cũng chính là tên của đường dẫn param mà chúng ta nhập
		
	}
	
}
