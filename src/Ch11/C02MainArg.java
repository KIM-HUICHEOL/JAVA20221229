package Ch11;

public class C02MainArg {

	public static void main(String[] args) {
		
		//C02MainArg 우클릭 -> Run As -> Run Configurations -> Arguments -> Program Arguments -> ex) Hello My Name Is Hong -> Run

		System.out.println("배열 길이 : " + args.length);
		for(String s : args)
		{
			System.out.println(s);
		}

	}

}
