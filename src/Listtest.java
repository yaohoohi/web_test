import java.util.ArrayList;
import java.util.List;

public class Listtest {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		//list.add("aaaa");
		for(String entry:list){
			System.out.println("jinlaile");
			System.out.println(entry);
		}
		for(int i=0 ;i<=list.size();i++){
			System.out.println("aaa");
		}
	}

}
