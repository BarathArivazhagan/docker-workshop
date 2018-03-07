package com.barath.docker.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RestController
	public class UserController{

		UserService userService;

		public UserController(UserService userService) {
			this.userService = userService;
		}

		@GetMapping("/users")
		public List<User> getUsers(){

			return userService.getUsers();
		}

	}


	protected class User{
		private Long userId;
		private String userName;

		public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public User(Long userId, String userName) {
			this.userId = userId;
			this.userName = userName;
		}
	}

	@Service
	class UserService{

		private UserRepository userRepository;


		public UserService(UserRepository userRepository) {
			this.userRepository = userRepository;
		}

		public User addUser(User user){

			return userRepository.save(user);
		}

		public User getUser(String userName){
			return userRepository.findByUserName(userName);
		}

		public List<User> getUsers(){
			return userRepository.findAll();
		}

		@PostConstruct
		public void init(){

			User user1=new User(1L,"test1");
			User user2=new User(1L,"test1");
			Arrays.asList(user1,user2).forEach(this::addUser);

		}

	}

	interface UserRepository extends JpaRepository<User,Long>{

		User findByUserName(String userName);
	}

}







