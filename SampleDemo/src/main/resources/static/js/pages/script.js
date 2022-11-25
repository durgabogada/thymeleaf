$(document).ready(function(){

	$('#viewAll').on("click",function(){
		window.location.href = "/cities";
	});
	
	$('#navBar').find('a').each(function(){
		$(this).parent().removeClass('active');
		if($(this)[0].href.includes(window.location.pathname)){
			$(this).parent().addClass('active');
		}
	})
});
