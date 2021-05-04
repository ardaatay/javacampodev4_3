package odev4_3.business.concrete;

import odev4_3.business.abstracts.IUserCheckService;
import odev4_3.entities.User;

public class UserCheckManager implements IUserCheckService {

	@Override
	public boolean CheckIfRealPerson(User user) {
		return true;
	}

}
