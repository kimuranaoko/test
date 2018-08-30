<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="./css/style.css">
	<title>登録内容確認</title>
</head>
<body>
	<jsp:include page="header.jsp"/>
	<div id="contents">
		<h1>登録内容確認画面</h1>
		<s:form action="CreateProductCompleteAction">
			<table class="vertical-list-table">
			<tr>
				<th scope="row"><s:label value="商品ID"/></th>
				<td><s:property value="productId"/></td>
			</tr>
			<tr>
				<th scope="row"><s:label value="商品名"/></th>
				<td><s:property value="productName"/></td>
			</tr>
			<tr>
				<th scope="row"><s:label value="商品名かな"/></th>
				<td><s:property value="productNameKana"/></td>
			</tr>
			<tr>
				<th scope="row"><s:label value="値段(円)"/></th>
				<td><s:property value="price"/></td>
			</tr>
			<tr>
				<th scope="row"><s:label value="商品名カテゴリ"/></th>
				<td><s:property value="categoryName"/></td>
			</tr>
			<tr>
				<th scope="row"><s:label value="販売会社"/></th>
				<td><s:property value="releaseCompany"/></td>
			</tr>
			<tr>
				<th scope="row"><s:label value="商品名発売日"/></th>
				<td><s:property value="releaseDate"/></td>
			</tr>
			<tr>
				<th scope="row"><s:label value="商品名詳細"/>
				<td><s:property value="productDescription"/>
			</tr>
			<tr>
				<th scope="row"><s:label value="商品名画像"/>
				<td><s:property value="imageFileName"/>
			</tr>
			</table>
			<div class="submit_btn_box">
				<div id=".contents-btn-set">
					<s:submit value="登録" class="submit_btn"/>
				</div>
			</div>

			<s:hidden name="productId" value="%{productId}"/>
			<s:hidden name="productName" value="%{productName}"/>
			<s:hidden name="productNameKana" value="%{productNameKana}"/>
			<s:hidden name="price" value="%{price}"/>
			<s:hidden name="categoryName" value="%{categoryName}"/>
			<s:hidden name="releaseCompany" value="%{releaseCompany}"/>
			<s:hidden name="releaseDate" value="%{releaseDate}"/>
			<s:hidden name="productDescription" value="%{productDescription}"/>
			<s:hidden name="imageFileName" value="%{imageFileName}"/>

			<s:hidden name="categoryId" value="%{categoryId}"/>
			<s:hidden name="mCategoryDtoList" value="%{mCategoryDtoList}"/>

		</s:form>
	</div>
	<div id="footer">
		<s:include value="footer.jsp"/>
	</div>
</body>
</html>