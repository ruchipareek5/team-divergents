
function myFunction() {
    var x = document.getElementById("myTopnav");
    if (x.className === "topnav") {
        x.className += " responsive";
    } else {
        x.className = "topnav";
    }
}

$('.navbar-brand').click(function() {
    ///$videoSrc = $(this).data( "src" );
	window.location.href = '/index';
});
//$(document).ready(function() { 
//	var $li = $('#navbar-footer li').click(function() {
//	    $li.removeClass('selected-tab');
//	    $(this).addClass('selcted-tab');
//	});
//});

