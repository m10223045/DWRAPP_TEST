/**
 * 
 */
window.onload = function() {
	alert("ttt");
		var check1 = document.getElementById("check1");
		var check2 = document.getElementById("check2");
		
		function Criterion() {
			var areaId, minBudget, maxBudget, minSize, maxSize;
		}

		Criterion.prototype.setValues = function(areaId, minBudget, maxBudget,
				minSize, maxSize) {
			this.areaId = areaId;
			this.minBudget = minBudget;
			this.maxBudget = maxBudget;
			this.minSize = minSize;
			this.maxSize = maxSize;
		}
		alert("check point 1");

		var queryBtn = document.getElementById("queryBtn");
		queryBtn.onclick = function() {
			var ct = new Criterion();
			console.log(ct);

			// 設定使用者輸入的值
			// dwr.util是DWR提供的javascript工具
			ct.setValues(dwr.util.getValue("areaId"), 
						 dwr.util.getValue("minBudget"), 
						 dwr.util.getValue("maxBudget"),
						 dwr.util.getValue("minSize"), 
						 dwr.util.getValue("maxSize"));

			// 送出篩選條件
			// 直接呼叫後端MidLayer class的method
			// 第一個參數是使用者輸入的條件
			// 第二個參數是callback要執行的程式碼
			alert("check point 2");
			MidLayer.getHouseList(ct, function(data) {

				var resultDiv = document.getElementById("resultDiv");
				var nInnerHTML = '';

				// 先清空原有的查詢結果
				resultDiv.innerHTML = nInnerHTML;
				
				alert('check: ' + data[0]['id']);

				// 把回傳的List解開
				for (var i = 0; i < data.length; i++) {
					nInnerHTML += 'id = ' + data[i]['id'] + ' address = '
							+ data[i]['address'] + ' price = '
							+ data[i]['price'] + ' size = ' + data[i]['size']
							+ '</br>';
				}
				resultDiv.innerHTML = nInnerHTML;
			});
		}
}