package utsystem;

public class BodyMassIndexTest {

	public static void main(String[] args) {

		BodyMassIndex[] bmi = new BodyMassIndex[5];
		bmi[0] = new BodyMassIndex("鈴木一郎", 180, 65);
		bmi[1] = new BodyMassIndex("田中大輔", 170, 69 );
		bmi[2] = new BodyMassIndex("山田花子", 165, 45);
		bmi[3] = new BodyMassIndex("村田裕子", 169, 50);
		bmi[4] = new BodyMassIndex("早川紀子", 140, 46);

		for(int i = 0; i < bmi.length; i++){

			System.out.printf("%s  %d  %d  %.2f ", bmi[i].getName(), bmi[i].getHeight(), bmi[i].getWeight(), bmi[i].getBmi());

			if(bmi[i].getBmi() < 18.5){
					System.out.println(" やせすぎ");

			}else if(18.5 <= bmi[i].getBmi() && bmi[i].getBmi() < 25.0){
				System.out.println(" 標準");

			}else if(25.0 <= bmi[i].getBmi() && bmi[i].getBmi() <30.0 ){
				System.out.println(" 肥満（１度）");

			}else if(30.0 <= bmi[i].getBmi() && bmi[i].getBmi() < 35.0){
				System.out.println(" 肥満（２度）");

			}else if(35.0 <= bmi[i].getBmi() && bmi[i].getBmi() < 40.0){
				System.out.println(" 肥満（３度）");

			}else if(40.0 <= bmi[i].getBmi()){
				System.out.println(" 肥満（４度）");
			}
		}

	}

}
