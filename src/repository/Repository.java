package repository;

import java.util.ArrayList;
import java.util.List;

public class Repository<T> {
 public List<T>list;
 
 public Repository() {
	this.list = new ArrayList<T>();
 }
 
 public  void  add(T t) {
	 list.add(t);
	 
	 
 }
 
 public List<T> getList() {
	return list;
	 
 }
 
 public void delete(int index) {
	 list.remove(index);
 }
 
 public void printIndex() {
	 int cont = 0 ;
	 for (T t : list) {
		 System.out.println("[ "+cont+" ]"+t);
		 cont++;
		
	}
	 
	
 }
 
 public boolean emptyList() {
		return list.isEmpty();
	}


 
}
