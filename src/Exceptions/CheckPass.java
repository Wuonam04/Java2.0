package Exceptions;

public class CheckPass {
    private int Password =12345;
    private int InPass;

    public int getPassword() {
        return Password;
    }

    public void setPassword(int password) {
        Password = password;
    }

    public int getInPass() {
        return InPass;
    }

    public void setInPass(int inPass) {
        InPass = inPass;
    }

    void CheckPass(int InPass, int Password) throws CustomTest {
       
        if (InPass != Password) {
            throw new CustomTest("Wrong Password");
        }
        else {
            System.out.println("Welcome User");
        }

    }
}
