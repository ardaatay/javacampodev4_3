package odev4_3.dal.abstracts;

import odev4_3.core.dal.abstracts.IBaseDal;
import odev4_3.entities.Game;

public interface IGameDal extends IBaseDal<Game> {
	Game get(int gameId);
}
