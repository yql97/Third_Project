<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" import="java.util.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	 response.setCharacterEncoding("UTF-8");
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <base href="<%=basePath%>">
<title>后台登录</title>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="Shortcut Icon" href="images/favicon.ico">
    <link rel='stylesheet' type='text/css' href='css/IERegister.css'>
	
</head>
  
  <body class="body2">
   <script type="text/javascript">
		function getOs() 
		{ 
		    var OsObject = ""; 
		   if(navigator.userAgent.indexOf("MSIE")>0) { 
		        return "MSIE";
		   } 
		   if(isFirefox=navigator.userAgent.indexOf("Firefox")>0){ 
		        return "Firefox"; 
		   } 
		   if(isSafari=navigator.userAgent.indexOf("Safari")>0) { 
		        return "Safari"; 
		   }  
		   if(isCamino=navigator.userAgent.indexOf("Camino")>0){ 
		        return "Camino"; 
		   } 
		   if(isMozilla=navigator.userAgent.indexOf("Gecko")>0){ 
		        return "Gecko"; 
		   } 
		} 
		if(getOs() == "MSIE"){
			document.write("<link rel='stylesheet' type='text/css' href='css/IERegister.css'>");
		}
		if(getOs() == "Firefox"){
			document.write("<link rel='stylesheet' href='css/FFRegister.css' type='text/css'>");
		}
		if(getOs() == "Safari"){
			document.write("<link rel='stylesheet' href='css/GGRegister.css' type='text/css'>");
		}
		if(getOs() == "Camino"){
			alert("Camino");
		}
		if(getOs() == "Gecko"){
			alert("Gecko");
		}
	</script>
	<script type="text/javascript" src="js/jquery-1.9.js"></script>
	<script type="text/javascript">
		$(function(){
			$("#back").click(function(){
				if($("#name").val() == null || $("#name").val() == ""){
					$(".backstage_2").css("display","block");
					$(".backstage_1_5").css("display","block");
				}else if($("#pwd").val() == null || $("#pwd").val() == ""){
					$(".backstage_2").css("display","block");
					$(".backstage_1_5").css("display","block");
				}else if($("#spanCode").html() != $(".backstage_1_4_2").val()){
					$(".backstage_2").css("display","block");
					$(".backstage_1_5").css("display","block");
				}else{
					 $.ajax({dataType: "text",type: "POST",url: "AdminLogin",data:  //jquery函数 
						"name="+$("#name").val()+"&"+"pwd="+$("#pwd").val(),
						error:function(msg){
							alert("error");
						},
						success: function(msg){
						if(msg.length > 0&&(msg!=null)){
								location.href="Backstage.jsp";
							}else{
								$(".backstage_2").css("display","block");
								$(".backstage_1_5").css("display","block");
							}
						 }
					});
				}	
			});
		});
	</script>
 	 <img class="backstage" src="images/133T53031-0.jpg"></img>
   	<div class="backstage_1">
		  <div class="backstage_1_1">
		  	<h2>酷狗官网后台管理登陆系统</h2>
		  </div> 
		  <div class="backstage_1_2">
		  	<div class="backstage_1_2_1">
		  		<span>用户名：</span>
		  		<input type="text" id="name"/>
		  	</div>
		 	<div class="backstage_1_2_2">
		  		<span>密&nbsp;&nbsp;码：</span>
		  		<input type="password" id="pwd"/>
		  	</div>
		  </div>	
		  <div class="backstage_1_3">
		  	<input type="button" value="" id="back" />
		  </div>
		  <script type="text/javascript" src="js/Admin.js"></script>
		  <div class="backstage_1_4">
		  	<span class="backstage_1_4_1">验证码：</span>
		  	<input class="backstage_1_4_2" type="text" maxlength="4"/>
		  	<span class="backstage_1_4_3" id="spanCode"></span>
		  	<a onclick="createCode()">看不清，换一张</a>
		  </div>
		  <p class="backstage_1_5" style="display: none;">请勿非法登陆！</p>
		  <div class="backstage_2" style="display: none;"></div>
   	</div>
   
  </body>
</html>