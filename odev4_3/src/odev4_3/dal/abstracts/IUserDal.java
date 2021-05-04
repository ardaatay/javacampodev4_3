package odev4_3.dal.abstracts;

import odev4_3.core.dal.abstracts.IBaseDal;
import odev4_3.entities.User;

public interface IUserDal extends IBaseDal<User> {

	public User getUserWithUsernameAndPassword(String username, String password);
}
