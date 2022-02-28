<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
 <div style="width:1000px;margin:0px auto;text-align:center">

	 <td align="right">
		 <font size="+1">

		 </font>
	 </td>

	 <form action="/findListCategory" method="post">
		 <div class="indexSearch">
			 <td align="right">
				 <font size="+1">
					 <B>姓名:</B>
				 </font>
			 </td>
		<!-- 	 <input type="text" placeholder="姓名" name="name"/> -->
			 <input type="text"  name="name"/>

			 <td align="right">
				 <font size="+1">
					 <B>入职日期:</B>
				 </font>
			 </td>
			 <input type="text" name="date"/>

			 <td align="right">
				 <font size="+1">
					 <B>岗位:</B>
				 </font>
			 </td>
			 <input type="text" name="post"/>
			 <input type="submit" value="搜索"/>
		 </div>
	 </form>

	<table align='center' border='1' cellspacing='0'>
	    <tr>
	        <td>序号</td>
	        <td>姓名</td>
			<td>性别</td>
			<td>民族</td>
			<td>籍贯</td>
			<td>专业</td>
			<td>联系方式</td>
			<td>入职日期</td>
			<td>岗位</td>
	    </tr>
	    <c:forEach items="${cs}" var="c" varStatus="st">
	        <tr>
	            <td width="50">${c.id}</td>
	            <td width="150">${c.name}</td>
				<td width="50">${c.sex}</td>
				<td width="50">${c.nation}</td>
				<td width="50">${c.native1}</td>
				<td width="150">${c.major}</td>
				<td width="150">${c.phone}</td>
				<td width="150">${c.date}</td>
				<td width="150">${c.post}</td>

	        </tr>
	    </c:forEach>
	</table>
	<div style="text-align:center">
	<!--	<a href="?start=0">首  页</a>
		<a href="?start=${page.start-page.count}">上一页</a>
		<a href="?start=${page.start+page.count}">下一页</a>
		<a href="?start=${page.last}">末  页</a>
		-->
	</div>
 </div>
