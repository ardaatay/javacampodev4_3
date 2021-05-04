package odev4_3.business.abstracts;

import odev4_3.entities.User;

public interface IUserCheckService {
	boolean CheckIfRealPerson(User user);
}
