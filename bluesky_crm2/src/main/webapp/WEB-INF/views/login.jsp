<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>蓝天集团（房产）客户管理系统</title>
    <link rel="stylesheet" type="text/css" href="Styles/base.css" />
    <link rel="stylesheet" type="text/css" href="Styles/admin-all.css" />
    <link rel="stylesheet" type="text/css" href="Styles/bootstrap.min.css" />
    <script type="text/javascript" src="Scripts/jquery-1.7.2.js"></script>
    <script type="text/javascript" src="Scripts/jquery.spritely-0.6.js"></script>
    <script type="text/javascript" src="Scripts/chur.min.js"></script>
    <link rel="stylesheet" type="text/css" href="Styles/login.css" />
    <script type="text/javascript">
    
    
	var xmlreq = null;
	if (window.XMLHttpRequest) {
		xmlreq = new XMLHttpRequest();
	} else if (window.ActiveXObject) {//Microsoft
		try {
			xmlreq = new XMLHttpRequest("Microsoft.XMLHTTP");
		} catch (e) {
			xmlreq = new XMLhttpRequest("Microsoft.xmlHttp");
		}
		
	}
	
	function flush(){ 
		xmlreq.open("get","Img", true);
		xmlreq.send(null);
		xmlreq.onreadystatechange= function(){
			if(xmlreq.readyState==4 && xmlreq.status=== 200){ 
				document.getElementById('image').src="Img"; 
				 
			}
		};
	}
    
    
        $(function () {
            $('#clouds').pan({ fps: 20, speed: 0.7, dir: 'right', depth: 10 });
            $('.login').click(function () {
                if ($('#uid').val() == "" || $('#pwd').val() == "" || $('#code').val() == "") { $('.tip').html('用户名或密码不可为空！') }
                 
            })
        }) 
  
</script> 
</head>
<body>
    <div id="clouds" class="stage"></div>
    <div class="loginmain">
    </div>

    <div class="row-fluid">
   		<form action="login" method="POST">
        <h1>蓝天集团（房产）客户管理系统</h1>
        <p>
            <label>帐&nbsp;&nbsp;&nbsp;号：<input type="text" id="uid" name="name"/></label>
        </p>
        <p>
            <label>密&nbsp;&nbsp;&nbsp;码：<input type="password" id="pwd" name="pwd"/></label>
        </p>
        <p class="pcode">
            <label>效验码：<input type="text" id="code" name="yzm" maxlength="5" class="code" /><img id="image" src="Img" alt="" class="imgcode" /><a onclick="flush()">下一张</a></label>
        </p>
        <p class="tip">&nbsp;</p>
        <hr />
        <input type="submit" value=" 登 录 " class="btn btn-primary btn-large login" />
        &nbsp;&nbsp;&nbsp;<input type="button" value=" 取 消 " class="btn btn-large" />
  	 	</form>
    </div>
</body>
</html>