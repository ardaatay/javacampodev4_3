package odev4_3.business.concrete;

import odev4_3.business.abstracts.IBuyService;
import odev4_3.business.abstracts.ICampaignService;
import odev4_3.business.abstracts.IGameService;
import odev4_3.dal.abstracts.IBuyDal;
import odev4_3.entities.Buy;
import odev4_3.entities.Campaign;
import odev4_3.entities.Game;

public class BuyManager implements IBuyService {

	private IBuyDal buyDal;
	private IGameService gameService;
	private ICampaignService campaignService;

	public BuyManager(IBuyDal buyDal, IGameService gameService, ICampaignService campaignService) {
		this.buyDal = buyDal;
		this.gameService = gameService;
		this.campaignService = campaignService;
	}

	@Override
	public String addGameToUser(Buy buy) {
		boolean check = checkGameToUser(buy);
		Game game = this.gameService.get(buy.getProductId());
		if (check == false) {
			Campaign campaign = this.campaignService.get(game.getId());
			if (campaign != null) {
				buy.setPrice(game.getPrice() - (campaign.getRate() * game.getPrice()));
			}
			this.buyDal.add(buy);
			return "Oyun satýn alýndý " + game.getName() + " Fiyat : " + buy.getPrice();
		} else {
			return "Oyun daha önce satýn alýnmýþ!";
		}
	}

	@Override
	public boolean checkGameToUser(Buy buy) {
		return this.buyDal.checkGameToUser(buy);
	}

}
