package odev4_3.business.abstracts;

import odev4_3.entities.Buy;

public interface IBuyService {
	String addGameToUser(Buy buy);

	boolean checkGameToUser(Buy buy);
}
