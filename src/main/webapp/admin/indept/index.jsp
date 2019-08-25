<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/themes/icon.css">
<script type="text/javascript" src="<%=basePath%>js/easyui/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
	$(function(){
		$('#dg').datagrid({   
		    url:'findAll',
		    fitColumns:true, 
		    striped:true,  
		    pageSize:20,
		    pagination:true,
		    title:'内设机构',
		    toolbar: '#tb',
		    columns:[[   
		        {field:'indeptid',checkbox:'checkbox',title:'编号',width:100,align:'center'},   
		        {field:'indeptname',title:'机构名称',width:100,align:'center'},   
		        {field:'operate',title:'操作',width:100,align:'center',formatter: function(value,row,index){
			        var btns="<a id=\"btn\" href=\"javascript:deleteItem("+row.indeptid+")\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-remove'\">删除</a>";
			        btns += "<a id=\"btn\" href=\"javascript:findById("+row.indeptid+")\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-edit'\">修改</a>";
					return btns;
				}
			        }   
		    ]],
		    onLoadSuccess: function(index,field,value){
				$('.easyui-linkbutton').linkbutton({   
				});  
			}     
		}); 
	}); 
	function deleteItem(indeptid){
		$.messager.confirm('Confirm','Are you sure you want to delete record?',function(r){   
		    if (r){   
		    	$.getJSON("delete",{indeptid:indeptid},function(json){
		    		$.messager.show({
		    			title:'My Title',
		    			msg:json.msg,
		    			timeout:5000,
		    			showType:'slide'
		    		});
					$('#dg').datagrid('reload');    // reload the current page data  
				});
		    }   
		});  
		
	}
	function deleteBatch(){
		var indeptidstring="";
		var selections=$('#dg').datagrid('getSelections');  // fix the 'name' column size
		for(var i=0;i<selections.length;i++){
			indeptidstring += selections[i].indeptid;
			if(i<selections.length-1){
				indeptidstring += ",";
			}
		}
		$.getJSON("deleteBatch",{indeptidstring:indeptidstring},function(json){
			$.messager.show({
    			title:'My Title',
    			msg:json.msg,
    			timeout:5000,
    			showType:'slide'
    		});
			$('#dg').datagrid('reload');    // reload the current page data
		});
	}

	function findById(indeptid){
		$('#ff').form('clear');	// 从URL加载 
		$('#win').window('open');  // open a window 
			$.getJSON("findById",{indeptid:indeptid},function(json){
				$('#ff').form('load',json);	// 从URL加载 
			});
		
	}
	function openForm(){
		$('#ff').form('clear');	// 从URL加载 
		$('#win').window('open');  // open a window 
		
	}
	function dosave(){
		// call 'submit' method of form plugin to submit the form   
		var indeptid=$("#indeptid").val();
		var path="save";
		if(indeptid!=null&&indeptid!=""&&indeptid!=undefined){
			path="update";
		}
		$('#ff').form('submit', {   
		    url:path,   
		    onSubmit: function(){   
		        // do some check   
		        // return false to prevent submit;   
		    },   
		    success:function(data){   
		        var json=eval("("+data+")");
		        $.messager.show({
	    			title:'My Title',
	    			msg:json.msg,
	    			timeout:5000,
	    			showType:'slide'
	    		});
		        $('#win').window('close');
				$('#dg').datagrid('reload');    // reload the current page data
		    }   
		});  
	}
</script>
</head>
<body>
<table id="dg"></table>  
<div id="tb">
<a href="javascript:deleteBatch()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">批量删除</a>
<a href="javascript:openForm()" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true">增加</a>
</div>

<div id="win" class="easyui-window" title="My Window" style="width:600px;height:400px"  
        data-options="iconCls:'icon-save',modal:true,closed:true"> 
        <form id="ff" method="post">  
       		<input type="hidden" name="indeptid" id="stid">
		    <div>  
		        <label for="indeptname">机构名称:</label>  
		        <input class="easyui-validatebox" type="text" name="indeptname" data-options="required:true" />  
		    </div>  
		    <div>   
		        <input type="button" onclick="dosave()" value="保存"  />  
		    </div> 
		</form>   
</div>  
</body>
</html>