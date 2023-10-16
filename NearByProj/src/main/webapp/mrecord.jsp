<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!--  uri core를 c로 설정 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>진료 기록 조회</title>
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script type="text/javascript"></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>

<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<script>
$(function() {
//input을 datepicker로 선언
$("#datepicker1,#datepicker2").datepicker({
dateFormat: 'yy-mm-dd' //달력 날짜 형태
,showOtherMonths: true //빈 공간에 현재월의 앞뒤월의 날짜를 표시
,showMonthAfterYear:true // 월- 년 순서가아닌 년도 - 월 순서
,changeYear: true //option값 년 선택 가능
,changeMonth: true //option값 월 선택 가능
,showOn: "both" //button:버튼을 표시하고,버튼을 눌러야만 달력 표시 ^ both:버튼을 표시하고,버튼을 누르거나 input을 클릭하면 달력 표시
,buttonImage: "http://jqueryui.com/resources/demos/datepicker/images/calendar.gif" //버튼 이미지 경로
,buttonImageOnly: true //버튼 이미지만 깔끔하게 보이게함
,buttonText: "선택" //버튼 호버 텍스트
,yearSuffix: "년" //달력의 년도 부분 뒤 텍스트
,monthNamesShort: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'] //달력의 월 부분 텍스트
,monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'] //달력의 월 부분 Tooltip
,dayNamesMin: ['일','월','화','수','목','금','토'] //달력의 요일 텍스트
,dayNames: ['일요일','월요일','화요일','수요일','목요일','금요일','토요일'] //달력의 요일 Tooltip
,minDate: "-5Y" //최소 선택일자(-1D:하루전, -1M:한달전, -1Y:일년전)
,maxDate: "+5y" //최대 선택일자(+1D:하루후, -1M:한달후, -1Y:일년후)
});

//초기값을 오늘 날짜로 설정해줘야 합니다.
$('#datepicker').datepicker('setDate', 'today'); //(-1D:하루전, -1M:한달전, -1Y:일년전), (+1D:하루후, -1M:한달후, -1Y:일년후)
});


function Opinion(){
   window.open("<%=request.getContextPath()%>/opinion.jsp", '의사소견', 'width=750px,height=470px,scrollbars=yes');
}


</script>
</head>
<style>
body {
	margin: 0 auto;
}



h1 {
	width: 202px;
	height: 50px;
	margin: 44px 944px;
	color: rgb(25, 25, 112);
}
th{
	padding: 5px;
	width: 192px;
	float: left;
	color: black;
	text-align: center;
	border-right:1px solid white;
	font-weight: bold;
	background-color: lightblue;
	
}

table {
	border: 1px solid;
    width: 1542px;
    margin: 170px 236px;
}

input {
	width: 200px;
	height: 38px;
}

select {
	width: 200px;
	height: 35px;
}

button {
	width: 100px;
	height: 30px;
	background-color: rgb(25, 25, 112);
}

#search {
	color: black;
	width: 100px;
	height: 30px;
	background-color: lightgray;
	border-radius: 10px;
	cursor: pointer;
}

.reserveform {
	width: 1500px;
	height: 50px;
	margin: -86px 358px;
}

#datepicker1 {
	margin-top: 50px;
	margin-left: 282px;
}

#datepicker2 {
	margin-left: 20px;
}

#emptyArea {
	width: 708px;
	text-align: center;
	margin-top: 20px;
	margin-left: 673px;
}

#emptyArea a {
	display: inline-block;
	width: 20px;
	height: 20px;
	text-decoration: none;
}

#emptyArea .btn {
	background: lightgray;
}

#emptyArea .select {
	background: lightblue;
}
</style>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script language="javascript"></script>
<script>
	
	function callBtn(pidnum) {
		var keyword=$('#keyword').val()
		if(keyword!=null && keyword.trim()!='') {
			$('#page').val(pname);
			$('#searchform').submit();
		}
	}
	
	  
	function openOpinion(){  
	    window.open("opinion.jsp", "담당의소견", "width=600, height=500, toolbar=no, menubar=no, scrollbars=no, resizable=yes" );  
	}
	window.addEventListner("message",function(event){
		var receivedData=event.data;
	});
	
 </script>

<body style="overflow-y:hidden">
	<% pageContext.include("hmain.jsp");%>



	<h1>진료 기록 조회</h1>
	<br>
	<br>

	<form action="mrecordsearch" method="post" id="searchform">
	<input type="hidden" name="page" id="page" value="1">	
	<div class="reserveform">

		<select name="patient">
			<option value="all">선택</option>
			<option value="patient">환자명</option>
			<option value="number">주민등록번호</option>
		</select> 
		<input type="text" name="keyword" id="keyword" value="${res.keyword }" /> 
		<input type="submit" id="search" value="검색" />
	




		<input type="text" id="datepicker1" placeholder="0000-00-00">

		<input type="text" id="datepicker2" placeholder="0000-00-00">


		
		<input type="submit" id="search" value="검색" />



	</div>
	</form>

	<table>
		<tr>
			<th>일자</th>
			<th>시간</th>
			<th>환자명</th>
			<th>요청사항</th>
			<th>진료과목</th>
			<th>진료완료처리</th>
			<th><a href="javascript:openOpinion('opinion.jsp','popup');" style=text-decoration:none;>담당의소견</a></th>
			<th>기록삭제</th>
		</tr>

		<c:forEach items="${res.reserveList }" var="reserve">
			<tr>
				<td>${reserve.resdate }</td>
				<td>${reserve.restime }</td>
				<td>${reserve.name }</td>
				<td>${reserve.comment }</td>
				<td>${reserve.department }</td>
				<td>${reserve.status }</td>
				<td>${reserve.opinion }</td>
				<td><c:if test="${hospitaluser.id == hospital.comnum }">
					<a href="patientdelete?pname=${patient.pname }&page=${res.pageInfo.curPage}">삭제</a>
					</c:if>
				</td>
			</tr>
		</c:forEach>
	</table>
	<div id="emptyArea">
		<c:choose>
			<c:when test="${res.pageInfo.curPage>1}">
				<a href="patientlist?page=${res.pageInfo.curPage-1}">&lt;</a>
			</c:when>
			<c:otherwise>
					&lt;
				</c:otherwise>
		</c:choose>
		&nbsp;&nbsp;

		<c:forEach begin="${res.pageInfo.startPage}"
			end="${res.pageInfo.endPage}" var="i">
			<c:choose>
				<c:when test="${res.pageInfo.curPage==i}">
					<a href="patientlist?page=${i}" class="select"
						onclick="callBtn(${i});return ${res.keyword==null};">${i}</a>&nbsp;
					</c:when>
				<c:otherwise>
					<a href="patientlist?page=${i}" class="btn"
						onclick="callBtn(${i});return ${res.keyword==null};">${i}</a>&nbsp;
				</c:otherwise>

			</c:choose>

		</c:forEach>

		<c:choose>
			<c:when test="${res.pageInfo.curPage<res.pageInfo.allPage}">
				<a href="patientlist?page=${res.pageInfo.curPage+1}">&gt;</a>
			</c:when>
			<c:otherwise>
					&gt;
				</c:otherwise>
		</c:choose>
		&nbsp;&nbsp;

	</div>
</body>
</html>