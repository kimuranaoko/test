<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="./css/style.css">
	<title>ユーザー情報入力</title>
	<link rel="stylesheet" type="text/css" href="./css/style.css"/>
</head>
<body>
	<jsp:include page="header.jsp"/>
	<div id="contents">
	<h1>ユーザー情報入力画面</h1>

	<s:if test="!#session.familyNameErrorMessageList.isEmpty()">
		<div class="error">
		<div class="error-message">
			<s:iterator value="#session.familyNameErrorMessageList"><s:property /><br></s:iterator>
		</div>
		</div>
	</s:if>
	<s:if test="!#session.firstNameErrorMessageList.isEmpty()">
			<div class="error">
			<div class="error-message">
				<s:iterator value="#session.firstNameErrorMessageList"><s:property /><br></s:iterator>
			</div>
			</div>
	</s:if>
	<s:if test="!session.familyNameKanaErrorMessageList.isEmpty()">
		<div class="error">
		</div>
	</s:if>
	</div>
</body>
</html>