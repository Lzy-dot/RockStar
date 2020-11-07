var str = null;

var oPass = document.getElementById("upass0");
var Psw
var oPass1 = document.getElementById("upass1");
var name0=document.getElementById("uname0")
function fnRegist() {
    var er=false
    Psw = oPass.value
    if (name0.value.length == 0) {
        window.alert("用户名不能为空")
        return
    }
    if (name0.value.length > 20 || name0.value.length < 6) {
        // error_box.innerHTML = "用户名请输入6-20位字符";
        window.alert("用户名请输入6-20位字符")
        isError = false;
        return;
    } else if ((name0.value.charCodeAt(0) >= 48) && (name0.value.charCodeAt(0) <= 57)) {
        error_box.innerHTML = "用户名首字符必须为字母";
        window.alert("用户名首字符必须为字母")
        return;
    }
    else if (oPass.value != oPass1.value) {
        // document.getElementById("error_box").innerHTML = "两次密码输入不一致"
        window.alert("两次密码输入不一致")
    }
    
        
    else 
        window.alert("注册成功")

}


function OnInput(event) {
    // var psw1 = getCookie("password");
    // alert(psw1);
    // alert("Error" + event.target.value);
    var str = document.getElementById("upass0").value;
    // window.alert(oPass.value)
    // var str = "1234567";

    // 状态判断，如果输入正确就跳转到下个状态继续判断，否则提示错误
    var oError = document.getElementById("error_box")
    if (event.target.value.length > 0) {
        if (event.target.value == str.substr(0, event.target.value.length)) {
            document.getElementById('row').style.backgroundImage = "url('imgs/正确.png')";
            oError.innerHTML="前"+event.target.value.length+"位密码正确"
        }
        else {
            document.getElementById('row').style.backgroundImage = "url('imgs/错误.png')";
            oError.innerHTML="第"+event.target.value.length+"位密码错误，请重新输入"
        }
    }
}


    function fnLogin() {
        var oUname = document.getElementById("uname")
        var oUpass = document.getElementById("upass")
        var oError = document.getElementById("error_box")
        var nickName0 = document.getElementById("uname0");
        var nickName = document.getElementById("uname");
        // window.alert(Psw)
        // window.alert("Hello")
        // var oPass0 = document.getElementById("upass0").value;
        var isError = true;
        if (oUname.value.length == 0 && oUpass.value.length == 0) {
            oError.innerHTML = "用户名不能为空";
            // window.alert("用户名不能为空")
            return
        }
        if (oUname.value.length > 20 || oUname.value.length < 6) {
            oError.innerHTML = "用户名请输入6-20位字符";
            isError = false;
            return;
        } else if ((oUname.value.charCodeAt(0) >= 48) && (oUname.value.charCodeAt(0) <= 57)) {
            oError.innerHTML = "用户名首字符必须为字母";
            return;
        }
        // } else for (var i = 0; i < oUname.value.charCodeAt(i); i++) {
        //     if ((oUname.value.charCodeAt(i) < 48) || (oUname.value.charCodeAt(i) > 57) && (oUname.value.charCodeAt(i) < 97) || (oUname.value.charCodeAt(i) > 122)) {
        //         oError.innerHTML = "用户名必须为字母跟数字组成";
        //         return;
        //     }
        // }

        if (oUpass.value.length > 20 || oUpass.value.length < 6) {
            oError.innerHTML = "密码请输入6-20位字符"
            isError = false;
            return;
        }
        // window.alert("登录成功,3s后自动跳转")

        if ((oUpass.value == document.getElementById("upass0").value) && nickName.value == nickName0.value) {
            setTimeout(function () {//做延时以便显示登录状态值
                oError.innerHTML = "正在登录中...";
                // console.log(data);
                // window.location.href = "http://homepage.csu.edu.cn/";//指向登录的页面地址
                window.location.href="http://www.csu.edu.cn/"
            }, 300)
            // window.location.href="http://homepage.csu.edu.cn/"
            // window.alert("登录成功");
            // document.getElementById('row').style.backgroundImage = "url('imgs/正确.png')";
        }
        else {
            // document.getElementById('row').style.backgroundImage = "url('imgs/错误.png')";
            window.alert("用户名或密码错误")
        }
    }
