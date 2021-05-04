package odev4_3.dal.abstracts;

import odev4_3.core.dal.abstracts.IBaseDal;
import odev4_3.entities.Campaign;

public interface ICampaignDal extends IBaseDal<Campaign> {
	Campaign get(int gameId);
}
