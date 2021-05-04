package odev4_3.dal.concrete;

import java.util.Calendar;
import java.util.GregorianCalendar;

import odev4_3.core.dal.concrete.BaseDal;
import odev4_3.dal.abstracts.ICampaignDal;
import odev4_3.entities.Campaign;

public class CampaignDal extends BaseDal<Campaign> implements ICampaignDal {

	@Override
	public Campaign get(int gameId) {
		Calendar startDate = new GregorianCalendar(2021, 5, 1);
		Calendar finishDate = new GregorianCalendar(2021, 5, 31);

		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setGameId(gameId);
		campaign.setStartedDate(startDate.getTime());
		campaign.setFinishedDate(finishDate.getTime());
		campaign.setRate(0.1);

		return campaign;
	}

}
