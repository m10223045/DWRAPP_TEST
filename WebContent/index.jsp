<%--
    Document   : index
    Created on : 2008/5/27, 下午 05:24:37
    Author     : Grady
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DWR Application</title>
<script type='text/javascript' src='/DWRApp/dwr/engine.js'></script>
<script type='text/javascript' src='/DWRApp/dwr/interface/MidLayer.js'></script>
<script type='text/javascript' src='/DWRApp/dwr/util.js'></script>
<!-- 上面三個script file是DWR提供的 -->
<script>
	window.onload = function() {
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

			//設定使用者輸入的值
			//dwr.util是DWR提供的javascript工具
			ct.setValues(dwr.util.getValue("areaId"), 
						 dwr.util.getValue("minBudget"), 
						 dwr.util.getValue("maxBudget"),
						 dwr.util.getValue("minSize"), 
						 dwr.util.getValue("maxSize"));

			//送出篩選條件
			//直接呼叫後端MidLayer class的method
			//第一個參數是使用者輸入的條件
			//第二個參數是callback要執行的程式碼
			alert("check point 2");
			MidLayer.getHouseList(ct, function(data) {

				var resultDiv = document.getElementById("resultDiv");
				var nInnerHTML = '';

				//先清空原有的查詢結果
				resultDiv.innerHTML = nInnerHTML;
				
				alert('check: ' + data[0]['id']);

				//把回傳的List解開
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
</script>
</head>
<body>
	<div>
		<form>
			<fieldset>
				<legend>購屋條件</legend>
				<select id="areaId">
					<option value="1">台北市</option>
					<option value="2">台中市</option>
					<option value="3">台南市</option>
					<option value="4">高雄市</option>
				</select> 
				最低預算:<input type="text" id="minBudget" size="30" /> 
				最高預算:<input type="text" id="maxBudget" size="30" /> 
				最低坪數:<input type="text" id="minSize" size="30" /> 
				最高坪數:<input type="text" id="maxSize" size="30" /> 
				<input type="button" id="queryBtn" value="  查詢  " />
			</fieldset>
		</form>
	</div>
	<div id="check1"></div>
	<div id="check2"></div>
	<div id="resultDiv"></div>
</body>
</html>