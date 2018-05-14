<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <%@ include file="/styles/common/back/admin_styles_css.jsp"%>
    
    <title>字典管理</title>
  </head>
  
  <body>
  	<!-- 通知、导航栏 -->
	<nav class="breadcrumb">
		<i class="Hui-iconfont">&#xe67f;</i> 首页 
		<span class="c-gray en">&gt;</span> 字典管理 
		<span class="c-gray en">&gt;</span> 字典
	</nav>
        <!-- 内容 -->
        <div class="page-container">
        	<div class="cl pd-5 bg-1 bk-gray mt-20">
				<span class="l">
					<a class="btn btn-primary radius" data-title="添加字典" href="javascript:;" onclick="add('添加字典','<%=basePath%>adminDictionary/toRepDictionaryInsert','800','500')">
					<i class="Hui-iconfont">&#xe600;</i>添加字典</a>
				</span>
  			</div>
	  		<div class="mt-20">
		    	<table class="table table-border table-bordered table-bg table-hover table-sort">
		    	<thead>
		    		<tr class="text-c">
						<th>
						<input type="checkbox"/>
						</th>
						<th>序号</th>
						<th>单位</th>
						<th>对应内容</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${dictionary}" var="dic" varStatus="u">
						<tr class="text-c">
							<td>
							<input type="checkbox" name="" value=""/>
							</td>
							<td>${u.count }</td>
							<td>${dic.dicName}</td>
							<td>${dic.dicFlag}</td>
							<td width="20%">
								<a title="修改" href="javascript:;" onclick="edit('字典修改','<%=basePath%>adminRepository/toRepDictionaryUpdate','${dis.disId}','800','500')" class="ml-5" style="text-decoration:none">
									<i class="Hui-iconfont">&#xe6df;</i>
								</a>
								&nbsp;
								<a title="删除" href="javascript:;" onclick="del(this,'${dis.disId }','${dis.disName}')" class="ml-5" style="text-decoration:none">
									<i class="Hui-iconfont">&#xe6e2;</i>
								</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>	
		    	</table>
		    </div>
		</div>
	<%@ include file="/styles/common/back/admin_styles_js.jsp"%>
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
	function del(obj,disId,disName){
		layer.confirm("确定要删除  <span style='color:red'>" + disName + "</span>地区吗?",function(index){
			var url = "<%=basePath%>adminRepository/deleteRepDistrict";
			var params = {};
			params.disId = disId;
			$.post(url,params,function(result){
				if(result > 0){
					$(obj).parents("tr").remove();
					layer.msg('已删除!',{icon:1,time:1000});
					location.reload();
				}else{
					layer.msg('删除失败!',{icon:1,time:1000});
				}
			});
		});
	}
	
	// 添加
	function add(title,url,w,h){
		layer_show(title,url,w,h);
	}
	
	// 修改
	function edit(title,url,disId,w,h){
		url = url + "?disId=" + disId;
		layer_show(title,url,w,h);
	}
	</script>	
  </body>
</html>
