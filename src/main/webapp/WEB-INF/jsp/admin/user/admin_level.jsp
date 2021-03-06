<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'list.jsp' starting page</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/styles/common/back/admin_styles_css.jsp"%>
 <%@ include file="/styles/common/back/admin_styles_js.jsp"%>
</head>
<body>
<div class="page-container">
        
	  		<div class="mt-20">
          <table class="table table-border table-bordered table-bg table-hover table-sort">
		    	<thead>
		    		<tr class="text-c">
						<th>
						<input type="checkbox"/>
						</th>
						<th>序号</th>
						<th>等级名称</th>
						<th>等级介绍</th>
						<th>等级图标</th>	
						<th>所需积分</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${levels}" var="lv" varStatus="u">
						<tr class="text-c">
							<td>
							<input type="checkbox" name="levelId" value="${lv.levelId}"/>
							</td>
							<td>${u.count }</td>
							<td>${lv.levelName}</td>
							<td>${lv.levelContent}</td>
							<td>
							<img style="width:150px;" alt="暂无图片" src="<%=basePath%>${lv.levelImg}">
							</td>
							<td>${lv.levelNum==null?'--':lv.levelNum}</td>
							<td width="20%">
							<a title="修改" href="javascript:;" onclick="edit('人员修改','<%=basePath%>adminUser/toLevelUpdate','${lv.levelId}','800','500')" class="ml-5" style="text-decoration:none">
									<i class="Hui-iconfont">&#xe6df;</i>
								</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>	
		    	</table>
  </div>
		</div>
	<script type="text/javascript">
	// 分页
	$('.table-sort').dataTable({
		"aaSorting": [[ 0, "asc" ]],//默认第几个排序 
		"bStateSave": false,//状态保存
		"aLengthMenu" : [ 5,10,15 ] ,
		"aoColumnDefs": [
		  {"orderable":false,"aTargets":[0]}// 写出：不参与   排序的列
		]
	});
	
	//删除
	function del(obj,userId,userName){
		layer.confirm("确定要删除  <span style='color:red'>" + userName + "</span> 汽车吗?",function(index){
			var url = "<%=basePath%>adminCar/deleteCar";
			var params = {};
			params.userId = userId;
			$.post(url,params,function(result){
				if(result > 0){
					$(obj).parents("tr").remove();
					layer.msg('已删除!',{icon:1,time:1000});
				}else{
					layer.msg('删除失败!',{icon:1,time:1000});
				}
			});
		});
	}
	// 修改
	function edit(title,url,levelId,w,h){
		url = url + "?levelId=" + levelId;
		layer_show(title,url,w,h);
	}
	</script>
</body>

</html>