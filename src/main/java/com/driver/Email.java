package com.driver;

public class Email {

    private  String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

        int count=newPassword.length();
        int flagU=0;
        int flagL=0;
        int flagD=0;
        int flagS=0;
        if(password.equals(oldPassword)){
            for(int i=0;i<count;i++){
                char ch=newPassword.charAt(i);
                if(Character.isUpperCase(ch))
                    flagU=1;
                if(Character.isLowerCase(ch))
                    flagL=1;
                if(Character.isDigit(ch))
                    flagD=1;
                if(!Character.isDigit(ch) && !Character.isAlphabetic(ch))
                    flagS=1;
            }

            if(count>=8 && flagD==1 && flagU==1 && flagL==1 && flagS==1)
                password=newPassword;
        }
    }
}
