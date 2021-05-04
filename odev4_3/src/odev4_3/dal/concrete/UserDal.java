package odev4_3.dal.concrete;

import java.util.Calendar;
import java.util.GregorianCalendar;

import odev4_3.core.dal.concrete.BaseDal;
import odev4_3.dal.abstracts.IUserDal;
import odev4_3.entities.User;

public class UserDal extends BaseDal<User> implements IUserDal {

	@Override
	public User getUserWithUsernameAndPassword(String username, String password) {
		Calendar dateOfBirth = new GregorianCalendar(1988, 1, 5);

		User user = new User();
		user.setId(1);
		user.setFirstName("Arda");
		user.setLastName("Atay");
		user.setUsername(username);
		user.setEmail("test@ardaatay.com");
		user.setDateOfBirth(dateOfBirth.getTime());
		user.setNationalityId("11111111111");

		return user;
	}

}
