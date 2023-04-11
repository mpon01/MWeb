 
 
    function validate(){
            var fname = document.getElementById('fname').value;
            var sname = document.getElementById('sname').value;
            var dob = document.getElementById('dob').value;
            var email=document.getElementById('email').value;
            atpos = email.indexOf("@");
            dotpos = email.lastIndexOf(".");
            var phone=documentgetElementById('phone').value;
            
            if(document.adpage.fname.value==='' && document.adpage.sname.value==='' && document.adpage.dob.value==='' && document.adpage.gender.value==='' && 
                    document.adpage.email.value==='' && document.adpage.phone.value==='' && document.adpage.faculty.value==='' &&
                    document.adpage.stID.value==='' && document.adpage.passw.value==='' && document.adpage.passw2.value==='' ){
                    alert("Please fill in all fields.");
                    document.adpage.fname.focus();
                    document.adpage.sname.focus();
                    document.adpage.dob.focus();
                    document.adpage.gender.focus();
                    document.adpage.email.focus();
                    document.adpage.phone.focus();
                    document.adpage.faculty.focus();
                    document.adpage.stID.focus();
                    document.adpage.passw.focus();
                    document.adpage.passw2.focus();
                    return false;
            }
            
            
            if (document.adpage.fname.value===null || document.adpage.fname.value===''){  
                alert("First name cannot be left blank.");  
                document.adpage.fname.focus();
                return false;  
            }
            if(document.adpage.sname.value===null || document.adpage.sname.value===''){  
                alert("Surname cannot be left blank.");  
                document.adpage.sname.focus();
                return false; 
            }
            
            if(document.adpage.dob.value===null || document.adpage.dob.value===''){
                alert("Date Of Birth cannot be left blank.");  
                document.adpage.dob.focus();
                return false; 
            }
            
            if(document.adpage.gender.value===null || document.adpage.gender.value===''){
                alert("Gender cannot be left blank.");  
                document.adpage.gender.focus();
                return false;  
            }
            
            if(document.adpage.email.value===null || document.adpage.email.value===''){
                alert("E-mail Address cannot be left blank.");  
                document.adpage.email.focus(); 
                return false;  
            }
            
            if(atpos <1 || (dotpos - atpos < 2)){
                alert("Please enter valid email.");
                document.adpage.email.focus(); 
                return false;
            }
            
            if(document.adpage.phone.value===null || document.adpage.phone.value===''){
                alert("Phone Number cannot be left blank.");  
                document.adpage.phone.focus();
                return false;  
            }
            
            if(phone!==10){
                alert("Phone Number must be 10 digits.");
                document.adpage.phone.focus(); 
                return false;
            }
            
            if(document.adpage.faculty.value===null || document.adpage.faculty.value===''){
                alert("Faculty cannot be blank.");  
                document.adpage.faculty.focus();
                return false; 
            }

            if(document.adpage.stID.value===null || document.adpage.stID.value===''){
                alert("Student ID cannot be left blank.");  
                document.adpage.stID.focus();
                return false;  
            }
            
            if(document.adpage.passw.value===null || document.adpage.passw.value===''){
                alert("Student ID cannot be left blank.");  
                document.adpage.passw.focus();
                return false;  
            }
            
            if(document.adpage.passw2.value===null || document.adpage.passw2.value===''){
                alert("You must confirm password.");  
                document.adpage.passw2.focus();
                return false;  
            }

            if(document.adpage.passw2.value !== document.adpage.passw.value){
                alert("Passwords do not match.");
                document.adpage.passw.focus();
                document.adpage.passw2.focus();
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
            
            if(passwd2.value.length <=7){
                alert("Password too short! \n\Min:8 characters.");
                return false;
            }else if(passwd2.value.length>=20){
                alert("Password too long!\n\Max:20 characters.");
                return false;
            }

            if(passwd2.value === 'password'){
                alert("Password cannot be 'password'.");
                return false;
            }
        }


//            if(upload.exists()){
//                console.log('The file exists');
//            }else{
//                alert('Please select a file to upload');
//            }