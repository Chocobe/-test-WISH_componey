package controllers.accountManagerController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import controllers.SubController;
import service.AccountManagerService;
import vo.AccountManagerVO;


public class AccountManagerSearchController implements SubController {
	private AccountManagerService accountManagerService;
	
	
	public AccountManagerSearchController() {
		this.accountManagerService = new AccountManagerService();
	}
	
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) 
					throws ServletException, IOException {
		String voBusiNum = request.getParameter("voBusiNum");
		String voCustom = request.getParameter("voCustom");
		
		List<AccountManagerVO> accountManagerList = accountManagerService.searchData(voBusiNum, voCustom);
		
		Gson gson = new Gson();
		String stringJSON = gson.toJson(accountManagerList);
		
		PrintWriter out = response.getWriter();
		out.print(stringJSON);
		
		out.close();
	}
}
