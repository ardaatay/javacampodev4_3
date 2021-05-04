package odev4_3.business.concrete;

import odev4_3.business.abstracts.IGameService;
import odev4_3.dal.abstracts.IGameDal;
import odev4_3.entities.Game;

public class GameManager implements IGameService {
	private IGameDal gameDal;

	public GameManager(IGameDal gameDal) {
		this.gameDal = gameDal;
	}

	@Override
	public void add(Game game) {
		this.gameDal.add(game);
	}

	@Override
	public Game get(int gameId) {
		return this.gameDal.get(gameId);
	}
}
