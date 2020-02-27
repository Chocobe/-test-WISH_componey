package vo;

import java.sql.Timestamp;
import java.time.LocalDate;

public class CustomVO {
	private String voBusiNum;				// BUSI_NUM
	private String voCustom;				// CUSTOM
	private String voShort;					// SHORT
	
	private String voCEO;					// CEO
	private String voChargePerson;			// CHARGE_PERSON
	private String voBusiCondition;			// BUSI_CONDISION
	private String voItem;					// ITEM
	private String voPostNum;				// POST_NUM
	
	private String voAddr1;					// ADDR1
	private String voAddr2;					// ADDR2
	
	private String voTEL;					// TEL
	private String voFAX;					// FAX
	private String voHomePage;				// HOMEPAGE
	
	private String voCoYN;					// CO_YN
	private String voForeignYN;				// FOREIGN_YN
	private String voTaxYN;					// TAX_YN
	
	private String voCountryENG;			// COUNTRY_ENG
	private String voCountryKOR;			// COUNTRY_KOR
	
	private String voSpecialRelation;		// SPECIAL_RELATION
	private String voTradeStop;				// TRADE_STOP
	
	private LocalDate voContractPeriod_S;	// CONTRACT_PERIOD_S
	private String voContractPeriod_S_String;
	private LocalDate voContractPeriod_E;	// CONTRACT_PERIOD_E
	private String voContractPeriod_E_String;
	
	private String voRegiInfoMan;			// REGI_INFO_MAN
	private Timestamp voRegiInfoDate;		// REGI_INFO_DATE
	private String voRegiInfoDate_String;
	private String voModiInfoMan;			// MODI_INFO_MAN
	private Timestamp voModiInfoDate;		// MODI_INFO_DATE
	private String voModiInfoDate_String;
	
	
	
	public CustomVO() {}


// BUSI_NUM
	public String getVoBusiNum() {
		return voBusiNum;
	}
	public void setVoBusiNum(String voBusiNum) {
		this.voBusiNum = voBusiNum;
	}


// CUSTOM
	public String getVoCustom() {
		return voCustom;
	}
	public void setVoCustom(String voCustom) {
		this.voCustom = voCustom;
	}


// SHORT
	public String getVoShort() {
		return voShort;
	}
	public void setVoShort(String voShort) {
		this.voShort = voShort;
	}


// CEO
	public String getVoCEO() {
		return voCEO;
	}
	public void setVoCEO(String voCEO) {
		this.voCEO = voCEO;
	}


// CHARGE_PERSON
	public String getVoChargePerson() {
		return voChargePerson;
	}
	public void setVoChargePerson(String voChargePerson) {
		this.voChargePerson = voChargePerson;
	}


// BUSI_CONDITION
	public String getVoBusiCondition() {
		return voBusiCondition;
	}
	public void setVoBusiCondition(String voBusiCondition) {
		this.voBusiCondition = voBusiCondition;
	}


// ITEM
	public String getVoItem() {
		return voItem;
	}
	public void setVoItem(String voItem) {
		this.voItem = voItem;
	}


// POST_NUM
	public String getVoPostNum() {
		return voPostNum;
	}
	public void setVoPostNum(String voPostNum) {
		this.voPostNum = voPostNum;
	}


// ADDR1
	public String getVoAddr1() {
		return voAddr1;
	}
	public void setVoAddr1(String voAddr1) {
		this.voAddr1 = voAddr1;
	}


// ADDR2
	public String getVoAddr2() {
		return voAddr2;
	}
	public void setVoAddr2(String voAddr2) {
		this.voAddr2 = voAddr2;
	}


// TEL
	public String getVoTEL() {
		return voTEL;
	}
	public void setVoTEL(String voTEL) {
		this.voTEL = voTEL;
	}


// FAX
	public String getVoFAX() {
		return voFAX;
	}
	public void setVoFAX(String voFAX) {
		this.voFAX = voFAX;
	}


// HOMEPAGE
	public String getVoHomePage() {
		return voHomePage;
	}
	public void setVoHomePage(String voHomePage) {
		this.voHomePage = voHomePage;
	}


// CO_YN
	public String getVoCoYN() {
		return voCoYN;
	}
	public void setVoCoYN(String voCoYN) {
		this.voCoYN = voCoYN;
	}


// FOREIGN_YN
	public String getVoForeignYN() {
		return voForeignYN;
	}
	public void setVoForeignYN(String voForeignYN) {
		this.voForeignYN = voForeignYN;
	}


// TAX_YN
	public String getVoTaxYN() {
		return voTaxYN;
	}
	public void setVoTaxYN(String voTaxYN) {
		this.voTaxYN = voTaxYN;
	}


// COUNTRY_ENG
	public String getVoCountryENG() {
		return voCountryENG;
	}
	public void setVoCountryENG(String voCountryENG) {
		this.voCountryENG = voCountryENG;
	}


// COUNTRY_KOR
	public String getVoCountryKOR() {
		return voCountryKOR;
	}
	public void setVoCountryKOR(String voCountryKOR) {
		this.voCountryKOR = voCountryKOR;
	}


// SPECIAL_RELATION
	public String getVoSpecialRelation() {
		return voSpecialRelation;
	}
	public void setVoSpecialRelation(String voSpecialRelation) {
		this.voSpecialRelation = voSpecialRelation;
	}


// TRADE_STOP
	public String getVoTradeStop() {
		return voTradeStop;
	}
	public void setVoTradeStop(String voTradeStop) {
		this.voTradeStop = voTradeStop;
	}


// CONTRACT_PERIOD_S
	public LocalDate getVoContractPeriod_S() {
		return voContractPeriod_S;
	}
	public void setVoContractPeriod_S(LocalDate voContractPeriod_S) {
		this.voContractPeriod_S = voContractPeriod_S;
		
		if(this.voContractPeriod_S != null) {
			this.voContractPeriod_S_String = this.voContractPeriod_S.toString();
		}
	}
	
	// CONTRACT_PERIOD_S_STRING
	public String getVoContractPeriod_S_String() {
		return voContractPeriod_S_String;
	}


// CONTRACT_PERIOD_E
	public LocalDate getVoContractPeriod_E() {
		return voContractPeriod_E;
	}
	public void setVoContractPeriod_E(LocalDate voContractPeriod_E) {
		this.voContractPeriod_E = voContractPeriod_E;
		
		if(voContractPeriod_E != null) {
			this.voContractPeriod_E_String = this.voContractPeriod_E.toString();
		}
	}
	
	// CONTRACT_PERIOD_S_STRING
	public String getVoContractPeriod_E_String() {
		return voContractPeriod_E_String;
	}


// REGI_INFO_MAN
	public String getVoRegiInfoMan() {
		return voRegiInfoMan;
	}
	public void setVoRegiInfoMan(String voRegiInfoMan) {
		this.voRegiInfoMan = voRegiInfoMan;
	}


// REGI_INFO_DATE
	public Timestamp getVoRegiInfoDate() {
		return voRegiInfoDate;
	}
	public void setVoRegiInfoDate(Timestamp voRegiInfoDate) {
		this.voRegiInfoDate = voRegiInfoDate;
		
		if(this.voRegiInfoDate != null) {
			this.voRegiInfoDate_String = this.voRegiInfoDate.toString();
		}
	}
	
	// REGI_INFO_DATE_STRING
	public String getVoRegiInfoDate_String() {
		return this.voRegiInfoDate_String;
	}
	
	


// MODI_INFO_MAN
	public String getVoModiInfoMan() {
		return voModiInfoMan;
	}
	public void setVoModiInfoMan(String voModiInfoMan) {
		this.voModiInfoMan = voModiInfoMan;
	}


// MODI_INFO_DATE
	public Timestamp getVoModiInfoDate() {
		return voModiInfoDate;
	}
	public void setVoModiInfoDate(Timestamp voModiInfoDate) {
		this.voModiInfoDate = voModiInfoDate;
		
		if(voModiInfoDate != null) {
			this.voModiInfoDate_String = this.voModiInfoDate.toString();
		}
	}
	
	// MODI_INFO_DATE_STRING
	public String getVoModiInfoDate_String() {
		return this.voModiInfoDate_String;
	}
}
