
/**
 * С����
 */
$(document).ready(function(){

		$("#hover-1 li a").mousemove(function(){
			$(this).addClass("hover_1_0");
		});
		$("#hover-1 li a").mouseout(function(){
			$(this).removeClass("hover_1_0");
		});
		$("#hover-1 li a").eq(0).addClass("hover_1_0");
});
//��������������¼�
$(document).ready(function(){
	$("#logo1").blur(function(){
		$(this).removeClass("logo_2_3");
		if(this.value == null || this.value == ""){
			this.value = "";
		}
	});
	$("#logo1").click(function(){
		$(this).addClass("logo_2_3");
		this.value="";
	});
});

//������λ
$(document).ready(function() {
	$("#nva-1 li a").wrapInner( '<span class="out"></span>' ).append( '<span class="bg"></span>' );
	$("#nva-1 li a").each(function() {
		$( '<span class="over">' +  $(this).text() + '</span>' ).appendTo( this );
	});
	$("#nva-1 li a").hover(function() {
		$(".out",	this).stop().animate({'top':	'45px'},	250);
		$(".over",	this).stop().animate({'top':	'0px'},		250);
		$(".bg",	this).stop().animate({'top':	'0px'},		120);

	}, function() {
		$(".out",	this).stop().animate({'top':	'0px'},		250);
		$(".over",	this).stop().animate({'top':	'-45px'},	250);
		$(".bg",	this).stop().animate({'top':	'-45px'},	120);
	});
	$("#nva-1 li a").remove(function() {
		$(".out",	this).stop().animate({'top':	'45px'},	200);
		$(".over",	this).stop().animate({'top':	'0px'},		200);
	});
});

/**
 * �򿪵�¼����
 */
function loginInfo(){
	var mask = document.getElementById("mask");
	mask.style.display = "block";
	var login = document.getElementById("login");
	login.style.display = "block";
}
/**
 * �رյ�¼����
 */
function EscInfo(){
	var mask = document.getElementById("mask");
	mask.style.display = "none";
	var login = document.getElementById("login");
	login.style.display = "none";
}
function dianji(){
	var loginName = document.getElementById("loginName");
	loginName.value = "";
	loginName.border = "0px"
	}

/**
 * ��½����¼�
 */

function clickLogin(){
	var loginName = document.getElementById("loginName");
	if(loginName.value == ""){
		loginName.value = "";
	}
}
/**
 * ��½�Ƴ��¼�
 * @return
 */
function mouserLogin(){
	var loginName = document.getElementById("loginName");
	if(loginName.value == "" || loginName.value == null){
		loginName.value = "";
	}
}


/**
 * �û���֤����Ϊ��
 * @return
 */
function confirmation(){
	var loginName = document.getElementById("loginName");
	var loginPwd = document.getElementById("loginPwd");
	var login = document.getElementById("login_1_1");
	if((!(loginPwd.value == null || loginPwd.value == "")) && (!(loginName.value == "" || loginName.value == null || loginName.value =="�������˺���������"))){
		return true;
	}else{
		login.innerHTML="�˺Ż����벻��Ϊ��";
		return false;
	}
}







