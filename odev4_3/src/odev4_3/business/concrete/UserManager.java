package odev4_3.business.concrete;

import odev4_3.business.abstracts.IUserCheckService;
import odev4_3.business.abstracts.IUserService;
import odev4_3.dal.abstracts.IUserDal;
import odev4_3.dtos.LoginDto;
import odev4_3.entities.User;

public class UserManager implements IUserService {

	private IUserDal userDal;
	private IUserCheckService userCheckService;

	public UserManager(IUserDal userDal, IUserCheckService userCheckService) {
		this.userDal = userDal;
		this.userCheckService = userCheckService;
	}

	@Override
	public User login(LoginDto login) {
		return this.userDal.getUserWithUsernameAndPassword(login.getUsername(), login.getPassword());
	}

	@Override
	public boolean signUp(User user) {
		if (this.userCheckService.CheckIfRealPerson(user)) {
			this.userDal.add(user);
			return true;
		} else {
			return false;
		}
	}
}
