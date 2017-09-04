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

//把date类型转换为yyyy-mm-dd hh:mm:ss 形式
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
function statusFormatter(value, row, index){//三个参数,value代表该列的值,row代表每个bean,index代表整个list当前bean的下标
    if("y" == value){
        return "启用";
    }else if("n" == value){
        return "停用";
    }else{
        return "无数据";
    }
}

//每行的颜色style
function rowStatusStyle(row, index) {
    //这里有5个取值代表5中颜色['active', 'success', 'info', 'warning', 'danger'];
    var strclass = "";
    if (row.status == "n") {
        strclass = 'danger';
    } else if (row.status == null){
        strclass = 'warning';
    } else {
        return {};
    }
    return { classes: strclass };//按照bootstrap table的规则，必须返回一个json格式的对象型如： { classes: strclass }
}

//编辑每行数据再保存
function editRowOnSave(type, url, row) {
    row.updateAccount = user.result.username;
    row.updateTime = new Date();
    $.ajax({
        type: type,
        url: url,
        contentType: "application/json;charset=UTF-8",
        dataType: 'json',
        data: JSON.stringify(row),
        success: function (data, status) {
            if (data.code == 200) {
                alert("编辑成功");
            } else if (data.code == 500) {
                alert("编辑失败！");
            }
        },
        error: function () {
            alert("编辑失败！");
        },
        complete: function () {

        }
    });
}

//刷新按钮
function tableFresh(table, url) {
    $('#'+table).bootstrapTable('refresh', {url: url});
}

//批量删除
function batchDelete(table, delBtn, type, url, freshUrl) {
    var rows = $('#'+table).bootstrapTable('getAllSelections');//返回所有选择的行，当没有选择的记录时，返回一个空数组
    if (rows != null && rows.length > 0) {//检测是否有选择一行以上
        if (confirm("你确定删除这"+ rows.length +"行数据么？")) {
            $('#' + delBtn).click(function () {
                var ids = new Array();
                //遍历所有选择的行数据，取每条数据对应的ID
                $.each(rows, function (i, row) {
                    ids[i] = row['id'];
                });
                $.ajax({
                    type: type,
                    url: url,
                    data: JSON.stringify(ids),
                    contentType: "application/json;charset=UTF-8",
                    dataType: "json",
                    success: function (data) {
                        if (data.code == 200) {
                            alert("删除成功！");
                        } else if (data.code == 500) {
                            alert("删除失败！");
                        }
                        tableFresh(table, freshUrl);
                    },
                    error: function () {
                        alert("服务器没有返回数据，可能服务器忙，请重试!");
                    }
                });
            });
        }
    } else {
        alert("请选择要删除的行！");
    }
}
