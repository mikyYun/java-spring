<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page import="java.net.URLDecoder"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css" />
    <style>
        * { box-sizing:border-box; }

        form {
            width:400px;
            height:600px;
            display : flex;
            flex-direction: column;
            align-items:center;
            position : absolute;
            top:50%;
            left:50%;
            transform: translate(-50%, -50%) ;
            border: 1px solid rgb(89,117,196);
            border-radius: 10px;
        }

        .input-field {
            width: 300px;
            height: 40px;
            border : 1px solid rgb(89,117,196);
            border-radius:5px;
            padding: 0 10px;
            margin-bottom: 10px;
        }
        label {
            width:300px;
            height:30px;
            margin-top :4px;
        }

        button {
            background-color: rgb(89,117,196);
            color : white;
            width:300px;
            height:50px;
            font-size: 17px;
            border : none;
            border-radius: 5px;
            margin : 20px 0 30px 0;
        }

        .title {
            font-size : 50px;
            margin: 40px 0 30px 0;
        }

        .msg {
            height: 30px;
            text-align:center;
            font-size:16px;
            color:red;
            margin-bottom: 20px;
        }
        .sns-chk {
            margin-top : 5px; 
        }
    </style>
    <title>Register</title>
</head>
<body>
   <!-- <form action="<c:url value="/register/add"/>" method="POST" onsubmit="return formCheck(this)" autofocus > -->
   <form:form modelAttribute="user">
    <div class="title">Register</div>
    <!--  <div id="msg" class="msg"> ${URLDecoder.decode(param.msg, "utf-8")} </div>  -->
    <div id="msg" class="msg"> <form:errors path="id" cssClass="msg" /> </div> 
    
    <label for="">ID</label>
    <input class="input-field" type="text" name="id" placeholder="8~12 digits of numbers and characters" value="my_id">
    <label for="">PASSWORD</label>
    <input class="input-field" type="text" name="pwd" placeholder="8~12 digits of numbers and characters" value="password">
    <label for="">NAME</label>
    <input class="input-field" type="text" name="name" placeholder="John Doe" value="John Doe">
    <label for="">E-MAIL</label>
    <input class="input-field" type="text" name="email" placeholder="example@test.com" value="example@test.com"> 
    <label for="">Date Of Birth</label>
	<input class="input-field" type="text" name="birth" placeholder="2020-12-31" value="2020-12-31">
	<label for="">Hobby</label>
	<input class="input-field" type="text" name="hobby" >
    <div class="sns-chk">
        <label><input type="checkbox" name="sns" value="facebook"/>Facebook</label>
        <label><input type="checkbox" name="sns" value="kakaotalk"/>kakaotalk</label>
        <label><input type="checkbox" name="sns" value="instagram"/>Instagram</label>
    </div>
    <button>Register</button>
   </form:form> 
   <script>
       function formCheck(frm) {
            var msg ='';

            if(frm.id.value.length<3) {
                setMessage('id should have at least 3 characters.', frm.id);
                return false;
            }

           return true;
       }

       function setMessage(msg, element){
            document.getElementById("msg").innerHTML = `<i class="fa fa-exclamation-circle"> ${'${msg}'}</i>`;

            if(element) {
                element.select();
            }
       }
   </script>
</body>
</html>