<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String ctxPath  = request.getContextPath();
    request.setAttribute("ctxPath", ctxPath);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${ctxPath }/static/webuploader/webuploader.css">
</head>
<body>
	<div id="uploader-demo">
    <!--用来存放item-->
    <div id="fileList" class="uploader-list"></div>
    <div id="filePicker">选择图片</div>
    </div>
	<img id="previewImg" alt="" src="">
	<input type="hidden" name="">
    
<script type="text/javascript" src="${ctxPath}/static/webuploader/webuploader.min.js"></script>
<script type="text/javascript">
//初始化Web Uploader
var uploader = WebUploader.create({

    // 选完文件后，是否自动上传。
    auto: true,

    // swf文件路径
    swf:   '${ctxPath}/static/webuploader/Uploader.swf',

    // 文件接收服务端。
    server: '${ctxPath}/demoload/upload', 

    // 选择文件的按钮。可选。
    // 内部根据当前运行是创建，可能是input元素，也可能是flash.
    pick: '#filePicker',

    // 只允许选择图片文件。
    accept: {
        title: 'Images',
        extensions: 'gif,jpg,jpeg,bmp,png',
        mimeTypes: 'image/*'
    }
});
uploader.on( 'fileQueued', function( file ) {
    // 创建缩略图
    // 如果为非图片文件，可以不用调用此方法。
    // thumbnailWidth x thumbnailHeight 为 100 x 100
    uploader.makeThumb( file, function( error, src ) {
        if ( error ) {
            $img.replaceWith('<span>不能预览</span>');
            return;
        }

        $("#previewImg").attr( 'src', src );
    }, 100, 100 );
});
//文件上传成功，给item添加成功class, 用样式标记上传成功。
uploader.on( 'uploadSuccess', function( file , resp) {
	console.log(resp);
	$("input[name='']").val(resp);
});

</script>
</body>
</html>