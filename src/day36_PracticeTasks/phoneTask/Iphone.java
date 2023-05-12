package day36_PracticeTasks.phoneTask;

public class Iphone extends Phone {

    public void faceTime(long phoneNumber) {
        System.out.println(model + " is face timing with  number " + phoneNumber);
    }

    public void faceTime(String email) {
        System.out.println(model + " is face timing with email " + email);
    }

}

/*

1.2 Create a subclass of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()

 */