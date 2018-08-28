<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Tour Template</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta name="author" content="" />

<!-- Facebook and Twitter integration -->
<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

<!-- Animate.css -->
<link rel="stylesheet" href="resources/rentcar/css/animate.css">
<!-- Icomoon Icon Fonts-->
<link rel="stylesheet" href="resources/rentcar/css/icomoon.css">
<!-- Bootstrap  -->
<link rel="stylesheet" href="resources/rentcar/css/bootstrap.css">

<!-- Magnific Popup -->
<link rel="stylesheet" href="resources/rentcar/css/magnific-popup.css">

<!-- Flexslider  -->
<link rel="stylesheet" href="resources/rentcar/css/flexslider.css">

<!-- Owl Carousel -->
<link rel="stylesheet" href="resources/rentcar/css/owl.carousel.min.css">
<link rel="stylesheet" href="resources/rentcar/css/owl.theme.default.min.css">

<!-- Date Picker -->
<link rel="stylesheet"
	href="resources/rentcar/css/bootstrap-datepicker.css">
<!-- Flaticons  -->
<link rel="stylesheet"
	href="resources/rentcar/fonts/flaticon/font/flaticon.css">

<!-- Theme style  -->
<link rel="stylesheet" href="resources/rentcar/css/style.css">

<!-- Modernizr JS -->
<script src="resources/rentcar/js/modernizr-2.6.2.min.js"></script>
<!-- jQuery -->
<script src="resources/rentcar/js/jquery.min.js"></script>
<!-- jQuery Easing -->
<script src="resources/rentcar/js/jquery.easing.1.3.js"></script>
<!-- Bootstrap -->
<script src="resources/rentcar/js/bootstrap.min.js"></script>
<!-- Waypoints -->
<script src="resources/rentcar/js/jquery.waypoints.min.js"></script>
<!-- Flexslider -->
<script src="resources/rentcar/js/jquery.flexslider-min.js"></script>
<!-- Owl carousel -->
<script src="resources/rentcar/js/owl.carousel.min.js"></script>
<!-- Magnific Popup -->
<script src="resources/rentcar/js/jquery.magnific-popup.min.js"></script>
<script src="resources/rentcar/js/magnific-popup-options.js"></script>
<!-- Date Picker -->
<script src="resources/rentcar/js/bootstrap-datepicker.js"></script>
<!-- Stellar Parallax -->
<script src="resources/rentcar/js/jquery.stellar.min.js"></script>
<!-- Google Map -->

<!-- Main -->
<script src="resources/rentcar/js/main.js"></script>
<!-- FOR IE9 below -->
<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.14/jquery-ui.min.js"></script>							

<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<script type="text/javascript">

function sendIt() {
    alert("이용후기가 등록되었습니다");
	document.f.submit();
}

</script>
  <!-- Bootstrap core CSS-->
  <link href="../resources/admin/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="../resources/admin/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Page level plugin CSS-->
  <link href="../resources/admin/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">
  <!-- Custom styles for this template-->
  <link href="../resources/admin/css/sb-admin.css" rel="stylesheet">
   <script src="../resources/admin/vendor/jquery/jquery.min.js"></script>
    <script src="../resources/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <!-- Core plugin JavaScript-->
    <script src="../resources/admin/vendor/jquery-easing/jquery.easing.min.js"></script>
    <!-- Page level plugin JavaScript-->
    <script src="../resources/admin/vendor/datatables/jquery.dataTables.js"></script>
    <script src="../resources/admin/vendor/datatables/dataTables.bootstrap4.js"></script>
    <!-- Custom scripts for all pages-->
    <script src="../resources/admin/js/sb-admin.min.js"></script>
    <!-- Custom scripts for this page-->
    <script src="../resources/admin/js/sb-admin-datatables.min.js"></script>
    <script src="../resources/ck/ckeditor/ckeditor.js"></script>
</head>
<body>
	<%@ include file="../top/top.jspf"%>
	<div class="colorlib-loader"></div>

	<div id="page">
		<aside id="colorlib-hero">
			<div class="flexslider">
				<ul class="slides">
					<li style="background-image: url(resources/rentcar/images/cover-img-3.jpg);">
						<div class="overlay"></div>
						<div class="container-fluid">
							<div class="row">
								<div
									class="col-md-6 col-md-offset-3 col-sm-12 col-xs-12 slider-text">
									<div class="slider-text-inner text-center">
										<h2>by colorlib.com</h2>
										<h1>REVIEW</h1>
									</div>
								</div>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</aside>

          <form name="f" action="reviewInsertOk.do" method="post">
<!--           	<input type="hidden" name="rent_review_no" id="rent_review_no"/> -->
          	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
          	<input type="hidden" name="rent_reserv_no" value="${list.rent_reserv_no}" id="rent_reserv_no"/>
          	<input type="hidden" name="member_no" value="${list.member_no}" id="member_no"/>
          	<input type="hidden" name="insurance_no" value="${list.insurance_no}" id="insurance_no"/>
          	<input type="hidden" name="branch_no" value="${list.branch_no}" id="branch_no"/>
          	<input type="hidden" name="car_kind_no" value="${list.car_kind_no}" id="car_kind_no"/>
          	<input type="hidden" name="car_no" value="${list.car_no}" id="car_no"/>
          	
            <table border="0" width="100%"  cellpadding="0" cellspacing="0">
				<tr style="color:#808080;font-size:12pt">			
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">제목</th>
					<th  width="35%" class="text-left">
						<input name="rent_review_title" type="text" size="80" placeholder="">
					</th>
				</tr>
				<tr style="font-size:10pt" height="60px">
					<th height="60px" class="text-center" style="background-color: #fafafa">내용</th>
					<td align="left">
						<textarea class="ckeditor" rows="8" cols="110" name="rent_review_content" id="rent_review_content"></textarea>
					</td>
				</tr>
				
				<tr style="color:#808080;font-size:12pt">			
					<th  height="60px" width="10%" class="text-center" style="background-color: #fafafa">평점</th>
					<th  width="35%" class="text-center">
						<select name="rent_review_rating_car" id="rent_review_rating_car" class="form-control" style="width:250px">
							<option value="" style="color:black">평점을 선택해주세요</option>
								<option value=1 style="color:black">1</option>
								<option value=2 style="color:black">2</option>
								<option value=3 style="color:black">3</option>
								<option value=2 style="color:black">4</option>
								<option value=3 style="color:black">5</option>
	                    </select>
<!-- 						<input name="rent_review_rating_car" type="text" size="80" placeholder=""> -->
					</th>
				</tr>
				<tr style="font-size:10pt" height="60px">
					<td align="right">
						<div class="form-group text-center">
							<button type style="width:200px;height:50px;border-radius:0px;background-color:#eea236;color:white" class="btn btn-dark" onclick="sendIt()">이용후기등록</button>
						</div>
					</td>
				</tr>
			</table>
			</form>
   
<!-- 		<div id="colorlib-contact"> -->
<!-- 			<div class="container"> -->
<!-- 				<div class="row"> -->
<!-- 					<div class="col-md-10 col-md-offset-1 animate-box"> -->
<!-- 						<h3>이용후기</h3> -->
<!-- 						<form name="f" action="affiliateWrite.do" method="post"> -->
<!-- 							<div class="row form-group"> -->
<!-- 								<div class="col-md-6 padding-bottom"> -->
<!-- 									<label for="fname">제목</label></br> -->
<!-- 									<input type="text" id="affiliate_title" -->
<!-- 										name="affiliate_title" style="width:75%;height:50px" placeholder="제목을 입력해주세요"> -->
<!-- 								</div> -->
<!-- 							</div> -->
<!-- 							<div class="row form-group"> -->
<!-- 								<div class="col-md-6 padding-bottom"> -->
<!-- 									<label for="fname">내용</label></br> -->
<!-- 									<textarea name="affiliate_content" id="affiliate_content" cols="120" rows="12" style="height: 100px; margin: 0px; width: 75%;" placeholder="추가요청사항이 있는 경우 자유롭게 입력해주세요." class="form-control"></textarea> -->
<!-- 								</div> -->
<!-- 							</div> -->
			
<!-- 							</form> -->
<!-- 						</div> -->
<!-- 					</div> -->
<!-- 				</div> -->
<!-- 			</div> -->

			

<script>
$(function () {
    $('.button-checkbox').each(function () {

        // Settings
        var $widget = $(this),
            $button = $widget.find('button'),
            $checkbox = $widget.find('input:checkbox'),
            color = $button.data('color'),
            settings = {
                on: {
                    icon: 'glyphicon glyphicon-check'
                },
                off: {
                    icon: 'glyphicon glyphicon-unchecked'
                }
            };

        // Event Handlers
        $button.on('click', function () {
            $checkbox.prop('checked', !$checkbox.is(':checked'));
            $checkbox.triggerHandler('change');
            updateDisplay();
        });
        $checkbox.on('change', function () {
            updateDisplay();
        });

        // Actions
        function updateDisplay() {
            var isChecked = $checkbox.is(':checked');

            // Set the button's state
            $button.data('state', (isChecked) ? "on" : "off");

            // Set the button's icon
            $button.find('.state-icon')
                .removeClass()
                .addClass('state-icon ' + settings[$button.data('state')].icon);

            // Update the button's color
            if (isChecked) {
                $button
                    .removeClass('btn-default')
                    .addClass('btn-' + color + ' active');
            }
            else {
                $button
                    .removeClass('btn-' + color + ' active')
                    .addClass('btn-default');
            }
        }

        // Initialization
        function init() {

            updateDisplay();

            // Inject the icon if applicable
            if ($button.find('.state-icon').length == 0) {
                $button.prepend('<i class="state-icon ' + settings[$button.data('state')].icon + '"></i> ');
            }
        }
        init();
    });
});
</script>
 <!-- Bootstrap core JavaScript-->
   <script>
	    CKEDITOR.replace('announce_content',{
	            /* toolbar: 'Full',
	            uiColor: '#9AB8F3', */
	    	filebrowserImageUploadUrl: '/community/imageUpload'
	        }
	    );
	</script>
				</form>
					</div>
					<div class="col-md-10 col-md-offset-1 animate-box">
						<h3>Contact Information</h3>
						<div class="row contact-info-wrap">
							<div class="col-md-3">
								<p>
									<span><i class="icon-location"></i></span> 198 West 21th
									Street, <br> Suite 721 New York NY 10016
								</p>
							</div>
							<div class="col-md-3">
								<p>
									<span><i class="icon-phone3"></i></span> <a
										href="tel://1234567920">+ 1235 2355 98</a>
								</p>
							</div>
							<div class="col-md-3">
								<p>
									<span><i class="icon-paperplane"></i></span> <a
										href="mailto:info@yoursite.com">info@yoursite.com</a>
								</p>
							</div>
							<div class="col-md-3">
								<p>
									<span><i class="icon-globe"></i></span> <a href="#">yoursite.com</a>
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<footer id="colorlib-footer" role="contentinfo">
			<div class="container">
				<div class="row row-pb-md">
					<div class="col-md-3 colorlib-widget">
						<h4>Tour Agency</h4>
						<p>Facilis ipsum reprehenderit nemo molestias. Aut cum
							mollitia reprehenderit. Eos cumque dicta adipisci architecto
							culpa amet.</p>
						<p>
						<ul class="colorlib-social-icons">
							<li><a href="#"><i class="icon-twitter"></i></a></li>
							<li><a href="#"><i class="icon-facebook"></i></a></li>
							<li><a href="#"><i class="icon-linkedin"></i></a></li>
							<li><a href="#"><i class="icon-dribbble"></i></a></li>
						</ul>
						</p>
					</div>
					<div class="col-md-2 colorlib-widget">
						<h4>Book Now</h4>
						<p>
						<ul class="colorlib-footer-links">
							<li><a href="#">Flight</a></li>
							<li><a href="#">Hotels</a></li>
							<li><a href="#">Tour</a></li>
							<li><a href="#">Car Rent</a></li>
							<li><a href="#">Beach &amp; Resorts</a></li>
							<li><a href="#">Cruises</a></li>
						</ul>
						</p>
					</div>
					<div class="col-md-2 colorlib-widget">
						<h4>Top Deals</h4>
						<p>
						<ul class="colorlib-footer-links">
							<li><a href="#">Edina Hotel</a></li>
							<li><a href="#">Quality Suites</a></li>
							<li><a href="#">The Hotel Zephyr</a></li>
							<li><a href="#">Da Vinci Villa</a></li>
							<li><a href="#">Hotel Epikk</a></li>
						</ul>
						</p>
					</div>
					<div class="col-md-2">
						<h4>Blog Post</h4>
						<ul class="colorlib-footer-links">
							<li><a href="#">The Ultimate Packing List For Female
									Travelers</a></li>
							<li><a href="#">How These 5 People Found The Path to
									Their Dream Trip</a></li>
							<li><a href="#">A Definitive Guide to the Best Dining
									and Drinking Venues in the City</a></li>
						</ul>
					</div>

					<div class="col-md-3 col-md-push-1">
						<h4>Contact Information</h4>
						<ul class="colorlib-footer-links">
							<li>291 South 21th Street, <br> Suite 721 New York NY
								10016
							</li>
							<li><a href="tel://1234567920">+ 1235 2355 98</a></li>
							<li><a href="mailto:info@yoursite.com">info@yoursite.com</a></li>
							<li><a href="#">yoursite.com</a></li>
						</ul>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12 text-center">
						<p>
							<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
							Copyright &copy;
							<script>document.write(new Date().getFullYear());</script>
							All rights reserved | This template is made with <i
								class="icon-heart2" aria-hidden="true"></i> by <a
								href="https://colorlib.com" target="_blank">Colorlib</a>
							<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
							</span> <span class="block">Demo Images: <a
								href="http://unsplash.co/" target="_blank">Unsplash</a> , <a
								href="http://pexels.com/" target="_blank">Pexels.com</a></span>
						</p>
					</div>
				</div>
			</div>
		</footer>
	</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up2"></i></a>
	</div>

	<!-- Modernizr JS -->
	<script src="resources/rentcar/js/modernizr-2.6.2.min.js"></script>
	<!-- jQuery -->
	<script src="resources/rentcar/js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="resources/rentcar/js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="resources/rentcar/js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="resources/rentcar/js/jquery.waypoints.min.js"></script>
	<!-- Flexslider -->
	<script src="resources/rentcar/js/jquery.flexslider-min.js"></script>
	<!-- Owl carousel -->
	<script src="resources/rentcar/js/owl.carousel.min.js"></script>
	<!-- Magnific Popup -->
	<script src="resources/rentcar/js/jquery.magnific-popup.min.js"></script>
	<script src="resources/rentcar/js/magnific-popup-options.js"></script>
	<!-- Date Picker -->
	<script src="resources/rentcar/js/bootstrap-datepicker.js"></script>
	<!-- Stellar Parallax -->
	<script src="resources/rentcar/js/jquery.stellar.min.js"></script>
	<!-- Google Map -->

	<!-- Main -->
	<script src="resources/rentcar/js/main.js"></script>
	<!-- FOR IE9 below -->
	<!-- [if lt IE 9] -->
	<script src="resources/rentcar/js/respond.min.js"></script>

</body>
</html>

