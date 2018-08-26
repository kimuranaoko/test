<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="./css/style.css">
	<title>決済確認</title>
</head>
<body>
	<jsp:include page="header.jsp"/>
	<div id="contents">
		<h1>決済確認画面</h1>
		<div class="info">
			送り先情報を選択してください
		</div>
		<s:form id="form" action="SettlementCompleteAction">
			<table class="horizontal-list-table">
				<thead>
					<tr>
						<th><s:label value="#"/></th>
						<th><s:label value="名前"/></th>
						<th><s:label value="ふりがな"/></th>
						<th><s:label value="住所"/></th>
						<th><s:label value="電話番号"/></th>
						<th><s:label value="メールアドレス"/></th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="#session.destinationInfoDtoList"  status="st">
						<tr>
							<td>
								<s:if test="#st."
							</td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
		</s:form>
	</div>
</body>
</html>