<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>
	<title>Home画面</title>

	<style type="text/css">

		body{
			margin:0;
			padding:0;
			line-height:1.6;
			letter-spacing:1px;
			font-family:Verdana,Helvetica,sans-serif;
			font-size:14px;
			color:#191970;
			background:#fbfefe;
			background-image: url("https://www.zakzak.co.jp/entertainment/ent-news/images/20140503/enn1405030830005-p2.jpg");
			background-position:  left;
			background-repeat: no-repeat;
			background-size:23%;
		}

		table{
			text-align:center;
			margin:0 auto;
		}

		#top{
			width:780px;
			margin:30px auto;
			border:3px solid  #191970;
		}

		#header{
			width:100%;
			height:80px;
			background-color:#191970;
		}

		#main{
			width:100%;
			height:500px;
			text-align:center;
		}

		#footer{
			width:100%;
			height:80px;
			background-color:#191970;
			clear:both;
		}
	</style>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>

	<div id="main">
		<div id="top">
			<p>♪WE LOVE HANAGATAHIKARU♪</p>
		</div>
		<div>
			<s:form action="HomeAction">
				<s:submit value="チケット購入"/>
			</s:form>
		</div>
	</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>