package odev4_3.adapters;

import odev4_3.business.abstracts.IUserCheckService;
import odev4_3.entities.User;

public class MernisServiceAdapter implements IUserCheckService {

	@Override
	public boolean CheckIfRealPerson(User user) {
		return true;
	}

}
