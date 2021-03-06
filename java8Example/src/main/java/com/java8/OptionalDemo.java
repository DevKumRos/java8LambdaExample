package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Optional<List<User>> optUserList = getUserList();
		if(optUserList.isPresent()) {
			optUserList.get().stream().filter(user -> user.getAge() > 25)
			.forEach(user -> {
				System.out.println("User ( name=" + user.getName() + ", lastName=" + user.getLastName() + ", address=" + user.getAddress() + ", age=" + user.getAge() + ")");
			});
		}
	}
	
	
	private static Optional<List<User>> getUserList() {
		List<User> userList = new ArrayList<User>();
		
		for(int i =0; i<10; i++) {
			Address add = null;
			if(i%2 == 0)
				add = new Address("xxx"+i, "yyy"+i, "zzz"+i);
			User user = new User("NNN"+i, "MMM"+i, add, 20+i);	
			userList.add(user);
		}
			
		return Optional.ofNullable(userList);
	}

}
