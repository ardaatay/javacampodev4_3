package odev4_3.business.abstracts;

import odev4_3.entities.Campaign;

public interface ICampaignService {
	void add(Campaign campaign);

	void update(Campaign campaign);

	void delete(Campaign campaign);

	Campaign get(int gameId);
}
