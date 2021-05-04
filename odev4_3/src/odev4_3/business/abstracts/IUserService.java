package odev4_3.business.abstracts;

import odev4_3.dtos.LoginDto;
import odev4_3.entities.User;

public interface IUserService {
	User login(LoginDto login);

	boolean signUp(User user);
}
