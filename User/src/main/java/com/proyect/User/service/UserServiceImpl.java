package com.proyect.User.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyect.User.adapter.ShoppingAdapter;
import com.proyect.User.model.Shopping;
import com.proyect.User.model.User;
import com.proyect.User.repository.ShoppingRepository;
import com.proyect.User.repository.UserRepository;
import com.proyect.User.model.Shopping;
import com.proyect.User.model.User;
import com.proyect.User.response.ShoppingResponse;
import com.proyect.User.response.UserResponse;

@Transactional
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private ShoppingRepository sry;

	@Autowired
	private UserRepository ury;

	@Override
	public User newUser(User user) {
		// TODO Auto-generated method stub
		return ury.save(user);
	}

	@Override
	public Shopping newShopping(Shopping shopping) {
		return sry.save(shopping);
	}

	@Override
	public User findOneByMail(User mail) {
		// TODO Auto-generated method stub
		return ury.findOneByMail(mail.getMail());
	}

	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		return ury.findByName(name);
	}


	@Override 
	public String checkPassword(String mail) {

		// TODO Auto-generated method stub
		User check = ury.findOneByMail(mail);	
		System.out.println("---------------------CONFLICTO-----------------------" + check.toString());
		return check.getPassword();
	}


	@Override
	public String findOneByMailString(String mail) {
		User u= ury.findOneByMail(mail);
		String mail1 = u.getMail();
		return mail1;
	}
	
	@Override
	public List<ShoppingResponse> findAllShoppings() {
		final List<Shopping> all = sry.findAll();
		return ShoppingAdapter.of(all);
	}

	@Override
	public User existUser(String mail) {
	// TODO Auto-generated method stub
	return ury.findOneByMail(mail);
	}
}