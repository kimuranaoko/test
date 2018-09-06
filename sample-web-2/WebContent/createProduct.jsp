<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="./css/style.css">
		<title>商品情報作成画面</title>
		<link rel="stylesheet" type="text/css" href="./css/style.css"/>
		<script>
			$("loadFile").onchange=function(evt){
				showImage(false);
				var files=evt.target.files;
				if(files.length == 0){
					return;
					var file = file[0];
					if(!file.type.match(/image/)){
						alert('画像を選んでください');
						return;
					}
					var reader = new FileReader();
					reader.onload=function(evt){
						$("#thumb").src=reader.result;
						showImage(true);
					}
					reader.readAsDateURL(file);
				}

				function showImage(b){
					var val=b ? "block" : "none";
					$("#up_btn").style.display = val;
					$("#thumb").style.displat = val;
				}

				function $(id){
					return document.querySelector(id);
				}
			}
		</script>
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<div id="contents">
			<h1>商品情報入力画面</h1>

<!-- 			★★エラー処理未★★ -->
			<s:form action="CreateProductConfirmAction">
				<table class="vertical-list-table">
					<tr>
						<th scope="row">商品ID</th>
						<td><s:textfield name="productId" value="%{#session.productId}" label="商品ID" placeholder="商品ID" class="txt"/></td>
					</tr>
					<tr>
						<th scope="row">商品名</th>
						<td><s:textfield name="productName" value="%{#session.productName}" label="商品名" placeholder="商品名" class="txt"/></td>
					</tr>
					<tr>
						<th scope="row">商品名かな</th>
						<td><s:textfield name="productNameKana" value="%{#session.productNameKana}" label="商品名かな" placeholder="商品名かな" class="txt"/></td>
					</tr>
					<tr>
						<th scope="row">値段(円)</th>
						<td><s:textfield name="price" value="%{#session.price}" label="値段" placeholder="値段" class="txt"/></td>
					</tr>
					<tr>
						<th scope="row">商品名カテゴリ</th>
						<td><s:select name="categoryId" list="#session.mCategoryDtoList" listValue="categoryName" listKey="categoryId" class="cs-div" id="categoryId"/></td>
					</tr>
					<tr>
						<th scope="row">販売会社</th>
						<td><s:textfield name="releaseCompany" value="%{#session.releaseCompany}" label="販売会社" placeholder="販売会社" class="txt"/></td>
					</tr>
					<tr>
						<th scope="row" >商品名発売日</th>
						<td><s:textfield value="%{#session.releaseDate}" label="商品名発売日" placeholder="商品名発売日" class="txt"/></td>
					</tr>
					<tr>
						<th scope="row">商品名詳細</th>
						<td><s:textfield name="productDescription" value="%{#session.productDescription}" label="商品名詳細" placeholder="商品名詳細" class="txt"/></td>
					</tr>

					<tr>
						<th>商品画像</th>
						<td class="image"><s:file name="userImage" accept='image/jpg,image/jpeg'/></td>
					</tr>
<!-- 					<tr> -->
<!-- 						<th scope="row">商品名画像</th> -->
<!-- 						<td><input type="file" name="imageFileName" value="%{#session.imageFileName}" class="txt"/></td> -->
<%-- 						<s:hidden name="imageFileName" value=""/> --%>
<!-- 					</tr> -->

				</table>
				<div class="submit_btn_box">
					<div id=".contents-btn-set">
						<s:submit value="登録" class="submit_btn"/>
					</div>
				</div>
			</s:form>
		</div>
		<div id="footer">
			<s:include value="footer.jsp"/>
		</div>
		<script src="jquery.min.js"></script>

		<script src="jquery.datetimepicker.js"></script>
	</body>
</html>