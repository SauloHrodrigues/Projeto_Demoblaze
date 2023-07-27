package com.demoblaze.test.logic.logout;

import org.junit.Assert;

import com.demoblaze.kernel.Contexto;
import com.demoblaze.test.pages.logout.LogoutPage;

public class LogoutLogic {
	private LogoutPage page;

	public LogoutLogic() {
		page = new LogoutPage();
	}
	
	public void clicarLogout() {
		Contexto.browserWeb().toClick(page.getLinkLogOut());
	}
	
	public void validarLogout() {
		Assert.assertFalse(page.getLinkLogOut().isDisplayed());	
	}
}