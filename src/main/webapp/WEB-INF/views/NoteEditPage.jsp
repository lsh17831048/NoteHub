<%@ page language="java" contentType="text/html; charset = UTF-8"
	pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<!--
	Helios by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
		<title>NoteHub - Create Note</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="/resources/css/main.css" />
		<noscript><link rel="stylesheet" href="/resources/css/main.css" /></noscript>


		<!-- ckEditor5 -->
		<title>NoteHub</title>
		<script src = "WEB-INF/ckeditor5/build/ckeditor.js"></script>
		<script src="https://cdn.ckeditor.com/ckeditor5/31.1.0/classic/ckeditor.js"></script>

		<!-- ckEditor5의 요소 크기 -->
		<style>
			.ck.ck-editor{
				max-width: 1600px;
			}
			.ck-editor__editable {
				min-height: 800px;
			}
		</style>
	</head>
	<script>

		var formObj = $("form[role='form]");

		$("#btnSave").click(function (){

			formObj.attr("action", "/saveBoard");
			formObj.attr("method", "post");
			formObj.submit();
		})
	</script>
	<body class="left-sidebar is-preload">
		<div id="page-wrapper">

			<!-- Header -->
				<div id="header">

					<!-- Inner -->
						<div class="inner">
							<header>
								<h1><a href="Main" id="logo">Create Note</a></h1>
							</header>
						</div>

					<!-- Nav -->
					<nav id="nav">
						<ul>
							<li><a href="Main">Home</a></li>
							<li><a href="CreateNote">Create Note</a></li>
							<li><a href="Calendar">Calendar</a></li>
							<li><a href="NoteHub">NoteHub</a></li>
							<li><a href="Login">Login</a></li>
						</ul>
					</nav>

				</div>

			<!-- Main -->
				<form name="form" role="form" action = "${pageContext.request.contextPath}/NoteHub" method = "POST">
					<div class = "input-box">
						<input id ="nh_title" type = "text" name = "nh_title" placeholder="제목">
					</div><br/>
					<div class="input_box">
						<input  id = "nh_register_id" type="text" name="nh_register_id" placeholder="작성자" >
					</div><br/>
					<div class = "input-box">
						<input id = "nh_hashtag" type = "text" name = "nh_hashtag" placeholder="해시태그">
					</div>
				<div class="wrapper style1">
					<div class="container" style="width: 1200px; height: 800px;">
						<div class = "editor"></div>
							<script>
								let editor;

								ClassicEditor
								.create(document.querySelector('.editor'), {
									licenseKey: '',
									ckfinder: {
										uploadUrl : 'http://localhost:1521/admin/test/imageUpload'
									}
								})
										.then( newEditor => {
											editor = newEditor;
										})
								.then( editor => {
									window.editor = editor;
								})
								.catch( error => {
									console.warn('Build id : i9h8b9hukly8-adw9d73t5e5');
									console.error(error);
								})
								$content = CKEDITOR.instances.editor.getData();
							</script>

					</div>
					<script>
						CKEDITOR.replace("content");
					</script>
				</div>
				</form>
				<div>
					<button type="button" id = "btnSave">노트 저장</button>
				</div>
			<!-- Footer -->
				<div id="footer">
					<div class="container">
						<div class="row">

							<!-- Tweets -->
								<section class="col-4 col-12-mobile">
									<header>
										<h2 class="icon brands fa-twitter circled"><span class="label">Tweets</span></h2>
									</header>
									<ul class="divided">
										<li>
											<article class="tweet">
												Amet nullam fringilla nibh nulla convallis tique ante sociis accumsan.
												<span class="timestamp">5 minutes ago</span>
											</article>
										</li>
										<li>
											<article class="tweet">
												Hendrerit rutrum quisque.
												<span class="timestamp">30 minutes ago</span>
											</article>
										</li>
										<li>
											<article class="tweet">
												Curabitur donec nulla massa laoreet nibh. Lorem praesent montes.
												<span class="timestamp">3 hours ago</span>
											</article>
										</li>
										<li>
											<article class="tweet">
												Lacus natoque cras rhoncus curae dignissim ultricies. Convallis orci aliquet.
												<span class="timestamp">5 hours ago</span>
											</article>
										</li>
									</ul>
								</section>

							<!-- Posts -->
								<section class="col-4 col-12-mobile">
									<header>
										<h2 class="icon solid fa-file circled"><span class="label">Posts</span></h2>
									</header>
									<ul class="divided">
										<li>
											<article class="post stub">
												<header>
													<h3><a href="#">Nisl fermentum integer</a></h3>
												</header>
												<span class="timestamp">3 hours ago</span>
											</article>
										</li>
										<li>
											<article class="post stub">
												<header>
													<h3><a href="#">Phasellus portitor lorem</a></h3>
												</header>
												<span class="timestamp">6 hours ago</span>
											</article>
										</li>
										<li>
											<article class="post stub">
												<header>
													<h3><a href="#">Magna tempus consequat</a></h3>
												</header>
												<span class="timestamp">Yesterday</span>
											</article>
										</li>
										<li>
											<article class="post stub">
												<header>
													<h3><a href="#">Feugiat lorem ipsum</a></h3>
												</header>
												<span class="timestamp">2 days ago</span>
											</article>
										</li>
									</ul>
								</section>

							<!-- Photos -->
								<section class="col-4 col-12-mobile">
									<header>
										<h2 class="icon solid fa-camera circled"><span class="label">Photos</span></h2>
									</header>
									<div class="row gtr-25">
										<div class="col-6">
											<a href="#" class="image fit"><img src="images/pic10.jpg" alt="" /></a>
										</div>
										<div class="col-6">
											<a href="#" class="image fit"><img src="images/pic11.jpg" alt="" /></a>
										</div>
										<div class="col-6">
											<a href="#" class="image fit"><img src="images/pic12.jpg" alt="" /></a>
										</div>
										<div class="col-6">
											<a href="#" class="image fit"><img src="images/pic13.jpg" alt="" /></a>
										</div>
										<div class="col-6">
											<a href="#" class="image fit"><img src="images/pic14.jpg" alt="" /></a>
										</div>
										<div class="col-6">
											<a href="#" class="image fit"><img src="images/pic15.jpg" alt="" /></a>
										</div>
									</div>
								</section>

						</div>
						<hr />
						<div class="row">
							<div class="col-12">

								<!-- Contact -->
									<section class="contact">
										<header>
											<h3>Nisl turpis nascetur interdum?</h3>
										</header>
										<p>Urna nisl non quis interdum mus ornare ridiculus egestas ridiculus lobortis vivamus tempor aliquet.</p>
										<ul class="icons">
											<li><a href="#" class="icon brands fa-twitter"><span class="label">Twitter</span></a></li>
											<li><a href="#" class="icon brands fa-facebook-f"><span class="label">Facebook</span></a></li>
											<li><a href="#" class="icon brands fa-instagram"><span class="label">Instagram</span></a></li>
											<li><a href="#" class="icon brands fa-pinterest"><span class="label">Pinterest</span></a></li>
											<li><a href="#" class="icon brands fa-dribbble"><span class="label">Dribbble</span></a></li>
											<li><a href="#" class="icon brands fa-linkedin-in"><span class="label">Linkedin</span></a></li>
										</ul>
									</section>

								<!-- Copyright -->
									<div class="copyright">
										<ul class="menu">
											<li>&copy; Untitled. All rights reserved.</li><li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
										</ul>
									</div>

							</div>

						</div>
					</div>
				</div>

		</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.dropotron.min.js"></script>
			<script src="assets/js/jquery.scrolly.min.js"></script>
			<script src="assets/js/jquery.scrollex.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>