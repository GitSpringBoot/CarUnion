<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
      <%@ include file="/styles/common/back/admin_styles_css.jsp"%>
    <title>添加仓库</title>
	</head>
  
  <body>
  <article class="page-container">
	<form action="<%=basePath%>adminRepository/insertRepository" class="form form-horizontal" id="Form" method="post">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>仓库名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" name="repName" size="50" datatype="*" nullmsg="请输入仓库名称" />
			</div>
		</div>
	    <div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>库存：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" name="repStock" size="50" datatype="*" nullmsg="请输入库存数量" />
			</div>
		</div>
	
	      <div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>地址：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<select name="disId" id="disId">
				
				 <c:forEach items="${disList}" var="dis">
				 <option value="${dis.disId}">${dis.disName}</option>
				 </c:forEach>
				</select>
			</div>
		</div>

		 <div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;" id="insertBut" />
				<input class="btn btn-success radius" type="button" value="&nbsp;&nbsp;返回&nbsp;&nbsp;" onclick="closeLayer()" />
			</div>
		</div>
	</form>
  </article>
<%@ include file="/styles/common/back/admin_styles_js.jsp"%>
  	<script type="text/javascript">
  	/* 表单校验 */
	$(function(){
		
		
		$("#Form").Validform({
			tiptype:3, 
			tipSweep:true,
			datatype:{
				"aaa" :  /^\+?(0|[1-9][0-9]*)$/
			}
		});
	});
	
	// 关闭窗口
	function closeLayer(){
		var index = parent.layer.getFrameIndex(window.name); //获取窗口索引
        parent.layer.close(index);
        return true;
	}
	
	
  	</script>
  </body>
</html>
