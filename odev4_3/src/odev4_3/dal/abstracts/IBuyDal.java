package odev4_3.dal.abstracts;

import odev4_3.entities.Buy;

import odev4_3.core.dal.abstracts.IBaseDal;

public interface IBuyDal extends IBaseDal<Buy> {
	boolean checkGameToUser(Buy buy);
}
