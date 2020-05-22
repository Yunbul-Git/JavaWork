$(document).ready(function(){
    $('#loginPageBack').hide();
    $('#loginPage').hide();
    $('#themebtn').click(function(){
        if($('#theme').attr("href") == 'index.css'){
            $('#theme').attr("href", "themeH.css");
        } else {
            $('#theme').attr("href", "index.css");
        }
    });
    /* 본문 페이지에 main.html 불러오기 */ 
    $('#context').load('main.html');    
    /* 타이틀 클릭 시 페이지 이동*/
    $('#title').click(function(){
        $('#context').load('main.html');
    })
    $('#menu .home').click(function(){
        $('#context').load('main.html');
    });
    $('#menu .t2').click(function(){
        $('#context').load('listcontext.html');
    });
    $('#menu .c2 .ct2').click(function(){
        $('#context').load('context.html');
    });
    /* 로그인 클릭 시 레이아웃 팝업 */
    $('#login').click(function(){
        $('#loginPageBack, #loginPage').show();        
    });
    $('#loginPageBack').click(function(){        
        $('#loginPage, #loginPageBack').hide();
    });

    $('#list').click(function(){
        $('#context').load('listcontext.html')
    });
})