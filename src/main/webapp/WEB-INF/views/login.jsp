<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<%--%>
<%--String path = request.getContextPath();--%>
<%--String basePath = request.getScheme()+"://" +request.getServerName()+":" +request.getServerPort()+path+"/" ;--%>
<%--System.out.println("getContextPath: "+path+" getCheme: "+request.getScheme()+" getServerName: "+request.getServerName()+" getServerPort: "+request.getServerPort());--%>
<%--System.out.println("basePath="+basePath);--%>
<%--%>--%>
<%--<base href="<%=basePath%>" >--%>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <title>翻转式用户登录注册界面设计</title>
    <link rel="stylesheet" type="text/css" href="../../statics/css/styles.css">
    <!--[if IE]>
    <script src="http://libs.baidu.com/html5shiv/3.7/html5shiv.min.js"></script>
    <script src="../../statics/js/jquery-3.1.1.min.js"></script>
    <![endif]-->
</head>

<body>
<form id="loginForm" action="/user/login" method="post">
<div class="jq22-container" style="padding-top:100px">
    <div class="login-wrap">
        <div class="login-html">
            <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign In</label>
            <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>
            <div class="login-form">
                <div class="sign-in-htm">
                    <div class="group">
                        <label for="userName" class="label">Username</label>
                        <input id="userName" name="userName" type="text" class="input">
                    </div>
                    <div class="group">
                        <label for="passWord" class="label">Password</label>
                        <input id="passWord" name="passWord" type="password" class="input" data-type="password">
                    </div>
                    <div class="group">
                        <input id="check" name="check" type="checkbox" class="check">
                        <label for="check"><span class="icon"></span> Keep me Signed in</label>
                    </div>
                    <div class="group">
                        <input type="submit" class="button" value="Sign In">
                    </div>
                    <div class="hr"></div>
                    <div class="foot-lnk">
                        <a href="#forgot">Forgot Password?</a>
                    </div>
                </div>
                <div class="sign-up-htm">
                    <div class="group">
                        <label for="uuser" class="label">Username</label>
                        <input id="uuser" type="text" class="input">
                    </div>
                    <div class="group">
                        <label for="upass" class="label">Password</label>
                        <input id="upass" type="password" class="input" data-type="password">
                    </div>
                    <div class="group">
                        <label for="rpass" class="label">Repeat Password</label>
                        <input id="rpass" type="password" class="input" data-type="password">
                    </div>
                    <div class="group">
                        <label for="email" class="label">Email Address</label>
                        <input id="email" type="text" class="input">
                    </div>
                    <div class="group">
                        <input type="submit" class="button" value="Sign Up">
                    </div>
                    <div class="hr"></div>
                    <div class="foot-lnk">
                        <label for="tab-1">Already Member?></label></a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</form>
</body>
</html>

