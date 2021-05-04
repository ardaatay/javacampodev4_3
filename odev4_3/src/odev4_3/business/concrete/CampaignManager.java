package odev4_3.business.concrete;

import odev4_3.business.abstracts.ICampaignService;
import odev4_3.dal.abstracts.ICampaignDal;
import odev4_3.entities.Campaign;

public class CampaignManager implements ICampaignService {

	private ICampaignDal campaignDal;

	public CampaignManager(ICampaignDal campaignDal) {
		this.campaignDal = campaignDal;
	}

	@Override
	public void add(Campaign campaign) {
		this.campaignDal.add(campaign);
	}

	@Override
	public void update(Campaign campaign) {
		this.campaignDal.update(campaign);
	}

	@Override
	public void delete(Campaign campaign) {
		this.campaignDal.delete(campaign);
	}

	@Override
	public Campaign get(int gameId) {
		return this.campaignDal.get(gameId);
	}

}
