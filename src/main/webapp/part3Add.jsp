<%--
  Created by IntelliJ IDEA.
  User: wsy
  Date: 2023/12/14
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>新增学员</title>
</head>
<style>
    body {
        background-image: url(images/980.jpg);
        background-attachment: fixed;
        background-repeat: no-repeat;
        background-size: cover;
    }

    #functionPart {
        border: 1px solid black;
        height: 670px;
        width: 180px;
    }
    button{
        height: 42px;
        width: 180px;
        background-color: transparent;
        cursor: pointer;
        color: white;
        font-size: 20px;
    }
    button:hover{
        background-color: #3498db;
    }
    .addPart{
        height: 663px;
        width: 1241px;
        position: absolute;
        top: 86px;
        left: 231px;
        border: 2px solid black;
        border-radius: 10px;
        font-weight : bold;
    }
    .addForm{
        height: 535px;
        width: 1150px;
        position: relative;
        top: 60px;
        left: 45px;
        border: 2px solid black;
        border-radius: 10px;
    }
</style>
<body>
<h1 style="color: #2980b9;background-color: aliceblue; text-align: center;">硅谷教育职工培训信息管理系统</h1>
<div id="functionPart" style="background-color: #2980b9;">
    <div id="functionPart1">
        <div id="functionText" style="height: 40px;width: 177px;border: 1px solid black; font-weight : bold ;font-size: 20px;text-align: center;background-color: aliceblue;">培训计划管理</div>
        <div id="selectButton" style="height: 40px;width: 177px;border: 1px solid black;"><button onclick="redirectToSelectPage()">查询培训计划</button></div>
        <div id="addButton" style="height: 40px;width: 177px;border: 1px solid black;"><button onclick="redirectToAddPage()">创建培训计划</button></div>
        <div id="updateButton"style="height: 40px;width: 177px;border: 1px solid black;"><button onclick="redirectToUpdatePage()">更新培训计划</button></div>
    </div>
    <div id="functionPart2">
        <div id="function2Text" style="height: 40px;width: 177px;border: 1px solid black; font-weight : bold ;font-size: 20px;text-align: center;background-color: aliceblue;">培训成绩管理</div>
        <div id="selectGradeButton" style="height: 40px;width: 177px;border: 1px solid black;"><button onclick="redirectToSelectGradePage()">查询成绩</button></div>
        <div id="addGradeButton" style="height: 40px;width: 177px;border: 1px solid black;"><button onclick="redirectToAddGradePage()">录入成绩</button></div>
        <div id="updateGradeButton"style="height: 40px;width: 177px;border: 1px solid black;"><button onclick="redirectToUpdateGradePage()">修改成绩</button></div>
    </div>
    <div id="functionPart3">
        <div id="function3Text" style="height: 40px;width: 177px;border: 1px solid black; font-weight : bold ;font-size: 20px;text-align: center;background-color: aliceblue;">学员信息管理</div>
        <div id="selectStuffButton" style="height: 40px;width: 177px;border: 1px solid black;"><button onclick="redirectToSelectStuffPage()">查询学员信息</button></div>
        <div id="addStuffButton" style="height: 40px;width: 177px;border: 1px solid black;"><button onclick="redirectToAddStuffPage()">新增学员</button></div>
        <div id="updateStuffButton"style="height: 40px;width: 177px;border: 1px solid black;"><button onclick="redirectToUpdateStuffPage()">修改学员信息</button></div>
    </div>
</div>
<div class="addPart">
    <span style="color: black">新增学员</span>
    <div class="addForm">
        <form action="/powerStationTrainingMIS/addStuff" method="post">
            姓名：<input type="text" name="s_name"/>
            <br />
            员工编号：<input type="text" name="s_no"/>
            <br />
            性别：<input type="text" name="s_sex">
            <br />
            出生年月：<input type="text" name="s_birth">
            <br />
            专业号：<input type="text" name="p_id">
            <br>
            专业：<input type="text" name="p_major">
            <br />
            岗位：<input type="text"  name="post"/>
            <br />
            <input type="submit" name="" value="添加"/>
        </form>
    </div>
</div>
</body>
<script type="text/javascript">
    function redirectToSelectPage(){
        window.location.href = 'part1Select.jsp';
    }
    function redirectToAddPage(){
        window.location.href = 'part1Add.html';
    }
    function redirectToUpdatePage(){
        window.location.href = 'part1Update.jsp';
    }
    //成绩管理
    function redirectToUpdateGradePage(){
        window.location.href = 'part2Update.jsp';
    }
    function redirectToSelectGradePage(){
        window.location.href = 'part2Select.jsp';
    }
    //员工管理
    function redirectToUpdateStuffPage(){
        window.location.href = 'part3Update.jsp';
    }
    function redirectToSelectStuffPage(){
        window.location.href = 'part3Select.jsp';
    }
    function redirectToAddStuffPage(){
        window.location.href = 'part3Add.jsp';
    }
</script>
</html>
