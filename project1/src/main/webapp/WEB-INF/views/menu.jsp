<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<link rel="stylesheet" href="./css/menu.css">
	<nav>
		<div class="header">
			<div class ="chxx" >
				<img alt="" src="./img/chxx.png">
				<a href='./index'>CHXX AH</a>
			</div>
			<div class="list">
				<ul>
					<li onclick="link('board')">BOARD</li>
					<li onclick="link('ourstory')">OUR STORY</li>
					<li onclick="link('notice')">NOTICE</li>
					<li onclick="link('contact')">CONTACT</li>
				</ul>
			</div>
		</div>
	</nav>
	<div style="height: 100px; width: 100%"></div>
	<script>
		function link(url) {
			location.href="./"+url;
		}
	</script>
	
	
	
	
	
	
	
	
	
	
	