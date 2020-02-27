let parsedJSON = null;
let insertButtonURL;

const insertURL = "/insertAccountManagerData.do";
const updateURL = "/updateAccountManagerData.do";

// 초기화
$(function() {
	insertButtonURL = insertURL;
});


// 입력창 초기화
	function initPage(context) {
		location.href = context + "/accountManagerView.do";
	}


// 거래처 검색버튼 메서드
	function searchData(context) {
		const resultContainerTable = $(".resultContainer").children("table").children("tbody");
		
		const voBusiNum = $(".searchVoBusiNum").val();
		const voCustom = $(".searchVoCustom").val();
		
		$.ajax({
			type: "POST",
			async: true,
			url: context + "/searchAccountManagerData.do",
			dataType: "TEXT",
			data: {
				"voBusiNum": voBusiNum,
				"voCustom": voCustom
			},
			success: function(jsonString, status) {
				insertButtonURL = updateURL;
				
				parsedJSON = JSON.parse(jsonString);
				$(".searchCustomData").remove();
				
				if(parsedJSON.length == 0) {
					alert("데이터를 찾을 수 없습니다.");
					return;
				}
				
				for(let i = 0; i < parsedJSON.length; i++) {
					const tr = $("<tr>").attr({
						"class": "searchCustomData",
					});
					const newBusiNum = $("<td>").text(parsedJSON[i].customVO.voBusiNum);
					const newCustom = $("<td>").text(parsedJSON[i].customVO.voCustom);
					const idxValue = $("<input>").attr({
						"class": "idxValue",
						"type": "hidden"
					});
					$(idxValue).val(i);
					
					$(tr).dblclick(function() {
						alert("idxValue : " + $(idxValue).val());
						viewTotalData();
					});
					
					$(tr).append(newBusiNum);
					$(tr).append(newCustom);
					$(tr).append(idxValue);
					
					$(resultContainerTable).append(tr);
				}
				
				/* 출력형식
	            <tr class="searchCustomData">
	                <td>111-11-11111</td>
	                <td>롯데마트</td>
	            </tr>
	            */
			}
		});
	}
	
	
	function viewTotalData() {
		/* CUSTOM 데이터 */
		$(".voBusiNum").val(parsedJSON.customVO.voBusiNum);
		$(".voBusiNumOrigin").val(parsedJSON.customVO.voBusiNum);
		$(".voCustom").val(parsedJSON.customVO.voCustom);
		$(".voShort").val(parsedJSON.customVO.voShort);
		
		$(".voCEO").val(parsedJSON.customVO.voCEO);
		$(".voChargePerson").val(parsedJSON.customVO.voChargePerson);
		$(".voBusiCondition").val(parsedJSON.customVO.voBusiCondition);
		$(".voItem").val(parsedJSON.customVO.voItem);
		$(".voPostNum").val(parsedJSON.customVO.voPostNum);
		
		$(".voAddr1").val(parsedJSON.customVO.voAddr1);
		$(".voAddr2").val(parsedJSON.customVO.voAddr2); // jj
		
		$(".voTEL").val(parsedJSON.customVO.voTEL);
		$(".voFAX").val(parsedJSON.customVO.voFAX);
		$(".voHomePage").val(parsedJSON.customVO.voHomePage);
		
		
		const voCoYN = parsedJSON.customVO.voCoYN;
		if(voCoYN == "N") {
			$(".voCoYN_N").prop("checked", true);
		}
		
		const voForeignYN = parsedJSON.customVO.voForeignYN;
		if(voForeignYN == "Y") {
			$(".voForeignYN_Y").prop("checked", true);
		}
		
		const voTaxYN = parsedJSON.customVO.voTaxYN;
		if(voTaxYN == "N") {
			$(".voTaxYN").val("N");
		}
		
		$(".voCountryENG").val(parsedJSON.customVO.voCountryENG);
		$(".voCountryKOR").val(parsedJSON.customVO.voCountryKOR);
		
		const voSpecialRelation = parsedJSON.customVO.voSpecialRelation;
		if(voSpecialRelation == "Y") {
			$(".voSpecialRelation").prop("checked", true);
		}
		
		const voTradeStop = parsedJSON.customVO.voTradeStop;
		if(voTradeStop == "Y") {
			$(".voTradeStop").prop("checked", true);
		}
		
		$(".voContractPeriod_S").val(parsedJSON.customVO.voContractPeriod_S_String);
		$(".voContractPeriod_E").val(parsedJSON.customVO.voContractPeriod_E_String);
		
		$(".voRegiInfoMan").val(parsedJSON.customVO.voRegiInfoMan);
		$(".voRegiInfoDate").val(parsedJSON.customVO.voRegiInfoDate_String);
		
		$(".voModiInfoMan").val(parsedJSON.customVO.voModiInfoMan);
		$(".voModiInfoDate").val(parsedJSON.customVO.voModiInfoDate_String);
		
		/* ACCOUNT 데이터 */
		$(".voFactory").val(parsedJSON.accountVO.voFactory);
		$(".voTradeBank").val(parsedJSON.accountVO.voTradeBank);
		$(".voAccountNum").val(parsedJSON.accountVO.voAccountNum);
	}
	
	
// 거래처 데이터 저장버튼 메서드
	function insertData(context) {
		$.ajax({
			type: "POST",
			async: true,
			url: context + insertButtonURL,
			dataType: "TEXT",
			data: {
				"voBusiNum": $(".voBusiNum").val(),
				"voBusiNumOrigin": $(".voBusiNumOrigin").val(),
				"voCustom": $(".voCustom").val(),
				"voShort": $(".voShort").val(),
				
				"voCEO": $(".voCEO").val(),
				"voChargePerson": $(".voChargePerson").val(),
				"voBusiCondition": $(".voBusiCondition").val(),
				"voItem": $(".voItem").val(),
				"voPostNum": $(".voPostNum").val(),
				
				"voAddr1": $(".voAddr1").val(),
				"voAddr2": $(".voAddr2").val(),
				
				"voTEL": $(".voTEL").val(),
				"voFAX": $(".voFAX").val(),
				"voHomePage": $(".voHomePage").val(),
				
				"voCoYN": $(".voCoYN:checked").val(),
				"voForeignYN": $(".voForeignYN:checked").val(),
				"voTaxYN": $(".voTaxYN").val(),
				
				"voCountryENG": $(".voCountryENG").val(),
				"voCountryKOR": $(".voCountryKOR").val(),
				
				"voSpecialRelation": $(".voSpecialRelation:checked").val(),
				"voTradeStop": $(".voTradeStop:checked").val(),
				
				"voContractPeriod_S": $(".voContractPeriod_S").val(),
				"voContractPeriod_E": $(".voContractPeriod_E").val(),
				
				"voRegiInfoMan": $(".voRegiInfoMan").val(),
				"voRegiInfoDate": $(".voRegiInfoDate").val(),
				"voModiInfoMan": $(".voModiInfoMan").val(),
				"voModiInfoDate": $(".voModiInfoDate").val(),
				
				"voFactory": $(".voFactory").val(),
				"voTradeBank": $(".voTradeBank").val(),
				"voAccountNum": $(".voAccountNum").val()
			},
			success: function(result, status) {
				if(result == 1) {
					alert("데이터 저장 완료");
					
				} else {
					alert("데이터 저장 실패...");
				}
				
				location.href = context + "/accountManagerView.do";
			}		
		});
	}
	
	
// 거래처 데이터 삭제버튼 메서드
	function deleteData(context) {
		const voBusiNum = $(".voBusiNum").val();
		
		$.ajax({
			type: "POST",
			async: true,
			url: context + "/deleteAccountManagerData.do",
			dataType: "TEXT",
			data: {
				"voBusiNum": voBusiNum
			},
			success: function(resultValue, status) {
				if(resultValue > 0) {
					alert(voBusiNum + " 데이터가 삭제 되었습니다.");
					location.href = context + "/accountManagerView.do";
					
				} else {
					alert(voBusiNum + " (은)는 존재하지 않는 데이터 입니다.");
				}
			}
		});
	}