

    function validate(){
            var email = document.getElementById('email');
            var passwd = document.getElementById('passwd');
            
            if(document.myform.email.value === '' && document.myform.passwd.value === ''){
                alert("Email Address and Password are required to login.");
                document.myform.email.focus();
                document.myform.passwd.focus();
                return false;
            }
            
            if(document.myform.email.value === '' || document.myform.email.value === null){
                alert("Email Address is required.");
                document.myform.email.focus();
                return false;
            }

            if(document.myform.passwd.value === '' || document.myform.passwd.value === null){
                alert("Password is required.");
                document.myform.passwd.focus();
                return false;
            }
            
            if(passwd.value.length <=7){
                alert("Password too short! \n\Min:8 characters.");
                return false;
            }else if(passwd.value.length>=20){
                alert("Password too long!\n\Max:20 characters.");
                return false;
            }

            if(passwd.value === 'password'){
                alert("Password cannot be 'password'.");
                return false;
            }
            
    }
    
    function functionAlert(msg, myYes){
        var confirmBox = $("confirm");
        confirmBox.find(".message").text(msg);
        confirmBox.find(".yes").unbind().click(function(){
            confirmBox.hide();
        });
        confirmBox.find(".yes").click(myYes);
        confirmBox.show();
    }