package logic;

import java.util.ArrayList;
import java.util.List;

public class GenericWildCards {
	
	public <T> List<T> nCopies(int number , T object){
		List<T> list = new ArrayList<>();
		for(int i = 1 ; i <= number ; i++){
			list.add(object);
		}
		return list;
	}

	
	public void reverse(List<?> list){
		for(int i = list.size() ; i > 0 ; i--){
			System.out.print(list.get(i-1));
			System.out.print(",");
		}
		
	}
	
	public <T> void fill(List<? super T> list , T object){
		for(int i = 0 ; i < list.size();i++){
			list.set(i, object);
		}
		
		System.out.println("");
		System.out.println(list);
	}
	
	
}
