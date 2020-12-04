function ChangeDiv1(divId, divName, zDivCount) {
    // 首先隐藏所有div层隐藏
    for (i = 0; i <= zDivCount; i++)document.getElementById(divName + i).style.display = "none";
    document.getElementById(divName + divId).style.display = "flex";
    document.getElementById("xsjz").style.color = "#0852a2";
    document.getElementById("zntg").style.color = "#999999";
}

function ChangeDiv2(divId, divName, zDivCount) {
    // 首先隐藏所有div层隐藏
    for (i = 0; i <= zDivCount; i++)document.getElementById(divName + i).style.display = "none";
    document.getElementById(divName + divId).style.display = "flex";
    document.getElementById("xsjz").style.color = "#999999";
    document.getElementById("zntg").style.color = "#0852a2";
}
function StayColor(x) {s
    x.style.color = "#0852a2";
}