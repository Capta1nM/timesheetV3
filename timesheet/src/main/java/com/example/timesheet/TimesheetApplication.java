package com.example.timesheet;

import com.example.timesheet.entity.Salary;
import com.example.timesheet.repo.SalaryRepo;
//import com.example.timesheet.service.UserSalaryAutoRunServiceImlp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Timer;
import javax.naming.AuthenticationException;
import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.*;

@SpringBootApplication
@EnableDiscoveryClient
public class TimesheetApplication {
//
//	DirContext connection;
//	public void newConnection(){
//		Properties env = new Properties();
//		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
//		env.put(Context.PROVIDER_URL, "ldap://localhost:10389");
//		env.put(Context.SECURITY_PRINCIPAL, "uid=admin, ou=system");
//		env.put(Context.SECURITY_CREDENTIALS, "secret");
//		try {
//			connection = new InitialDirContext(env);
//			System.out.println("hello world : " + connection);
//		}
//		catch (AuthenticationException exception){
//			System.out.println(exception.getMessage());
//		}
//		catch (NamingException e) {
//			e.printStackTrace();
//		}
//	}
//	public void getAllUsers() throws NamingException {
//		String searchFilter = "(objectClass=inetOrgPerson)";
//		String[] reqAtt = { "cn", "sn" };
//		SearchControls controls = new SearchControls();
//		controls.setSearchScope(SearchControls.SUBTREE_SCOPE);
//		controls.setReturningAttributes(reqAtt);
//
//		NamingEnumeration users = connection.search("ou=users,ou=system", searchFilter, controls);
//
//		SearchResult result = null;
//		while (users.hasMore()) {
//			result = (SearchResult) users.next();
//			Attributes attr = result.getAttributes();
//			String name = attr.get("cn").get(0).toString();
//			//deleteUserFromGroup(name,"Administrators");
//			System.out.println(attr.get("cn"));
//			System.out.println(attr.get("sn"));
//		}
//	}
//	public void addUser() {
//		Attributes attributes = new BasicAttributes();
//		Attribute attribute = new BasicAttribute("objectClass");
//		attribute.add("inetOrgPerson");
//
//		attributes.put(attribute);
//		// user details
//		attributes.put("sn", "Ricky");
//		try {
//			connection.createSubcontext("cn=Tommy,ou=users,ou=system", attributes);
//			System.out.println("success");
//		} catch (NamingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//	public void addUserToGroup(String username, String groupName)
//	{
//		ModificationItem[] mods = new ModificationItem[1];
//		Attribute attribute = new BasicAttribute("uniqueMember","cn="+username+",ou=users,ou=system");
//		mods[0] = new ModificationItem(DirContext.ADD_ATTRIBUTE, attribute);
//		try {
//			connection.modifyAttributes("cn="+groupName+",ou=groups,ou=system", mods);
//			System.out.println("success");
//		} catch (NamingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//	public void deleteUser()
//	{
//		try {
//			connection.destroySubcontext("cn=Tommy,ou=users,ou=system");
//			System.out.println("success");
//		} catch (NamingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	public void deleteUserFromGroup(String username, String groupName)
//	{
//		ModificationItem[] mods = new ModificationItem[1];
//		Attribute attribute = new BasicAttribute("uniqueMember","cn="+username+",ou=users,ou=system");
//		mods[0] = new ModificationItem(DirContext.REMOVE_ATTRIBUTE, attribute);
//		try {
//			connection.modifyAttributes("cn="+groupName+",ou=groups,ou=system", mods);
//			System.out.println("success");
//		} catch (NamingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//	public void searchUsers() throws NamingException {
//		//String searchFilter = "(uid=1)"; //  for one user
//		//String searchFilter = "(&(uid=1)(cn=Smith))"; // and condition
//		String searchFilter = "(|(uid=1)(uid=2)(cn=Smith))"; // or condition
//		String[] reqAtt = { "cn", "sn","uid" };
//		SearchControls controls = new SearchControls();
//		controls.setSearchScope(SearchControls.SUBTREE_SCOPE);
//		controls.setReturningAttributes(reqAtt);
//
//		NamingEnumeration users = connection.search("ou=users,ou=system", searchFilter, controls);
//
//		SearchResult result = null;
//		while (users.hasMore()) {
//			result = (SearchResult) users.next();
//			Attributes attr = result.getAttributes();
//			String name = attr.get("cn").get(0).toString();
//			//deleteUserFromGroup(name,"Administrators");
//			System.out.println(attr.get("cn"));
//			System.out.println(attr.get("sn"));
//			System.out.println(attr.get("uid"));
//		}
//
//	}z

	public static void main(String[] args) throws NamingException {
		SpringApplication.run(TimesheetApplication.class, args);
//		TimesheetApplication app = new TimesheetApplication();
//		app.newConnection();
//		app.getAllUsers();



//		for (int i = 0; i < 1000000; i++) {
//			employeeIds.add(String.valueOf(i + 1));
//		}
//		Timer t = new Timer();
//		for (int i = 0; i < salaryList.size(); i++) {
//			UserSalaryAutoRunServiceImlp t1 = new UserSalaryAutoRunServiceImlp(salaryList.get(i));
//			t.scheduleAtFixedRate(t1, ChronoUnit.MILLIS.between(LocalDateTime.now(),
//							LocalDateTime.of(LocalDate.now().getYear(),
//									LocalDate.now().getMonth(),
//									LocalDate.now().getDayOfMonth(),
//									23, 59, 59)) + i * 50 //+ 10
//					, 30000);//24 * 60 * 60 * 1000);
//		}


	}
}
