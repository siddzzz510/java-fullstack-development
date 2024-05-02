<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="Delete" method="post">  

    <div class="login">
        <div class="form" >
            <div class="title">Hotel-Booking</div>
        
            <div class="input-container ic1">
              <input placeholder="" type="text" class="input" id="name" name="name">
              <div class="cut"></div>
              <label class="iLabel" for="name">Name</label>
            </div>
     
            <button class="submit" type="text">submit</button>
            </div>
            </div>
            </form>
            <style>
            .form {
          background-color: #15172b;
          border-radius: 20px;
          box-sizing: border-box;
          height: 534px;
          padding: 20px;
          width: 320px;
        }
        
        .title {
          color: #eee;
          font-family: sans-serif;
          font-size: 36px;
          font-weight: 600;
          margin-top: 30px;
        }
        
        .subtitle {
          color: #eee;
          font-family: sans-serif;
          font-size: 16px;
          font-weight: 600;
          margin-top: 10px;
        }
        
        .input-container {
          height: 50px;
          position: relative;
          width: 100%;
        }
        
        .ic1 {
          margin-top: 40px;
        }
        
        .ic2 {
          margin-top: 30px;
        }
        
        .input {
          background-color: #303245;
          border-radius: 12px;
          border: 0;
          box-sizing: border-box;
          color: #eee;
          font-size: 18px;
          height: 100%;
          outline: 0;
          padding: 4px 20px 0;
          width: 100%;
        }
        
        .cut {
          background-color: #15172b;
          border-radius: 10px;
          height: 20px;
          left: 20px;
          position: absolute;
          top: -20px;
          transform: translateY(0);
          transition: transform 200ms;
          width: 76px;
        }
        
        .cut-short {
          width: 50px;
        }
        
        .iLabel {
          color: #65657b;
          font-family: sans-serif;
          left: 20px;
          line-height: 14px;
          pointer-events: none;
          position: absolute;
          transform-origin: 0 50%;
          transition: transform 200ms, color 200ms;
          top: 20px;
        }
        
        .input:focus ~ .cut {
          transform: translateY(8px);
        }
        
        .input:focus ~ .iLabel {
          transform: translateY(-30px) translateX(10px) scale(0.75);
        }
        
        .input:not(:focus) ~ .iLabel {
          color: #808097;
        }
        
        .input:focus ~ .iLabel {
          color: #dc2f55;
        }
        
        .submit {
          background-color: #08d;
          border-radius: 12px;
          border: 0;
          box-sizing: border-box;
          color: #eee;
          cursor: pointer;
          font-size: 18px;
          height: 50px;
          margin-top: 38px;
          text-align: center;
          width: 100%;
        }
        
        .submit:active {
          background-color: #06b;
        }
        .login{
            position: absolute;
            left: 50%;
            top: 50%;
            transform: translate(-50%,-50%);
        }
            </style>
</body>
</html>