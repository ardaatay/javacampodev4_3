package odev4_3.business.abstracts;

import odev4_3.entities.Game;

public interface IGameService {
	void add(Game game);

	Game get(int gameId);
}
