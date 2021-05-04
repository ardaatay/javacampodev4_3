package odev4_3.dal.concrete;

import odev4_3.core.dal.concrete.BaseDal;
import odev4_3.dal.abstracts.IBuyDal;
import odev4_3.entities.Buy;

public class BuyDal extends BaseDal<Buy> implements IBuyDal {

	@Override
	public boolean checkGameToUser(Buy buy) {
		return false;
	}

}
