package controllers.accountManagerController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controllers.ControllerUtil;
import controllers.SubController;

public class AccountManagerViewController implements SubController {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String resultPagePath = "/views/accountManager/accountManagerView.jsp";
		
		ControllerUtil.forward(request, response, resultPagePath);
	}
}
