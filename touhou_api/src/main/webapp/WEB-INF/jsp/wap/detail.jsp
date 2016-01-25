<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/inc/taglib.inc"%>
<%@ include file="/WEB-INF/inc/script.inc"%>
<!doctype html>
<html>
<head>
<title>${product.briefName }</title>
<jsp:include page="com/meta.jsp"></jsp:include>
<link rel="stylesheet" href="<%=request.getContextPath()%>/wap/css/detail.css" />
</head>
<body>
  <noscript>
    <div id="noscript">您当前的浏览器不支持JavaScript脚本</div>
  </noscript>
 
  <section class="container">
    <div class="logo">
      <img alt=""  src="${imagePrefix}${product.thumbnail}">
      <div class="texts">
        <div class="name">${product.briefName }
        <em class="status">
        <c:if test="${product.state == 0 }">即将上线</c:if>
        <c:if test="${product.state == 1 }">募集中</c:if>
        <c:if test="${product.state == 2 }">募集完成</c:if>
        </em>
        </div>
        <div class="comment star4half"></div>
        <div class="earning">
          <span class="fl">预期收益</span>
          <span class="f-x">${product.prospectiveEarnings }</span>
        </div>
      </div>     
    </div>
    <div class="title-txt clearfix">
      <div class="title">
        <div class="item">投资起点</div>
        <div class="item">投资期限</div>
        <div class="item">运作方式</div>
      </div>
      <div class="content">
        <div class="item yellow">${product.subStart/10000 }万元</div>
        <div class="item">${product.duration }个月</div>
        <div class="item">
	        <c:if test="${product.operationMode == '0' }">开放式</c:if>
	        <c:if test="${product.operationMode == '1' }">封闭式</c:if>
        </div>     
      </div>
    </div>
    <div class="block-empty"></div>
    <div class="block-item yellow">
      <div class="block-title">基金业绩</div>
      <div id="showCurrentNet" class="chart-title" style="display:none">
        <div>时间：<em id="currentTime" class="time"></em></div>
        <div>单位净值：<em id="currentNet" class="data"></em></div>
      </div>
      <div id="chart" style="width: 100%; height: 2rem;"></div>
      <div id="chartItems" class="chart-choice">
        <div class="item active">近一月</div>
        <div class="item">近三月</div>
        <div class="item">近六月</div>
        <div class="item">近一年</div>
      </div>
    </div>
    <div class="block-empty"></div>
    <div class="block-item red">
      <div class="block-title">基本信息</div>
      <div class="block-line clearfix">
        <div class="item">基金规模</div>
        <div class="item right"><fmt:formatNumber value="${product.scale/10000 }" type="currency" pattern="#"/>万元</div>
        <div class="item">递增金额</div>
        <div class="item right"><fmt:formatNumber value="${product.increaseAmount/10000 }" type="currency" pattern="#"/>万元</div>
      </div>
      <div class="block-line last clearfix">
        <div class="item">托管银行</div>
        <div class="item right">${product.bankDeposit }</div>
        <div class="item">认购费率</div>
        <div class="item right"><fmt:formatNumber value="${product.subFee*100 }" type="currency" pattern="#0.00#"/>%</div>
      </div>
    </div>
    <div class="block-empty"></div>
    <div class="block-item blue">
      <div class="block-title ">收益分配</div>
      <div class="thead clearfix">
        <div class="item">档次</div>
        <div class="item">份额</div>
        <div class="item">收益</div>
      </div>
      <div class="tbody">
      	<c:if test="${productGradeList.size() >0  }">
      		<c:forEach var="i" begin="0" end="${productGradeList.size()-1 }">
			   <div class="tr clearfix">
		          <div class="tb">${productGradeList[i].grade }档</div>
		          <div class="tb"><fmt:formatNumber value="${productGradeList[i].subScopeStart/10000 }" type="currency" pattern="#"/>万~<fmt:formatNumber value="${productGradeList[i].subScopeEnd/10000 }" type="currency" pattern="#"/>万</div>
		          <div class="tb">${productGradeList[i].prospectiveEarnings }</div>
		        </div>
			</c:forEach>
        </c:if>
      </div>    
    </div>
    <div style="width: 100%;height: 30px"></div>
  </section>
  
  
<jsp:include page="com/footer-js.jsp"></jsp:include>
<script src="<%=request.getContextPath()%>/wap/js/lib/highcharts.js"></script> 
<script>
function createCharts(){
	$.ajax({
        type:"post",
        url: ctx + "/product/net",
        data: "productId=${product.id}&orgId=${product.orgId}&timeRange="+$("div.item.active").html(),
        dataType:"json",
        success: function(data){
        	if(data.code==1){
        		$("#currentTime").html(data.data.netDate[data.data.netDate.length-1]);
        		$("#currentNet").html(data.data.netData[data.data.netData.length-1]);
        		if(data.data.netData[data.data.netData.length-1]){
        			$("#showCurrentNet").css("display","");
        		}
        		
        		$('#chart').highcharts({
        	        chart: {
        	            type: 'area'
        	        },
        	        title: {
        	            text: ' '
        	        },
        	        xAxis: {
        	            categories: data.data.netDate,//['2015-01-09', '2015-02-09', '2015-03-09', '2015-04-09', '2015-05-09', '2015-06-09'],
        	            gridLineColor: '#e5e5e5',
        	            gridLineWidth: 1,
        	            lineWidth: 0,
        	            //刻度线的宽度
        	            tickWidth: 0,
        	            labels: {
        	            	  align: 'left',
        	                style: {
        	                    color: '#999'
        	                },             
        	                step: 2,
        	                staggerLines: 1
        	            }
        	        },
        	        yAxis: {
        	            title: {
        	                enabled: false
        	            },
        	            plotLines: [{
        	                value: 0,
        	                width: 2
        	            }],
        	            gridLineColor: '#e5e5e5',
        	            gridLineWidth: 1,
        	            gridLineDashStyle: 'longdash',
        	            lineWidth: 0,
        	            labels: {
        	                format: '{value}',
        	                style: {
        	                    color: '#999'
        	                }
        	            }
        	        },
        	        legend: {
        	            layout: 'vertical',
        	            align: 'right',
        	            verticalAlign: 'middle',
        	            borderWidth: 0,
        	            enabled: false
        	        },
        	        plotOptions: {
        	            series: {
        	                fillColor: {
        	                    linearGradient: { x1: 0, y1: 1, x2: 0, y2: 0 },
        	                    stops: [
        	                        [0, 'rgba(255, 255, 255, .5)'],
        	                        [1, '#ffeece']
        	                    ]
        	                }

        	            }
        	        },
        	       
        	        series: [{
        	            data: data.data.netData,//[1.5, 2.5, 4.5, 3.1 , 3.9, 5.9],
        	            zIndex: 1,
        	            color: '#ffad10',
        	            marker: { 
        	                fillColor: 'white',
        	                radius: 3,
        	                lineWidth: 2,
        	                lineColor: '#ffad10',
        	                states: {
        	                    hover: {
        	                        fillColor: '#ffad10',
        	                        radius: 4
        	                    }
        	                }
        	            }
        	        }],
        	        navigation: {
        	            buttonOptions: {
        	                enabled: false
        	            }
        	        },
        	        exporting: {
        	            enabled: false
        	        },
        	        credits: {
        	            enabled: false
        	        },
        	        tooltip: {
        	            valueSuffix: '',
        	            backgroundColor: '#ffeece',
        	            style: {
        	                color: '#ffad10'
        	            },
        	            formatter: function() {
        	                return this.y + '</b>';
        	            }
        	        }
        	    });
        	}
        },
        error: function (msg) {
            bootbox.alert(msg.message);
        }
    });
	
    
}

createCharts();

$('.chart-choice .item').on('click', function(e) {
	  e.preventDefault();
	  if (!$(this).hasClass('active')) { // 本来就是选中的了 那没有必要改变
	      $('.chart-choice .item').removeClass('active'); //循环所有的item，然后removeClass('active')
	      $(this).addClass('active');
	      createCharts();
	    } else {
	      $(this).removeClass('active'); // 取消选中
	   }
	});
</script>
</body>
</html>