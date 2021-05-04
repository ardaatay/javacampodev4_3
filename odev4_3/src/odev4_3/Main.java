package odev4_3;

import java.util.Calendar;
import java.util.GregorianCalendar;

import odev4_3.adapters.MernisServiceAdapter;
import odev4_3.business.abstracts.IBuyService;
import odev4_3.business.abstracts.IGameService;
import odev4_3.business.abstracts.IUserService;
import odev4_3.business.concrete.BuyManager;
import odev4_3.business.concrete.CampaignManager;
import odev4_3.business.concrete.GameManager;
import odev4_3.business.concrete.UserManager;
import odev4_3.dal.concrete.BuyDal;
import odev4_3.dal.concrete.CampaignDal;
import odev4_3.dal.concrete.GameDal;
import odev4_3.dal.concrete.UserDal;
import odev4_3.dtos.LoginDto;
import odev4_3.entities.Buy;
import odev4_3.entities.Game;
import odev4_3.entities.User;

public class Main {

	public static void main(String[] args) {
		// Oyun ekleme
		Game game = new Game();
		game.setId(1);
		game.setName("Fifa 2021");
		game.setCategoryId(1);
		game.setPrice(210);

		IGameService gameService = new GameManager(new GameDal());
		gameService.add(game);

		// Kullanýcý ekleme
		Calendar dateOfBirth = new GregorianCalendar(1988, 1, 5);

		User user = new User();
		user.setId(1);
		user.setFirstName("Arda");
		user.setLastName("Atay");
		user.setUsername("ardaatay");
		user.setEmail("test@ardaatay.com");
		user.setDateOfBirth(dateOfBirth.getTime());
		user.setNationalityId("11111111111");

		IUserService userService = new UserManager(new UserDal(), new MernisServiceAdapter());
		userService.signUp(user);

		// Oturum Açma
		LoginDto login = new LoginDto();
		login.setUsername(user.getUsername());
		login.setPassword(user.getPassword());

		User loginUser = userService.login(login);
		if (loginUser != null) {
			System.out.println("Oturum açýldý " + loginUser.getFirstName() + " " + loginUser.getLastName());
			// Oyun satýn alma
			Buy buy = new Buy();
			buy.setId(1);
			buy.setUserId(loginUser.getId());
			buy.setProductId(game.getId());

			IBuyService buyService = new BuyManager(new BuyDal(), new GameManager(new GameDal()),
					new CampaignManager(new CampaignDal()));

			System.out.println(buyService.addGameToUser(buy));
		} else {
			System.out.println("Oturum açma iþlemi baþarýsýz!");
		}

	}

}
