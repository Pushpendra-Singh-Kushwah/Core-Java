package jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Contestant {

		public String phone =null;
		public String name = null;
		
		public Contestant(String p, String n) {
			phone=p;
			name = n;
		}
		
		public static void main(String[] args) {
			ArrayList<Contestant> al = new ArrayList<Contestant>();
			al.add(new Contestant("8962542650","Pushpendra"));
			al.add(new Contestant("9862692622","Satyam"));
			al.add(new Contestant("6252542651","Shiva"));
			al.add(new Contestant("8322142650","Anjali"));
			al.add(new Contestant("7987255000","Sakshi"));
			al.add(new Contestant("9893121251","Gauri"));
			al.add(new Contestant("8962533251","Lucky"));
			al.add(new Contestant("8962","wrong"));       // wrong no.
			al.add(new Contestant("8962542650","psk"));  // duplicate
			
			al.stream().map(e->e.phone).filter(e->e.length()==10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e->{
				Collections.shuffle(e);
				return e.stream();
				})).limit(3).forEach(e->System.out.println(e));
		}
}
