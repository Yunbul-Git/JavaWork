$(document).ready(function(){
    $('#themebtn').click(function(){
        if($('#theme').attr("href") == 'themeA.css'){
            $('#theme').attr("href", "themeH.css");
        } else {
            $('#theme').attr("href", "themeA.css");
        }
    });
    /* 메뉴바 mouseover OR mouseleave 시 메뉴바 생기고 없어지는 기능 장착 */
    $('#menu .context').hide();
    $('#menu .t2').mouseover(function(){
        $('#menu .c2 .context').show();
    });
    $('#menu .c2').mouseleave(function(){
        $('#menu .c2 .context').hide();
    });
    $('#menu .t3').mouseover(function(){
        $('#menu .c3 .context').show();
    });
    $('#menu .c3').mouseleave(function(){
        $('#menu .c3 .context').hide();
    });    
    /* 본문 페이지에 main.html 불러오기 */ 
    $('#context').load('main.html');    
    /* 메뉴바 클릭 시 페이지 이동(?) */
    $('#menu .t2').click(function(){
        $('#context').load('listcontext.html');
    });
    $('#menu .c2 .ct2').click(function(){
        $('#context').load('context.html');
    });
})