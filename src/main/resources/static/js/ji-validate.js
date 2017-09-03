//输入框校验

var v_type = {
    integer : /^\d+$/,
    float : /^\d+(\.\d+)?$/,
    Chinese : /^[\u4e00-\u9fa5]{0,}$/,
    char_digit : /^[A-Za-z0-9]+$/,
    phone : /^1(3|4|5|7|8)\d{9}$/,
    password:/^[\w|\W]{6,18}$/,
    email:/\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*/,

};

$(document).ready(function() {
    $(".validate").on("blur", function() {
        var regex;
        if ($(this).hasClass("integer")) {
            regex = v_type.integer;
        } else if ($(this).hasClass("float")) {
            regex = v_type.float;
        } else if ($(this).hasClass("Chinese")) {
            regex = v_type.Chinese;
        } else if ($(this).hasClass("char_digit")) {
            regex = v_type.char_digit;
        } else if ($(this).hasClass("phone")) {
            regex = v_type.phone;
        } else if ($(this).hasClass("password")) {
            regex = v_type.password;
        } else if ($(this).hasClass("email")) {
            regex = v_type.email;
        }

        if(typeof(regex) != "undefined" ){
            var $node = $(this);
            var value = $node.val();
            if(regex.test(value)){
                //输入正确
                $node.css("background-color","#FFF");
            }
            else{
                //输入有误
                $node.css("background-color","#F6CECE");
            }
        }
    });
});