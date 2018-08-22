<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>SB Admin</title>
  <!-- 하이차트1 -->
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/modules/export-data.js"></script>

<script src="https://code.highcharts.com/highcharts-3d.js"></script>

  <!-- Bootstrap core CSS-->
  <link href="../resources/admin/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="../resources/admin/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="../resources/admin/css/sb-admin.css" rel="stylesheet">
  
</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">
<%@ include file="../top/top2.jspf" %>
  <!-- Navigation-->
  <style>
  #container2 {
    height: 400px; 
    min-width: 310px; 
    max-width: 800px;
    margin: 0 auto;
}
@import 'https://code.highcharts.com/css/highcharts.css';

#container3 {
	height: 400px;
	max-width: 800px;
	min-width: 320px;
	margin: 0 auto;
}
.highcharts-pie-series .highcharts-point {
	stroke: #EDE;
	stroke-width: 2px;
}
.highcharts-pie-series .highcharts-data-label-connector {
	stroke: silver;
	stroke-dasharray: 2, 2;
	stroke-width: 2px;
}
  </style>
  <div class="content-wrapper">
    <div class="container-fluid">
      <!-- Breadcrumbs-->
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="#">Dashboard</a>
        </li>
        <li class="breadcrumb-item active">Charts</li>
      </ol>
      <!-- Area Chart Example-->
    <div id="container1" style="min-width: 310px; height: 400px; margin: 0 auto">
    <script>
    var bie = ${map};
    
Highcharts.chart('container1', {
    chart: {
        type: 'line'
    },
    title: {
        text: '월별예약현황'
    },
    xAxis: {
        categories: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월']
    },
    yAxis: {
        title: {
            text: ''
        }
    },
    plotOptions: {
        line: {
            dataLabels: {
                enabled: true
            },
            enableMouseTracking: false
        }
    },
    series: [{
        name: '2018',
        data: bie.cha
    }, {
        name: '2017',
        data: bie.bug
    }]
});
</script>
    </div>
      <div class="row">
        <div class="col-lg-8">
          <!-- Example Bar Chart Card-->
          <div class="card mb-3">
            <div class="card-header">
              <i class="fa fa-bar-chart"></i>한주예약건수</div>
            <div class="card-body">
              <div id="container2" style="height: 400px">
              <script>
              var bie = ${map};
              
              Highcharts.chart('container2', {
                  chart: {
                      type: 'column',
                      options3d: {
                          enabled: true,
                          alpha: 10,
                          beta: 25,
                          depth: 70
                      }
                  },
                  title: {
                      text: '이번주예약현황'
                  },
                  plotOptions: {
                      column: {
                          depth: 25
                      }
                  },
                  xAxis: {
                      categories: [
                          '월',
                          '화',
                          '수',
                          '목',
                          '금',
                          '토',
                          '일'
                      ],
                      labels: {
                          skew3d: true,
                          style: {
                              fontSize: '16px'
                          }
                      }
                  },
                  yAxis: {
                      title: {
                          text: null
                      }
                  },
                  series: [{
                      name: '건',
                      data: bie.wek
                  }]
              });
              </script>
              </div>
            </div>
            <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
          </div>
        </div>
        <div class="col-lg-4">
          <!-- Example Pie Chart Card-->
          <div class="card mb-3">
            <div class="card-header">
              <i class="fa fa-pie-chart"></i>차량현황</div>
            <div class="card-body">
              <div id="container3">
              <script>

              Highcharts.chart('container3', {

                  title: {
                      text: 'Pie point CSS'
                  },

                  xAxis: {
                      categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
                  },

                  series: [{
                      type: 'pie',
                      allowPointSelect: true,
                      keys: ['name', 'y', 'selected', 'sliced'],
                      data: [
                          ['Apples', 29.9, false],
                          ['Pears', 71.5, false],
                          ['Oranges', 106.4, false],
                          ['Plums', 129.2, false],
                          ['Bananas', 144.0, false],
                          ['Peaches', 176.0, false],
                          ['Prunes', 135.6, true, true],
                          ['Avocados', 148.5, false]
                      ],
                      showInLegend: true
                  }]
              });
              </script>
              </div>
            </div>
            <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
          </div>
        </div>
      </div>
    </div>
    <!-- /.container-fluid-->
    <!-- /.content-wrapper-->
    <footer class="sticky-footer">
      <div class="container">
        <div class="text-center">
          <small>Copyright © Your Website 2018</small>
        </div>
      </div>
    </footer>
    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
      <i class="fa fa-angle-up"></i>
    </a>
    <!-- Logout Modal-->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">×</span>
            </button>
          </div>
          <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
          <div class="modal-footer">
            <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
            <a class="btn btn-primary" href="login.do">Logout</a>
          </div>
        </div>
      </div>
    </div>
    <!-- Bootstrap core JavaScript-->
    <script src="../resources/admin/vendor/jquery/jquery.min.js"></script>
    <script src="../resources/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <!-- Core plugin JavaScript-->
    <script src="../resources/admin/vendor/jquery-easing/jquery.easing.min.js"></script>
    <!-- Page level plugin JavaScript-->
    <script src="../resources/admin/vendor/chart.js/Chart.min.js"></script>
    <!-- Custom scripts for all pages-->
    <script src="../resources/admin/js/sb-admin.min.js"></script>
    <!-- Custom scripts for this page-->
    <script src="../resources/admin/js/sb-admin-charts.min.js"></script>
  </div>
</body>

</html>
