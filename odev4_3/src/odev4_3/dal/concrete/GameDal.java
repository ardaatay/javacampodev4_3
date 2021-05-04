package odev4_3.dal.concrete;

import odev4_3.core.dal.concrete.BaseDal;
import odev4_3.dal.abstracts.IGameDal;
import odev4_3.entities.Game;

public class GameDal extends BaseDal<Game> implements IGameDal {

	@Override
	public Game get(int gameId) {
		Game game = new Game();
		game.setId(gameId);
		game.setName("Fifa 2021");
		game.setCategoryId(1);
		game.setPrice(210);

		return game;
	}

}
