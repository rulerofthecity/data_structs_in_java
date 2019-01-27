package algo;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun1();


	}

	static void fun1(){

		List<Integer> list1 =  generateRamdonNumers(10);
		System.out.println();

	}

	static List<Integer> generateRamdonNumers(int n){
		Random random = new Random();
		List<Integer> randomNumbers = new ArrayList<Integer>();

		for(int i = 0; i < n; i++){
			randomNumbers.add(new Integer(random.nextInt(n)));
		}
		return randomNumbers;
	}

}
