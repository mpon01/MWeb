

    function validate(){
            var fullname = document.getElementById('fullname');
            var email = document.getElementById('email');
            var passwd = document.getElementById('passwd');
            var passwd2 = document.getElementById('passwd2');
            
            if(document.myform.fullname.value === '' && document.myform.email.value === '' && document.myform.passwd.value === ''){
                alert("All fields are required for sign up.");
                document.myform.fullname.focus();
                document.myform.email.focus();
                document.myform.passwd.focus();
                return false;
            }
            
            if(document.myform.fullname.value === '' || document.myform.fullname.value === null){
                alert("Full Name is required.");
                document.myform.fullname.focus();
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
                document.myform.passwd.focus();
                return false;
            }else if(passwd.value.length>=20){
                alert("Password too long!\n\Max:20 characters.");
                document.myform.passwd.focus();
                return false;
            }

            if(passwd.value === 'password'){
                alert("Password cannot be 'password'.");
                document.myform.passwd.focus();
                return false;
            }
            
            if(passwd2.value !== passwd.value){
                alert("Passwords do not match.");
                document.myform.passwd.focus();
                document.myform.passwd2.focus();
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