$(function () {
    $.post("/role/list", null, function (result) {
        $.each(result, function (index, element) {
            console.info(index)
            //"UploadImage/2860a7ffc8bf2ad22d4f4b2d1aac59c5.jpeg"
            $("#div1").append(
                "<div class=\"div2\">\n" +
                "        <div class=\"div3\"><img src="+element.image+"></div>\n" +
                "        <div class=\"div3\">\n" +
                "            <span><B>昵称:"+element.nickname+"</B></span><br>\n" +
                "            <span><B>年龄:"+element.age+"</B></span><br>\n" +
                "            <span><B>星座:"+element.constellation+"</B></span><br>\n" +
                "            <span><B>来自:"+element.address+"</B></span><br>\n" +
                "        </div>\n" +
                "        <span><b>第三个</b></span>\n" +
                "        <span style='color: deeppink'>\n" +
                "            二次元是一个ACGN亚文化圈专门用语，来自于日语的“二次元（にじげん）”，意思是“二维”。日本早期的动画、漫画、游戏等作品都是以二维图像构成，其画面是一个平面，所以通过这些载体创造的虚拟世界被动漫爱好者称为“二次元世界”。\n" +
                "        </span>\n" +
                "    </div>" +"")
                })
    }, "json")
})