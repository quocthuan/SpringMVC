package vn.com.tma.controllers;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.com.tma.dao.ContactJDBC;
import vn.com.tma.models.Contact;

@Controller
@RequestMapping("/contacts")
public class ContactController {
	private ApplicationContext context;

	@RequestMapping(method = RequestMethod.POST)
	public String getContact(ModelMap model) {
		context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		ContactJDBC contactJDBC = (ContactJDBC) context.getBean("contactJDBC");
		
		List<Contact> contactList = contactJDBC.loadAllContacts();
		
//		Contact contact = contactJDBC.findContactById(1);
		
//		model.addAllAttributes(contactList);
		model.addAttribute("contactList", contactList);
		
//		model.addAttribute("contactList", contact.getName());

		return "contacts";
	}
}
