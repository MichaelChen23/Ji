//公共工具js库
//add by mc 2017-8-29

//把date类型转换为yyyy-mm-dd形式
function dateFormatter(value, row, index) {
    if (value != null) {
        var date = new Date(value);
        var year = date.getFullYear();
        var month = fixFormatter(date.getMonth() + 1);
        var day = fixFormatter(date.getDate());
        return year + '-' + month + '-' + day;
    }
}

//把date类型转换为yyyy-mm-dd形式
function timeFormatter(value, row, index) {
    if (value != null) {
        var date = new Date(value);
        var year = date.getFullYear();
        var month = fixFormatter(date.getMonth() + 1);
        var day = fixFormatter(date.getDate());
        var hour = fixFormatter(date.getHours());
        var minute = fixFormatter(date.getMinutes());
        var second = fixFormatter(date.getSeconds());
        return year + '-' + month + '-' + day + " " + hour + ":" + minute + ":" + second;
    }
}

//fix 0 before format 不满10补0函数
function fixFormatter(value) {
    return value < 10 ? ('0' + value) : value;
}

//每条记录状态的status形式
function statusFormatter(value, row, index){//三个参数,value代表该列的值,row代表整个list, index代表list的下标
    if("y" == value){
        return "启用";
    }else if("n" == value){
        return "停用";
    }else{
        return "无数据";
    }
}