<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/inc/taglib.inc"%>
<%@ include file="/WEB-INF/inc/script.inc"%>
<!doctype html>
<html>
<head>
<title>活动详情</title>
<jsp:include page="com/meta.jsp"></jsp:include>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/wap/css/activity.css" />
</head>
<body>
	<noscript>
		<div id="noscript">您当前的浏览器不支持JavaScript脚本</div>
	</noscript>
	<section class="container">
    <h1>${model.title}</h1>
    <p class="texts">
      <span class="from-txt">来源：${model.source}</span>
      <span>&nbsp;</span>
      <fmt:formatDate value="${model.createTime}" pattern="yyyy-M-d HH:mm:ss" />
    </p>
		<div class="rich-text" id="rich-text">
			${model.info}
			${model.content}
		</div>
		<div class="btn phone"><a href="tel:${mobile}">拨打电话</a></div>
	</section>

	<jsp:include page="com/footer-js.jsp"></jsp:include>
	<script>
		//   document.getElementById('rich-text').innerHTML = contant;
	</script>
</body>
</html>