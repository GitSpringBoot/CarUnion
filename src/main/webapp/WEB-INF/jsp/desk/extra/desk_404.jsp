<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'list.jsp' starting page</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/styles/common/desk/styles_css.jsp"%>
<%@ include file="/styles/common/desk/styles_js.jsp"%>
</head>
<style type="text/css">
html, body {margin:0px;height:100%; font-family:"微软雅黑";}
i{ font-style:normal;}
.pr{ position:relative;}
.pa{ position:absolute;}
.fl{ float:left;}
.mb15{ margin-bottom:15px;}
.error_new_bg { height: 100%; width: 100%; }
.error_new_content { width: 100%; height: 100%; text-align: center; margin: 0 auto; background: url(/images/error-1.png) no-repeat center center; min-width: 1000px; }
.error_new { top: 50%; left: 50%; margin: -185px 0 0 -500px; height: 371px; width: 1000px; }
.error_new_left { width: 56%; text-align: right; -webkit-animation: desc_link ease-in-out 1.5s infinite }
@-webkit-keyframes desc_link { 0% {
	-webkit-transform:translateY(0);
	-ms-transform:translateY(0);
	-0-transform:translateY(0);
	-moz-transform:translateY(0);
	transform:translateY(0);
	}
	50% {
		-webkit-transform:translateY(1em);
		-ms-transform:translateY(1em);
		-0-transform:translateY(1em);
		-moz-transform:translateY(1em);
		transform:translateY(1em);
	}
	100% {
		-webkit-transform:translateY(0);
		-ms-transform:translateY(0);
		-0-transform:translateY(0);
		-moz-transform:translateY(0);
		transform:translateY(0);
	}
}
.error_new_right { width: 40%; text-align: left; margin-top:7%; margin-left: 4%; vertical-align: middle }
.error_new_right_btn { width: 150px; height: 46px; background: #F96900; display: inline-block; color: #fff; line-height: 46px; border-radius: 3px; text-align: center; z-index: 10 }
.error_new_right_btn a { color: #fff; text-align: center; font-size: 16px; width: 150px; height: 46px; display: inline-block; }

.error_detail { margin:0px; height: auto; }
.error_detail .error_p_title{ font-size: 28px; color: #fff;}
.error_detail .error_p_con{ font-size:14px; margin-top:10px; line-height: 20px; color:#fff;}


.type-2 { background: #F96900; text-indent: 0; height: 46px; width: 150px; border-radius: 3px; }
.type-3 { background: #F96900; text-indent: 0; height: 46px; width: 150px; border-radius: 3px; }
.type-2 i { position: absolute; width: 150px; height: 46px; line-height: 46px; display: block; top: 0; opacity: 1; left: 0; box-sizing: border-box; -moz-box-sizing: border-box; -webkit-transition: all 0.3s linear; transition: all 0.3s linear; text-align: center; color: #ffe8e8; border-radius: 3px; }
.type-2 i:nth-of-type(2), .type-2 i:nth-of-type(3) { -webkit-transform: rotateY(-90deg); transform: rotateY(-90deg); transform-origin: 0 0; -webkit-transform-origin: 0 0; clip: rect(0,60px,9999px,0); border-shadow: 4px; }
.type-2 i:nth-of-type(3) { transform-origin: 100% 100%; -webkit-transform-origin: 100% 100%; -webkit-transform: rotateY(90deg); transform: rotateY(90deg); clip: rect(0,9999px,9999px,60px); border-shadow: 4px; }
.type-2:hover i:nth-of-type(2), .type-2:hover i:nth-of-type(3) { -webkit-transform: rotateY(0); transform: rotateY(0); background: #fff; color: #fff; }
.type-2:hover i:first-of-type { background: #fff; }
.type-2 i:last-of-type { opacity: 0; background: #fff; color: #ff464b; -webkit-transition: none; transition: none; }
.type-3 i:last-of-type { color: #F96900; }
.type-2:hover i:last-of-type { opacity: 1; -webkit-transition: all 0.05s linear 0.3s; transition: all 0.05s linear 0.3s; }
</style>



<body style="background:#0186a7;">

<!---404--->
<div class="error_new_bg pr">
	<div class="error_new_content">
		<div class="error_new pa">
			<div class="fl error_new_left"><img src="<%=basePath%>img/desk/index_img/error-1.png"></div>
			<div class="fl error_new_right">
				<div class="error_detail">
					<p class="error_p_title">哎呦~ 老司机居然累倒了!</p>
					<p class="error_p_con">※ 别急，工程师正在紧急处理，马上就好。</p>
					<p class="error_p_con">※ 您可致电400-877-9288,通知阳光好车开发人员!</p>
					<p class="error_p_con">※ 感谢您对阳光好车的支持,请您耐心等待!</p>
				</div>

				<p class="error_new_right_btn pr">
					<a href="<%=basePath%>desk/toIndex" class="type-2 type-3">
						<i> 返回首页</i>
						<i> 返回首页 </i>
						<i> 返回首页 </i>
						<i> 返回首页 </i>
					</a>
				</p>
			</div>
		</div>
	</div>
</div>

</body>
</html>
