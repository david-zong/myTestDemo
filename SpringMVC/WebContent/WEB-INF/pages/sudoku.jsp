<%@page import="com.zongdw.entity.SudokuEntity"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index page</title>
</head>
<style>
.tables {
	border-collapse: collapse;
	background-color: #fff;
}

.tds {
	width: 30px;
	height: 30px;
	border: 2px solid gray;
}

.tds div {
	position: relative;
	width: 30px;
	height: 30px;
}

.tds div span {
	display: block;
	text-align: center;
	line-height: 30px;
	font-size: 10px;
	width: 30px;
	height: 30px;
	text-decoration: none;
}

.tds div span:hover {
	position: absolute;
	top: -2px;
	left: -2px;
	width: 30px;
	height: 30px;
	border: 2px solid red;
}
.c1 {
	position: absolute;
	top: -2px;
	left: -2px;
	width: 30px;
	height: 30px;
	border: 2px solid red;
}
</style>
<script type="text/javascript">
window.onkeydown = document.onkeydown = onClickLable;
var focus;

function setFocus(id){
	focus=id;
}
function releaseFocus(){
	focus="";
}

function getKeyCode(e) { 
	var keyCode = 0; 
	var e = e || window.event; 
	keyCode = e.keyCode || e.which || e.charCode; 
	alert(keyCode); 
	}
function keydown(evt) {
	  var evt = window.event || evt
	  if(evt.keyCode==112){
	  document.onhelp = function() {return(false);}
	  window.onhelp = function() {return(false);}
	  window.open("http://www.google.com")
	}
}
function onClickLable(evt){
	var evt = window.event || evt;
	var val = evt.keyCode-48;
	if(val>0 && val <9){
		var sp=document.getElementById(focus);
		sp.innerText=(val);
	}
}
function onSub(){
	var list = document.getElementsByTagName("span");
	document.getElementById("dataForm").action="sudokuCal?list="+list;

}
</script>
<body>
    <form id="dataForm" onsubmit="onSub();">
    	<table class="">
    		<tr>
    			<td>
			    	<table class="tables">
				        <tr class="trs">
				            <td class="tds"><div><span id="a1" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="a2" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="a3" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				        <tr class="trs">
				            <td class="tds"><div><span id="a4" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="a5" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="a6" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				        <tr class="trs">
				            <td class="tds"><div><span id="a7" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="a8" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="a9" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				    </table>
    			</td>
    			<td>
			    	<table class="tables">
				        <tr class="trs">
				            <td class="tds"><div><span id="b1" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="b2" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="b3" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				        <tr class="trs">
				            <td class="tds"><div><span id="b4" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="b5" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="b6" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				        <tr class="trs">
				            <td class="tds"><div><span id="b7" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="b8" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="b9" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				    </table>
    			</td>
    			<td>
			    	<table class="tables">
				        <tr class="trs">
				            <td class="tds"><div><span id="c1" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="c2" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="c3" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				        <tr class="trs">
				            <td class="tds"><div><span id="c4" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="c5" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="c6" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				        <tr class="trs">
				            <td class="tds"><div><span id="c7" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="c8" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="c9" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				    </table>
    			</td>
    		</tr>
    		<tr>
    			<td>
			    	<table class="tables">
				        <tr class="trs">
				            <td class="tds"><div><span id="d1" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="d2" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="d3" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				        <tr class="trs">
				            <td class="tds"><div><span id="d4" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="d5" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="d6" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				        <tr class="trs">
				            <td class="tds"><div><span id="d7" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="d8" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="d9" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				    </table>
    			</td>
    			<td>
			    	<table class="tables">
				        <tr class="trs">
				            <td class="tds"><div><span id="e1" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="e2" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="e3" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				        <tr class="trs">
				            <td class="tds"><div><span id="e4" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="e5" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="e6" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				        <tr class="trs">
				            <td class="tds"><div><span id="e7" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="e8" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="e9" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				    </table>
    			</td>
    			<td>
			    	<table class="tables">
				        <tr class="trs">
				            <td class="tds"><div><span id="f1" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="f2" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="f3" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				        <tr class="trs">
				            <td class="tds"><div><span id="f4" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="f5" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="f6" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				        <tr class="trs">
				            <td class="tds"><div><span id="f7" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="f8" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="f9" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				    </table>
    			</td>
    		</tr>
    		<tr>
    			<td>
			    	<table class="tables">
				        <tr class="trs">
				            <td class="tds"><div><span id="g1" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="g2" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="g3" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				        <tr class="trs">
				            <td class="tds"><div><span id="g4" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="g5" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="g6" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				        <tr class="trs">
				            <td class="tds"><div><span id="g7" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="g8" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="g9" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				    </table>
    			</td>
    			<td>
			    	<table class="tables">
				        <tr class="trs">
				            <td class="tds"><div><span id="h1" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="h2" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="h3" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				        <tr class="trs">
				            <td class="tds"><div><span id="h4" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="h5" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="h6" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				        <tr class="trs">
				            <td class="tds"><div><span id="h7" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="h8" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="h9" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				    </table>
    			</td>
    			<td>
			    	<table class="tables">
				        <tr class="trs">
				            <td class="tds"><div><span id="i1" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="i2" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="i3" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				        <tr class="trs">
				            <td class="tds"><div><span id="i4" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="i5" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="i6" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				        <tr class="trs">
				            <td class="tds"><div><span id="i7" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="i8" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				            <td class="tds"><div><span id="i9" onmousemove="setFocus(this.id);" onmouseout="releaseFocus();" onkeydown="onClickLable(window.event);"></span></div></td>
				        </tr>
				    </table>
    			</td>
    		</tr>
    	</table>
    	<input type="submit" id="submit" value="计算" />
     </form>
</body>
</html>