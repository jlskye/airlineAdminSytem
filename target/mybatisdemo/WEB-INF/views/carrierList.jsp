﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta name="content-type" content="text/html; charset=UTF-8">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCT
<!DOCTYPE HTML>
<html>
<head>
	<base href="/carriertList.jsp" />
	<meta charset="utf-8">
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
	<meta http-equiv="Cache-Control" content="no-siteapp" />
	<!--[if lt IE 9]>
	<script type="text/javascript" src="lib/html5shiv.js"></script>
	<script type="text/javascript" src="lib/respond.min.js"></script>
	<![endif]-->
	<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
	<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
	<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
	<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
	<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
	<!--[if IE 6]>
	<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
	<script>DD_belatedPNG.fix('*');</script>
	<![endif]-->
	<title>航司列表</title>
</head>
<body>
<%@ page isELIgnored="false" %>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 航司列表 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<%--<div class="text-c"> 日期范围：--%>
	<%--<input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'logmax\')||\'%y-%M-%d\'}' })" id="logmin" class="input-text Wdate" style="width:120px;">--%>
	<%-----%>
	<%--<input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'logmin\')}',maxDate:'%y-%M-%d' })" id="logmax" class="input-text Wdate" style="width:120px;">--%>
	<%--<input type="text" name="" id="" placeholder=" 图片名称" style="width:250px" class="input-text">--%>
	<%--<button name="" id="" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 搜图片</button>--%>
	<%--</div>--%>
	<div class="cl pd-5 bg-1 bk-gray mt-20">
		<span class="l">
		<a href="javascript:;" onclick="datadel($('.myCheck').children(':first-child').children(':first-child'))" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a>
		<a class="btn btn-primary radius" onclick="picture_add('添加航司','carrier-add-company.html')" href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 添加航司</a>
		</span>
		<span class="r"></span> </div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-bg table-hover table-sort">
			<thead>
			<tr class="text-c  ">
				<th width="40"><input name="" type="checkbox" value=""></th>
				<th width="80"> 编号</th>
				<th >LOGO</th>
				<th width="100">公司名</th>
				<th width="100">公司代码</th>
				<th >联系电话</th>
				<th width="100">操作</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach items="${requestScope.carrierList}" var="carrier">
				<tr class="text-c myCheck">
					<td><input name="" type="checkbox" value=""></td>
					<td>${carrier.id}</td>
					<td><img src="../../images/${carrier.picpath}" width=80 height=80/> </td>
					<td>${carrier.carrierName}</td>
					<td> ${carrier.carrierId}</td>
					<td>${carrier.landline}</td>
					<td class="td-manage">
							<%--<a style="text-decoration:none" class="ml-5" onClick="picture_edit('修改公司信息','client-modify-user.html',${carrier.id},'${carrier.pic}',${carrier.cname},${carrier.code},${carrier.landline} )" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a>--%>
						<a style="text-decoration:none" class="ml-5" onClick="picture_del(this,${carrier.id})" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>



</div>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
    $('.table-sort').dataTable({
        "aaSorting": [[ 1, "desc" ]],//默认第几个排序
        "bStateSave": true,//状态保存
        "aoColumnDefs": [
            //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
            {"orderable":false,"aTargets":[0,5]}// 制定列不参与排序
        ]
    });

    /*图片-添加*/
    function picture_add(title,url){
        var index = layer.open({
            type: 2,
            title: title,
            content: url
        });
        layer.full(index);
    }

    /*图片-查看*/
    function picture_show(title,url,id){
        var index = layer.open({
            type: 2,
            title: title,
            content: url
        });
        layer.full(index);
    }

    /*图片-审核*/
    function picture_shenhe(obj,id){
        layer.confirm('审核文章？', {
                btn: ['通过','不通过'],
                shade: false
            },
            function(){
                $(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="picture_start(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
                $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
                $(obj).remove();
                layer.msg('已发布', {icon:6,time:1000});
            },
            function(){
                $(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="picture_shenqing(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
                $(obj).parents("tr").find(".td-status").html('<span class="label label-danger radius">未通过</span>');
                $(obj).remove();
                layer.msg('未通过', {icon:5,time:1000});
            });
    }

    /*图片-下架*/
    function picture_stop(obj,id){
        layer.confirm('确认要下架吗？',function(index){
            $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="picture_start(this,id)" href="javascript:;" title="发布"><i class="Hui-iconfont">&#xe603;</i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已下架</span>');
            $(obj).remove();
            layer.msg('已下架!',{icon: 5,time:1000});
        });
    }

    /*图片-发布*/
    function picture_start(obj,id){
        layer.confirm('确认要发布吗？',function(index){
            $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="picture_stop(this,id)" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
            $(obj).remove();
            layer.msg('已发布!',{icon: 6,time:1000});
        });
    }

    /*图片-申请上线*/
    function picture_shenqing(obj,id){
        $(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">待审核</span>');
        $(obj).parents("tr").find(".td-manage").html("");
        layer.msg('已提交申请，耐心等待审核!', {icon: 1,time:2000});
    }

    /*图片-编辑*/
    function picture_edit(title,url,id,uname,phone,idNumber,assets){
        var index = layer.open({
            type: 2,
            title: title,
            content: url,
            success: function(layero, index) {
                var body = layer.getChildFrame('body', index);//建立父子联系
                var iframeWin = window[layero.find('iframe')[0]['name']];//得到iframe页的窗口对象，执行iframe页的方法：

                var id_label = body.find('.modifyID');
                var unameObj = body.find("#uname");
                var phoneObj = body.find("#phone");
                var idNumberObj = body.find("#idNumber");
                var assetsObj = body.find("#assets");
                $(unameObj).val(uname);
                $(phoneObj).val(phone);
                $(idNumberObj).val(idNumber);
                $(assetsObj).val(assets);
                $(id_label).text(id);

            }
        });
        layer.full(index);
    }

    /**批量删除**/
    function datadel(obj){
//        alert($(obj).get());
//        alert($(obj).is(':checked'));
//        alert( $("input[type='checkbox']").is(':checked'));
        var idArray = [];
        $(":checkbox:checked").each(function () {
            var tablerow = $(this).parents("tr");
            var id = tablerow.find("td").eq(1).text();
            idArray.push(id);
        });
        var idString=idArray.join(",");
        // alert("idArray"+idString);
        layer.confirm('确认要删除吗？',function(index){
            layer.closeAll('dialog');

            window.location.reload();
            $.ajax({
                type: 'POST',
                url: "Carrier/deleteById",
                data:{"id":idString},
                success: function(data){
                    $(obj).parents("tr").remove();
                    layer.msg('已删除!',{icon:1,time:1000});
//                    window.location.href="javascript:location.replace(location.href);"
//                    window.location.reload();

                },
                error:function(data) {
                    console.log(data.msg);
                },
            });
        });
    }


    /*图片-删除*/
    function picture_del(obj,id){
//        $(obj).parents("tr").remove();
//        $("input[type='checkbox']").is(':checked')
//        $($(obj).parent().parent().children(':first-child')
//		alert($(obj).parent().parent().children(':first-child').children(':first-child').get());
//		alert($(obj).parent().parent().children(':first-child').children(':first-child').is(':checked'));
//		alert($(obj).parent().parent().children(':first-child input[type="checkbox"] ').is(':checked'));

        if( $(obj).parent().parent().children(':first-child').children(':first-child').is(':checked')){
            // alert("id: "+id);
            var idArray = [];
            idArray.push(id);
            var idString=idArray.join(",");
            // alert("idArray"+idString);
            layer.confirm('确认要删除吗？',function(index){
                layer.closeAll('dialog');

                window.location.reload();
                $.ajax({
                    type: 'POST',
                    url: "Carrier/deleteById",
                    data:{"id":idString},
                    success: function(data){
                        $(obj).parents("tr").remove();
                        layer.msg('已删除!',{icon:1,time:1000});
//                    window.location.href="javascript:location.replace(location.href);"
//                    window.location.reload();

                    },
                    error:function(data) {
                        console.log(data.msg);
                    },
                });
            });
        }
    }
</script>
</body>
</html>